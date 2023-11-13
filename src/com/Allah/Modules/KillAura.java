package com.Allah.Modules;

import org.lwjgl.input.Keyboard;

import com.Allah.ModuleSystem.Module;
import com.Allah.ModuleSystem.ModuleType;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;

public class KillAura extends Module {
	public Minecraft mc = Minecraft.getMinecraft();

	public KillAura() {
		super("KillAura", Keyboard.KEY_Z, ModuleType.Player);
	}

	public void onUpdate() {
		for(Entity ent: mc.world.playerEntities) {
			if (ent != mc.player && mc.player.getDistanceToEntity(ent) <= 5 && mc.player.getCooledAttackStrength(0) == 1) {
				mc.playerController.attackEntity(mc.player, ent);
				mc.player.swingArm(EnumHand.MAIN_HAND);
			}
		}
	}
}
