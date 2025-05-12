package me.villagerunknown.cursedcoins;

import me.villagerunknown.cursedcoins.feature.CursedCoinItemsFeature;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import me.villagerunknown.villagercoin.Villagercoin;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Cursedcoins implements ModInitializer {
	
	public static PlatformMod<?> MOD = Platform.register("cursedcoins", Cursedcoins.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	
	@Override
	public void onInitialize() {
		// # Load Villager Coin
		Villagercoin.load();
		
		// # Initialize addon mod with Platform
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "cursed-coin-items", CursedCoinItemsFeature::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
