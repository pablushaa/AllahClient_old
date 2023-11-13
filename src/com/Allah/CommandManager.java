package com.Allah;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;

public class CommandManager {
	public static String prefix = "[AllahClient] ";

	public void onCommand(String cmd) {
		if(cmd.contains(";help")) {
			showMessage("еблан тебе никто не поможет)))");
		}
	}
	public static void showMessage(String text) {
		Minecraft mc = Minecraft.getMinecraft();
		mc.ingameGUI.getChatGUI().printChatMessage(new TextComponentString(prefix + text));
	}
}