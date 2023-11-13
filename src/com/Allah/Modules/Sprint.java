package com.Allah.Modules;

import org.lwjgl.input.Keyboard;

import com.Allah.ModuleSystem.Module;
import com.Allah.ModuleSystem.ModuleType;

import net.minecraft.client.Minecraft;

public class Sprint extends Module {
	
	Minecraft mc = Minecraft.getMinecraft();

	public Sprint() {
		super("Sprint", Keyboard.KEY_G, ModuleType.Movement);
	}
	
	public void onUpdate() {
		if(this.isEnabled()) {
			mc.gameSettings.keyBindForward.pressed = true;
			mc.gameSettings.keyBindSprint.pressed = true;
		}
	}
	
	public void onDisable() {
		mc.gameSettings.keyBindForward.pressed = false;
		mc.gameSettings.keyBindSprint.pressed = false;
		super.onDisable();
	}
}
