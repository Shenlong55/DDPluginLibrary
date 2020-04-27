package com.hackquest.shenlong55.ddpluginlibrary;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.Tag;

import com.google.common.collect.Sets;

public final class DDMaterialTags
{
	public static final Set<Material>	AXES;
	public static final Set<Material>	BLOCKS_OF_ORE;
	public static final Set<Material>	CONCRETE_BLOCKS;
	public static final Set<Material>	CONCRETE_POWDERS;
	public static final Set<Material>	DIRT_BLOCKS;
	public static final Set<Material>	GATES;
	public static final Set<Material>	GLAZED_TERRACOTTA_BLOCKS;
	public static final Set<Material>	MUSHROOM_BLOCKS;
	public static final Set<Material>	NON_WOODEN_PRESSURE_PLATES;
	public static final Set<Material>	NON_WOODEN_UTILITY_BLOCKS;
	public static final Set<Material>	ORE_BLOCKS;
	public static final Set<Material>	PICKAXES;
	public static final Set<Material>	REDSTONE_BLOCKS;
	public static final Set<Material>	SHOVELS;
	public static final Set<Material>	STONE_BLOCKS;
	public static final Set<Material>	SWORDS;
	public static final Set<Material>	TERRACOTTA_BLOCKS;
	public static final Set<Material>	WOOD_BLOCKS;
	public static final Set<Material>	WOODEN_UTILITY_BLOCKS;

