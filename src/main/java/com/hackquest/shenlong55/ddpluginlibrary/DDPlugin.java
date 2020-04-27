package com.hackquest.shenlong55.ddpluginlibrary;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class DDPlugin extends JavaPlugin
{
	private boolean debugging;

	public void logDebug(final String message)
	{
		if (debugging)
		{
			getLogger().info("DEBUG - " + message);
		}
	}

	@Override
	public void onEnable()
	{
		preEnable();
		registerCommands();
		registerEvents();
	}

	public void registerCommand(final String name, final CommandExecutor executor)
	{
		getCommand(name).setExecutor(executor);
	}

	public void registerEvent(final Listener listener)
	{
		getServer().getPluginManager().registerEvents(listener, this);
	}

	public void setDebugging(final boolean debugging)
	{
		this.debugging = debugging;
	}

	public YamlConfiguration updateConfiguration(final String configName)
	{
		final File configFile = new File(getDataFolder(), configName);
		if (!configFile.exists())
		{
			logDebug("Saving default config: " + configName);
			saveResource(configName, false);
		}
		else
		{
			final InputStreamReader defaultConfigReader = new InputStreamReader(getResource(configName));
			final YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(defaultConfigReader);
			final YamlConfiguration fileConfig = YamlConfiguration.loadConfiguration(configFile);

			final Set<String> fileConfigKeys = fileConfig.getKeys(true);
			final Set<String> defaultConfigKeys = defaultConfig.getKeys(true);
			if (!fileConfigKeys.equals(defaultConfigKeys))
			{
				final YamlConfiguration tempConfig = new YamlConfiguration();

				logDebug("Updating config file: " + configName);
				for (final String key : defaultConfigKeys)
				{
					tempConfig.set(key, (fileConfig.contains(key) ? fileConfig.get(key) : defaultConfig.get(key)));
				}

				try
				{
					tempConfig.save(configFile);
				}
				catch (final IOException e)
				{
					getLogger().warning("Error occured while attempting to save config file: " + configName);
					e.printStackTrace();
				}
			}
		}

		return YamlConfiguration.loadConfiguration(configFile);
	}

	protected void preEnable()
	{}

	protected void registerCommands()
	{}

	protected void registerEvents()
	{}
}