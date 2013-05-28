package net.lifesizedesign.rain.entity.projectile;

import net.lifesizedesign.rain.entity.Entity;
import net.lifesizedesign.rain.graphics.Sprite;

public abstract class Projectile extends Entity {

	protected final int xOrigin, yOrigin;
	protected double angle;
	protected Sprite sprite;
	protected double nx, ny;
	protected double speed, rateOfFire, range, damage;
	
	public Projectile(int x, int y, int dir) {
		xOrigin = x;
		yOrigin = y;
		angle = dir;
	}
	
	protected void move() {
		
	}
	
}
