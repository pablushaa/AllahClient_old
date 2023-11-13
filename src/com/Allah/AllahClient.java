package com.Allah;

import com.Allah.ModuleSystem.Module;
import com.Allah.ModuleSystem.ModuleLoader;
import com.Allah.Modules.HUD;
import com.Allah.Modules.RPC;

import net.minecraft.client.Minecraft;

public class AllahClient { // прив не читай этот код пж
	public static String clientName = "AllahClient v1.0";
	public static ModuleLoader manager;
	public static Minecraft mc;

	public void startClient(Minecraft minecraft) {
		mc = minecraft;
		manager = new ModuleLoader();
		manager.loadModules();
		autoStart();
	}

	public void autoStart() {
		HUD.mod.toggle();
	}

	public static void onKeyPress(int bind) {
		for(Module m : manager.getModules()) {
			if(m.getBind() == bind) {
				m.toggle();
			}
		}
	}
}
