package com.Allah.Modules;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.Allah.AllahClient;
import com.Allah.ModuleSystem.Module;
import com.Allah.ModuleSystem.ModuleType;

import net.minecraft.client.Minecraft;

public class HUD extends Module {
	public static Module mod;
	Minecraft mc = Minecraft.getMinecraft();

	public HUD() {
		super("HUD", Keyboard.KEY_NONE, ModuleType.Render);
		mod = this;
	}

	public void onRender2D () {
		GL11.glPushMatrix();
		
		int offsetFPS = mc.displayWidth / 2 - 45;
		int offsetName = mc.displayHeight / 2 - 10;

		mc.fontRendererObj.drawStringWithShadow(AllahClient.clientName, 2, 2, 0xf3b48b);
		mc.fontRendererObj.drawStringWithShadow("FPS: " + Integer.toString(mc.getDebugFPS()), offsetFPS, 2, 0xf3b48b);
		mc.fontRendererObj.drawStringWithShadow("Salam, " + mc.getSession().getUsername(), 2, offsetName, 0xffffff);
		int height = 7;
		for(Module m : AllahClient.manager.getModules()) {
			if(m.isEnabled()) {
				height = height + 10;
				mc.fontRendererObj.drawStringWithShadow(m.getName(), 2, height, 0xd0b7ac);
			}
		}
		
		GL11.glColor4f(1f, 1f, 1f, 1f);
		GL11.glPopMatrix();
	}
}
