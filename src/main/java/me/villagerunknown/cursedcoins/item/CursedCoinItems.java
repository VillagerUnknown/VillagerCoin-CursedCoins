package me.villagerunknown.cursedcoins.item;

import me.villagerunknown.villagercoin.effect.StewEffects;
import me.villagerunknown.villagercoin.feature.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTables;

import java.util.List;
import java.util.Set;

public class CursedCoinItems {
	
//	public static final Item CURSED_COPPER_CREEPER_COIN;
	public static final Item CURSED_COPPER_IRON_GOLEM_COIN;
	public static final Item CURSED_COPPER_ZOMBIE_COIN;
	
	public static final Item CURSED_IRON_GOLEM_COIN;
	public static final Item CURSED_IRON_VEX_COIN;
	public static final Item CURSED_IRON_SILVERFISH_COIN;
	
	public static final Item CURSED_GOLD_BLAZE_COIN;
	public static final Item CURSED_GOLD_GHAST_COIN;
	public static final Item CURSED_GOLD_MAGMA_CUBE_COIN;
	public static final Item CURSED_GOLD_WITHER_COIN;
	
//	public static final Item CURSED_EMERALD_CREEPER_COIN;
	public static final Item CURSED_EMERALD_PILLAGER_COIN;
	public static final Item CURSED_EMERALD_SLIME_COIN;
	public static final Item CURSED_EMERALD_IRON_GOLEM_COIN;
	
	public static final Item CURSED_NETHERITE_ENDER_DRAGON_COIN;
//	public static final Item CURSED_NETHERITE_ENDERMAN_COIN;
	public static final Item CURSED_NETHERITE_WITHER_COIN;
	public static final Item CURSED_NETHERITE_SKULL_CROSSBONES_COIN;
	
	public CursedCoinItems() {}
	
	static {
//		CURSED_COPPER_CREEPER_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_copper_creeper_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.COPPER_LOOT_TABLES, MobsDropCoinsFeature.COPPER_MOB_DROPS  );
		CURSED_COPPER_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_copper_iron_golem_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM), List.of(StewEffects.SLOWNESS) );
		CURSED_COPPER_ZOMBIE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_copper_zombie_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.ANCIENT_CITY_CHEST), Set.of(EntityType.ZOMBIE), List.of(StewEffects.HUNGER) );
		
		CURSED_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_iron_golem_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM), List.of(StewEffects.SLOWNESS)  );
		CURSED_IRON_VEX_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_iron_vex_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.WOODLAND_MANSION_CHEST), Set.of(EntityType.VEX), List.of(StewEffects.BAD_OMEN,StewEffects.LEVITATION) );
		CURSED_IRON_SILVERFISH_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_iron_silverfish_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.STRONGHOLD_LIBRARY_CHEST), Set.of(EntityType.SILVERFISH), List.of(StewEffects.INFESTED) );
		
		CURSED_GOLD_BLAZE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_gold_blaze_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.NETHER_BRIDGE_CHEST), Set.of(EntityType.BLAZE), List.of(StewEffects.WEAKNESS,StewEffects.LEVITATION) );
		CURSED_GOLD_GHAST_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_gold_ghast_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.GHAST), List.of(StewEffects.LEVITATION) );
		CURSED_GOLD_MAGMA_CUBE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_gold_magma_cube_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.MAGMA_CUBE), List.of(StewEffects.WEAKNESS) );
		CURSED_GOLD_WITHER_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_gold_wither_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.NETHER_BRIDGE_CHEST), Set.of(EntityType.WITHER,EntityType.WITHER_SKELETON), List.of(StewEffects.WITHER,StewEffects.LEVITATION) );
		
//		CURSED_EMERALD_CREEPER_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_emerald_creeper_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.EMERALD_LOOT_TABLES, MobsDropCoinsFeature.EMERALD_MOB_DROPS );
		CURSED_EMERALD_PILLAGER_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_emerald_pillager_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.PILLAGER_OUTPOST_CHEST,LootTables.WOODLAND_MANSION_CHEST), Set.of(EntityType.PILLAGER), List.of(StewEffects.BAD_OMEN) );
		CURSED_EMERALD_SLIME_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_emerald_slime_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.SLIME), List.of(StewEffects.OOZING) );
		CURSED_EMERALD_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_emerald_iron_golem_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM), List.of(StewEffects.SLOWNESS) );
		
		CURSED_NETHERITE_ENDER_DRAGON_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_netherite_ender_dragon_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.ENDER_DRAGON), List.of(StewEffects.HUNGER,StewEffects.LEVITATION) );
//		CURSED_NETHERITE_ENDERMAN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_netherite_enderman_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.NETHERITE_LOOT_TABLES, MobsDropCoinsFeature.NETHERITE_MOB_DROPS );
		CURSED_NETHERITE_WITHER_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_netherite_wither_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.WITHER), List.of(StewEffects.WITHER,StewEffects.LEVITATION) );
		CURSED_NETHERITE_SKULL_CROSSBONES_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "cursed_netherite_skull_crossbones_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.NETHERITE_LOOT_TABLES, MobsDropCoinsFeature.NETHERITE_MOB_DROPS, List.of(StewEffects.INSTANT_DAMAGE) );
	}
	
}
