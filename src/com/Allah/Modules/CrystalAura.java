package com.Allah.Modules;

import org.lwjgl.input.Keyboard;

import com.Allah.ModuleSystem.Module;
import com.Allah.ModuleSystem.ModuleType;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.util.EnumHand;

public class CrystalAura extends Module {

	public Minecraft mc = Minecraft.getMinecraft();

	public CrystalAura() {
		super("Crystal Aura", Keyboard.KEY_X , ModuleType.Combat);
	}
	
	public void onUpdate() {
		for(Entity ent: mc.world.loadedEntityList) {
			if(ent instanceof EntityEnderCrystal) {
				if (mc.player.getDistanceToEntity(ent) <= 5) {
					mc.playerController.attackEntity(mc.player, ent);
					mc.player.swingArm(EnumHand.MAIN_HAND);
				}
			}
		}
	}

}
