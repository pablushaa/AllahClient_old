package com.Allah.Modules;

import org.lwjgl.input.Keyboard;

import com.Allah.ModuleSystem.Module;
import com.Allah.ModuleSystem.ModuleType;

import net.minecraft.client.Minecraft;

public class Light extends Module {

	public Light() {
		super("Light", Keyboard.KEY_V, ModuleType.Render);
	}
	
	float gamma;
	
	public void onEnable() {
		Minecraft mc = Minecraft.getMinecraft();
		gamma = mc.gameSettings.gammaSetting;
		mc.gameSettings.gammaSetting = 1000000f;
	}
	
	public void onDisable() {
		Minecraft mc = Minecraft.getMinecraft();
		mc.gameSettings.gammaSetting = gamma;
	}
}