	static
	{
		// List of axes
		final Set<Material> axeList = new HashSet<>();
		axeList.add(Material.DIAMOND_AXE);
		axeList.add(Material.GOLDEN_AXE);
		axeList.add(Material.IRON_AXE);
		axeList.add(Material.STONE_AXE);
		axeList.add(Material.WOODEN_AXE);
		AXES = Collections.unmodifiableSet(axeList);

		// List of blocks of ore
		final Set<Material> blocksOfOreList = new HashSet<>();
		blocksOfOreList.add(Material.COAL_BLOCK);
		blocksOfOreList.add(Material.DIAMOND_BLOCK);
		blocksOfOreList.add(Material.EMERALD_BLOCK);
		blocksOfOreList.add(Material.GOLD_BLOCK);
		blocksOfOreList.add(Material.IRON_BLOCK);
		blocksOfOreList.add(Material.LAPIS_BLOCK);
		blocksOfOreList.add(Material.QUARTZ_BLOCK);
		blocksOfOreList.add(Material.REDSTONE_BLOCK);
		BLOCKS_OF_ORE = Collections.unmodifiableSet(blocksOfOreList);

		// List of concrete blocks
		final Set<Material> concreteBlockList = new HashSet<>();
		concreteBlockList.add(Material.BLACK_CONCRETE);
		concreteBlockList.add(Material.BLUE_CONCRETE);
		concreteBlockList.add(Material.BROWN_CONCRETE);
		concreteBlockList.add(Material.CYAN_CONCRETE);
		concreteBlockList.add(Material.GRAY_CONCRETE);
		concreteBlockList.add(Material.GREEN_CONCRETE);
		concreteBlockList.add(Material.LIGHT_BLUE_CONCRETE);
		concreteBlockList.add(Material.LIGHT_GRAY_CONCRETE);
		concreteBlockList.add(Material.LIME_CONCRETE);
		concreteBlockList.add(Material.MAGENTA_CONCRETE);
		concreteBlockList.add(Material.ORANGE_CONCRETE);
		concreteBlockList.add(Material.PINK_CONCRETE);
		concreteBlockList.add(Material.PURPLE_CONCRETE);
		concreteBlockList.add(Material.RED_CONCRETE);
		concreteBlockList.add(Material.WHITE_CONCRETE);
		concreteBlockList.add(Material.YELLOW_CONCRETE);
		CONCRETE_BLOCKS = Collections.unmodifiableSet(concreteBlockList);

		// List of concrete powders
		final Set<Material> concretePowderList = new HashSet<>();
		concretePowderList.add(Material.BLACK_CONCRETE_POWDER);
		concretePowderList.add(Material.BLUE_CONCRETE_POWDER);
		concretePowderList.add(Material.BROWN_CONCRETE_POWDER);
		concretePowderList.add(Material.CYAN_CONCRETE_POWDER);
		concretePowderList.add(Material.GRAY_CONCRETE_POWDER);
		concretePowderList.add(Material.GREEN_CONCRETE_POWDER);
		concretePowderList.add(Material.LIGHT_BLUE_CONCRETE_POWDER);
		concretePowderList.add(Material.LIGHT_GRAY_CONCRETE_POWDER);
		concretePowderList.add(Material.LIME_CONCRETE_POWDER);
		concretePowderList.add(Material.MAGENTA_CONCRETE_POWDER);
		concretePowderList.add(Material.ORANGE_CONCRETE_POWDER);
		concretePowderList.add(Material.PINK_CONCRETE_POWDER);
		concretePowderList.add(Material.PURPLE_CONCRETE_POWDER);
		concretePowderList.add(Material.RED_CONCRETE_POWDER);
		concretePowderList.add(Material.WHITE_CONCRETE_POWDER);
		concretePowderList.add(Material.YELLOW_CONCRETE_POWDER);
		CONCRETE_POWDERS = Collections.unmodifiableSet(concretePowderList);

		// List of dirt blocks
		final Set<Material> dirtBlockList = new HashSet<>();
		dirtBlockList.add(Material.CLAY);
		dirtBlockList.add(Material.COARSE_DIRT);
		dirtBlockList.add(Material.DIRT);
		dirtBlockList.add(Material.FARMLAND);
		dirtBlockList.add(Material.GRASS_BLOCK);
		dirtBlockList.add(Material.GRASS_PATH);
		dirtBlockList.add(Material.GRAVEL);
		dirtBlockList.add(Material.MYCELIUM);
		dirtBlockList.add(Material.PODZOL);
		DIRT_BLOCKS = Collections.unmodifiableSet(dirtBlockList);

		// List of gates
		final Set<Material> gatesList = new HashSet<>();
		gatesList.add(Material.ACACIA_FENCE_GATE);
		gatesList.add(Material.BIRCH_FENCE_GATE);
		gatesList.add(Material.DARK_OAK_FENCE_GATE);
		gatesList.add(Material.JUNGLE_FENCE_GATE);
		gatesList.add(Material.OAK_FENCE_GATE);
		gatesList.add(Material.SPRUCE_FENCE_GATE);
		GATES = Collections.unmodifiableSet(gatesList);

		// List of glazed terracottas
		final Set<Material> glazedTerracottaList = new HashSet<>();
		glazedTerracottaList.add(Material.BLACK_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.BLUE_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.BROWN_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.CYAN_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.GRAY_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.GREEN_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.LIGHT_GRAY_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.LIME_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.MAGENTA_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.ORANGE_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.PINK_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.PURPLE_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.RED_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.WHITE_GLAZED_TERRACOTTA);
		glazedTerracottaList.add(Material.YELLOW_GLAZED_TERRACOTTA);
		GLAZED_TERRACOTTA_BLOCKS = Collections.unmodifiableSet(glazedTerracottaList);

		// List of mushroom blocks
		final Set<Material> mushroomBlockList = new HashSet<>();
		mushroomBlockList.add(Material.BROWN_MUSHROOM_BLOCK);
		mushroomBlockList.add(Material.MUSHROOM_STEM);
		mushroomBlockList.add(Material.RED_MUSHROOM_BLOCK);
		MUSHROOM_BLOCKS = Collections.unmodifiableSet(mushroomBlockList);

		// List of non-wooden pressure plates
		final Set<Material> nonWoodenPressurePlateList = new HashSet<>();
		nonWoodenPressurePlateList.add(Material.HEAVY_WEIGHTED_PRESSURE_PLATE);
		nonWoodenPressurePlateList.add(Material.LIGHT_WEIGHTED_PRESSURE_PLATE);
		nonWoodenPressurePlateList.add(Material.STONE_PRESSURE_PLATE);
		NON_WOODEN_PRESSURE_PLATES = Collections.unmodifiableSet(nonWoodenPressurePlateList);

		// List of non-wooden utility blocks
		final Set<Material> nonWoodenUtilityBlocksList = new HashSet<>();
		nonWoodenUtilityBlocksList.add(Material.ANVIL);
		nonWoodenUtilityBlocksList.add(Material.BELL);
		nonWoodenUtilityBlocksList.add(Material.BLAST_FURNACE);
		nonWoodenUtilityBlocksList.add(Material.BREWING_STAND);
		nonWoodenUtilityBlocksList.add(Material.CAULDRON);
		nonWoodenUtilityBlocksList.add(Material.CHIPPED_ANVIL);
		nonWoodenUtilityBlocksList.add(Material.DAMAGED_ANVIL);
		nonWoodenUtilityBlocksList.add(Material.DISPENSER);
		nonWoodenUtilityBlocksList.add(Material.DROPPER);
		nonWoodenUtilityBlocksList.add(Material.ENCHANTING_TABLE);
		nonWoodenUtilityBlocksList.add(Material.ENDER_CHEST);
		nonWoodenUtilityBlocksList.add(Material.FURNACE);
		nonWoodenUtilityBlocksList.add(Material.GRINDSTONE);
		nonWoodenUtilityBlocksList.add(Material.HOPPER);
		nonWoodenUtilityBlocksList.add(Material.IRON_BARS);
		nonWoodenUtilityBlocksList.add(Material.OBSERVER);
		nonWoodenUtilityBlocksList.add(Material.PISTON);
		nonWoodenUtilityBlocksList.add(Material.SMOKER);
		nonWoodenUtilityBlocksList.add(Material.SPAWNER);
		nonWoodenUtilityBlocksList.add(Material.STICKY_PISTON);
		nonWoodenUtilityBlocksList.add(Material.STONECUTTER);
		NON_WOODEN_UTILITY_BLOCKS = Collections.unmodifiableSet(nonWoodenUtilityBlocksList);

		// List of ore blocks
		final Set<Material> oreBlockList = new HashSet<>();
		oreBlockList.add(Material.COAL_ORE);
		oreBlockList.add(Material.DIAMOND_ORE);
		oreBlockList.add(Material.EMERALD_ORE);
		oreBlockList.add(Material.GOLD_ORE);
		oreBlockList.add(Material.IRON_ORE);
		oreBlockList.add(Material.NETHER_QUARTZ_ORE);
		oreBlockList.add(Material.LAPIS_ORE);
		oreBlockList.add(Material.REDSTONE_ORE);
		ORE_BLOCKS = Collections.unmodifiableSet(oreBlockList);

		// List of pickaxes
		final Set<Material> pickaxeList = new HashSet<>();
		pickaxeList.add(Material.DIAMOND_PICKAXE);
		pickaxeList.add(Material.GOLDEN_PICKAXE);
		pickaxeList.add(Material.IRON_PICKAXE);
		pickaxeList.add(Material.STONE_PICKAXE);
		pickaxeList.add(Material.WOODEN_PICKAXE);
		PICKAXES = Collections.unmodifiableSet(pickaxeList);

		// List of redstone blocks
		final Set<Material> redstoneBlocksList = new HashSet<>();
		redstoneBlocksList.add(Material.COMPARATOR);
		redstoneBlocksList.add(Material.DAYLIGHT_DETECTOR);
		redstoneBlocksList.add(Material.LEVER);
		redstoneBlocksList.add(Material.REDSTONE_TORCH);
		redstoneBlocksList.add(Material.REDSTONE_WALL_TORCH);
		redstoneBlocksList.add(Material.REDSTONE_WIRE);
		redstoneBlocksList.add(Material.REPEATER);
		REDSTONE_BLOCKS = Collections.unmodifiableSet(redstoneBlocksList);

		// List of shovels
		final Set<Material> shovelList = new HashSet<>();
		shovelList.add(Material.DIAMOND_SHOVEL);
		shovelList.add(Material.GOLDEN_SHOVEL);
		shovelList.add(Material.IRON_SHOVEL);
		shovelList.add(Material.STONE_SHOVEL);
		shovelList.add(Material.WOODEN_SHOVEL);
		SHOVELS = Collections.unmodifiableSet(shovelList);

		// List of stone type blocks
		final Set<Material> stoneBlocksList = new HashSet<>();
		stoneBlocksList.add(Material.ANDESITE);
		stoneBlocksList.add(Material.BONE_BLOCK);
		stoneBlocksList.add(Material.BRICKS);
		stoneBlocksList.add(Material.CHISELED_RED_SANDSTONE);
		stoneBlocksList.add(Material.CHISELED_SANDSTONE);
		stoneBlocksList.add(Material.CHISELED_STONE_BRICKS);
		stoneBlocksList.add(Material.COBBLESTONE);
		stoneBlocksList.add(Material.CRACKED_STONE_BRICKS);
		stoneBlocksList.add(Material.CUT_RED_SANDSTONE);
		stoneBlocksList.add(Material.CUT_SANDSTONE);
		stoneBlocksList.add(Material.DARK_PRISMARINE);
		stoneBlocksList.add(Material.DIORITE);
		stoneBlocksList.add(Material.END_STONE);
		stoneBlocksList.add(Material.END_STONE_BRICKS);
		stoneBlocksList.add(Material.GRANITE);
		stoneBlocksList.add(Material.INFESTED_CHISELED_STONE_BRICKS);
		stoneBlocksList.add(Material.INFESTED_COBBLESTONE);
		stoneBlocksList.add(Material.INFESTED_CRACKED_STONE_BRICKS);
		stoneBlocksList.add(Material.INFESTED_MOSSY_STONE_BRICKS);
		stoneBlocksList.add(Material.INFESTED_STONE);
		stoneBlocksList.add(Material.INFESTED_STONE_BRICKS);
		stoneBlocksList.add(Material.MAGMA_BLOCK);
		stoneBlocksList.add(Material.MOSSY_COBBLESTONE);
		stoneBlocksList.add(Material.MOSSY_STONE_BRICKS);
		stoneBlocksList.add(Material.NETHER_BRICK);
		stoneBlocksList.add(Material.NETHERRACK);
		stoneBlocksList.add(Material.OBSIDIAN);
		stoneBlocksList.add(Material.POLISHED_ANDESITE);
		stoneBlocksList.add(Material.POLISHED_DIORITE);
		stoneBlocksList.add(Material.POLISHED_GRANITE);
		stoneBlocksList.add(Material.PRISMARINE);
		stoneBlocksList.add(Material.PRISMARINE_BRICKS);
		stoneBlocksList.add(Material.PURPUR_BLOCK);
		stoneBlocksList.add(Material.PURPUR_PILLAR);
		stoneBlocksList.add(Material.RED_NETHER_BRICKS);
		stoneBlocksList.add(Material.RED_SANDSTONE);
		stoneBlocksList.add(Material.SANDSTONE);
		stoneBlocksList.add(Material.SMOOTH_RED_SANDSTONE);
		stoneBlocksList.add(Material.SMOOTH_SANDSTONE);
		stoneBlocksList.add(Material.SMOOTH_STONE);
		stoneBlocksList.add(Material.STONE);
		stoneBlocksList.add(Material.STONE_BRICKS);
		STONE_BLOCKS = Collections.unmodifiableSet(stoneBlocksList);

		// List of swords
		final Set<Material> swordsList = new HashSet<>();
		swordsList.add(Material.DIAMOND_SWORD);
		swordsList.add(Material.GOLDEN_SWORD);
		swordsList.add(Material.IRON_SWORD);
		swordsList.add(Material.STONE_SWORD);
		swordsList.add(Material.WOODEN_SWORD);
		SWORDS = Collections.unmodifiableSet(swordsList);

		// List of terracotta blocks
		final Set<Material> terracottaBlockList = new HashSet<>();
		terracottaBlockList.add(Material.BLACK_TERRACOTTA);
		terracottaBlockList.add(Material.BLUE_TERRACOTTA);
		terracottaBlockList.add(Material.BROWN_TERRACOTTA);
		terracottaBlockList.add(Material.CYAN_TERRACOTTA);
		terracottaBlockList.add(Material.GRAY_TERRACOTTA);
		terracottaBlockList.add(Material.GREEN_TERRACOTTA);
		terracottaBlockList.add(Material.LIGHT_BLUE_TERRACOTTA);
		terracottaBlockList.add(Material.LIGHT_GRAY_TERRACOTTA);
		terracottaBlockList.add(Material.LIME_TERRACOTTA);
		terracottaBlockList.add(Material.MAGENTA_TERRACOTTA);
		terracottaBlockList.add(Material.ORANGE_TERRACOTTA);
		terracottaBlockList.add(Material.PINK_TERRACOTTA);
		terracottaBlockList.add(Material.PURPLE_TERRACOTTA);
		terracottaBlockList.add(Material.RED_TERRACOTTA);
		terracottaBlockList.add(Material.TERRACOTTA);
		terracottaBlockList.add(Material.WHITE_TERRACOTTA);
		terracottaBlockList.add(Material.YELLOW_TERRACOTTA);
		TERRACOTTA_BLOCKS = Collections.unmodifiableSet(terracottaBlockList);

		// List of wood blocks
		final Set<Material> woodBlockList = new HashSet<>();
		woodBlockList.add(Material.ACACIA_WOOD);
		woodBlockList.add(Material.BIRCH_WOOD);
		woodBlockList.add(Material.DARK_OAK_WOOD);
		woodBlockList.add(Material.JUNGLE_WOOD);
		woodBlockList.add(Material.OAK_WOOD);
		woodBlockList.add(Material.SPRUCE_WOOD);
		woodBlockList.add(Material.STRIPPED_ACACIA_WOOD);
		woodBlockList.add(Material.STRIPPED_DARK_OAK_WOOD);
		woodBlockList.add(Material.STRIPPED_JUNGLE_WOOD);
		woodBlockList.add(Material.STRIPPED_OAK_WOOD);
		woodBlockList.add(Material.STRIPPED_SPRUCE_WOOD);
		WOOD_BLOCKS = Collections.unmodifiableSet(woodBlockList);

		// List of wooden utility blocks
		final Set<Material> woodenUtilityBlockList = new HashSet<>();
		woodenUtilityBlockList.add(Material.BARREL);
		woodenUtilityBlockList.add(Material.BEEHIVE);
		woodenUtilityBlockList.add(Material.BOOKSHELF);
		woodenUtilityBlockList.add(Material.CARTOGRAPHY_TABLE);
		woodenUtilityBlockList.add(Material.CHEST);
		woodenUtilityBlockList.add(Material.CRAFTING_TABLE);
		woodenUtilityBlockList.add(Material.COMPOSTER);
		woodenUtilityBlockList.add(Material.FLETCHING_TABLE);
		woodenUtilityBlockList.add(Material.JUKEBOX);
		woodenUtilityBlockList.add(Material.LADDER);
		woodenUtilityBlockList.add(Material.LECTERN);
		woodenUtilityBlockList.add(Material.LOOM);
		woodenUtilityBlockList.add(Material.NOTE_BLOCK);
		woodenUtilityBlockList.add(Material.SCAFFOLDING);
		woodenUtilityBlockList.add(Material.SMITHING_TABLE);
		woodenUtilityBlockList.add(Material.TRAPPED_CHEST);
		woodenUtilityBlockList.add(Material.TRIPWIRE_HOOK);
		WOODEN_UTILITY_BLOCKS = Collections.unmodifiableSet(woodenUtilityBlockList);
	}

