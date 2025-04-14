package me.villagerunknown.cursedcoins.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import me.villagerunknown.cursedcoins.CursedcoinsConfigData;

public class ModMenuIntegration implements ModMenuApi {
	
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> AutoConfig.getConfigScreen(CursedcoinsConfigData.class, parent).get();
	}
	
}
