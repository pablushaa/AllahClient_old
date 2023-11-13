package com.Allah.Modules;

import club.minnced.discord.rpc.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfiguration;
import net.minecraft.client.main.GameConfiguration.DisplayInformation;
import net.minecraft.client.main.GameConfiguration;

public class RPC {
	private static final String APPLICATION_ID = "1171528099779858502";

	public static void main() {
		Minecraft mc = Minecraft.getMinecraft();

		DiscordRPC discordRPC = DiscordRPC.INSTANCE;
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        discordRPC.Discord_Initialize(APPLICATION_ID, handlers, true, null);

        DiscordRichPresence presence = new DiscordRichPresence();
        presence.startTimestamp = System.currentTimeMillis() / 1000;
        presence.details = "Playing Minecraft 1.12.2";
        presence.largeImageKey = "allahclient";
        presence.largeImageText = "1.12.2";
        presence.state = "Menus";

        discordRPC.Discord_UpdatePresence(presence);
        System.out.println("[AllahClient] RPC Started!");

        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {

                discordRPC.Discord_UpdatePresence(presence);
                try {
                	if(!mc.isSingleplayer()) {
                    	try {
                    		presence.state = mc.getCurrentServerData().serverIP;
                    	}
                    	catch (Exception e) {
                    		presence.state = "Menus";
                    	}
                    }
                    else {
                    	presence.state = "Singleplayer";
                    }
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {}
            }
        });
        thread.start();
	}
}