	public static Set<Material> getTaggedMaterials(final String string)
	{
		switch (string.toUpperCase())
		{
			case "BANNERS":
				return Tag.BANNERS.getValues();
			case "BEDS":
				return Tag.BEDS.getValues();
			case "BLOCKS_OF_ORE":
				return BLOCKS_OF_ORE;
			case "BUTTONS":
				return Tag.BUTTONS.getValues();
			case "CARPETS":
				return Tag.CARPETS.getValues();
			case "CONCRETE_BLOCKS":
				return CONCRETE_BLOCKS;
			case "CONCRETE_POWDERS":
				return CONCRETE_POWDERS;
			case "CORAL_BLOCKS":
				return Tag.CORAL_BLOCKS.getValues();
			case "DIRT_BLOCKS":
				return DIRT_BLOCKS;
			case "DOORS":
				return Tag.DOORS.getValues();
			case "FENCES":
				return Tag.FENCES.getValues();
			case "FLOWERS":
				return Tag.FLOWERS.getValues();
			case "GATES":
				return GATES;
			case "GLAZED_TERRACOTTA":
				return GLAZED_TERRACOTTA_BLOCKS;
			case "LOGS":
				return Tag.LOGS.getValues();
			case "MUSHROOM_BLOCKS":
				return MUSHROOM_BLOCKS;
			case "NON_WOODEN_SLABS":
				return Sets.difference(Tag.SLABS.getValues(), Tag.WOODEN_SLABS.getValues());
			case "NON_WOODEN_STAIRS":
				return Sets.difference(Tag.STAIRS.getValues(), Tag.WOODEN_STAIRS.getValues());
			case "NON_WOODEN_UTILITY_BLOCKS":
				return NON_WOODEN_UTILITY_BLOCKS;
			case "PLANKS":
				return Tag.PLANKS.getValues();
			case "FLOWER_POTS":
				return Tag.FLOWER_POTS.getValues();
			case "ORE_BLOCKS":
				return ORE_BLOCKS;
			case "PRESSURE_PLATES":
				return Sets.union(Tag.WOODEN_PRESSURE_PLATES.getValues(), NON_WOODEN_PRESSURE_PLATES);
			case "RAILS":
				return Tag.RAILS.getValues();
			case "REDSTONE_BLOCKS":
				return REDSTONE_BLOCKS;
			case "SAND_BLOCKS":
				return Tag.SAND.getValues();
			case "SIGNS":
				return Tag.SIGNS.getValues();
			case "STONE_BLOCKS":
				return STONE_BLOCKS;
			case "TERRACOTTA_BLOCKS":
				return TERRACOTTA_BLOCKS;
			case "TRAPDOORS":
				return Tag.TRAPDOORS.getValues();
			case "WALLS":
				return Tag.WALLS.getValues();
			case "WALL_SIGNS":
				return Tag.WALL_SIGNS.getValues();
			case "WOOD_BLOCKS":
				return WOOD_BLOCKS;
			case "WOODEN_SLABS":
				return Tag.WOODEN_SLABS.getValues();
			case "WOODEN_STAIRS":
				return Tag.WOODEN_STAIRS.getValues();
			case "WOODEN_UTILITY_BLOCKS":
				return WOODEN_UTILITY_BLOCKS;
			default:
				return null;
		}
	}
}