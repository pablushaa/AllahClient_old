package com.Allah;

import java.io.IOException;

import net.minecraft.client.gui.GuiScreen;

public class ClickGUI extends GuiScreen {
	
	public static final ClickGUI HELPER = new ClickGUI();
	
	public ClickGUI() {
		
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
 	
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		super.mouseClicked(mouseX, mouseY, mouseButton);
	}
	
	@Override
	protected void mouseReleased(int mouseX, int mouseY, int state) {
		super.mouseReleased(mouseX, mouseY, state);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}
