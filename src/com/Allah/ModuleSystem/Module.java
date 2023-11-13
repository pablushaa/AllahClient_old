package com.Allah.ModuleSystem;

public class Module {
	private String name;
	private int bind;
	private boolean enabled;

	private ModuleType type;

	public Module(String name, int bind, ModuleType type) {
		this.name = name;
		this.bind = bind;
		this.type = type;
	}

	public void onRender2D() {
	}

	public void toggle() {
		this.enabled = !this.enabled;
		if(this.enabled) {
			this.onEnable();
		} else {
			this.onDisable();
		}
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void onEnable() {
	}

	public void onDisable() {
	}

	public ModuleType getType() {
		return this.type;
	}

	public int getBind() {
		return this.bind;
	}

	public String getName() {
		return this.name;
	}

	public void onUpdate() {
	}
}
