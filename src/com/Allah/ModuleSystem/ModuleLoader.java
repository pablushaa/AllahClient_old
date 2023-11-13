package com.Allah.ModuleSystem;

import java.util.ArrayList;

import com.Allah.Modules.*;

public class ModuleLoader {
	public static ArrayList<Module> modules = new ArrayList<>();

	public void loadModules() {
		this.addModule(new HUD());
		this.addModule(new Light());
		this.addModule(new Sprint());
		this.addModule(new KillAura());
		this.addModule(new CrystalAura());
		System.out.println("[AllahClient] Activated! vsem HARAM pizdec)))))");
	}

	public void addModule(Module m) {
		this.modules.add(m);
	}

	public ArrayList<Module> getModules() {
		return this.modules;
	}
}