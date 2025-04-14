package me.villagerunknown.cursedcoins.loader;

import me.villagerunknown.cursedcoins.item.CursedCoinItems;
import me.villagerunknown.villagercoin.feature.InventoryEffectCoinFeature;

public class InventoryEffectCoinFeatureLoader {
	
	public static void execute() {
		InventoryEffectCoinFeature.execute();
		new CursedCoinItems();
	}
	
}
