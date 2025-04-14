package me.villagerunknown.cursedcoins;

import me.villagerunknown.cursedcoins.loader.InventoryEffectCoinFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Cursedcoins implements ModInitializer {
	
	public static PlatformMod<CursedcoinsConfigData> MOD = Platform.register("cursedcoins", Cursedcoins.class, CursedcoinsConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static CursedcoinsConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "inventoryEffectCoinFeatureLoader", InventoryEffectCoinFeatureLoader::execute );
	}
	
}
