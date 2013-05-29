package net.lifesizedesign.rain.entity.projectile;

import net.lifesizedesign.rain.graphics.Screen;
import net.lifesizedesign.rain.graphics.Sprite;

public class WizardProjectile extends Projectile {

	public WizardProjectile(int x, int y, double dir) {
		super(x, y, dir);
		range = random.nextInt(100) + 150;
		speed = random.nextInt(2) + 3;
		damage = 20;
		rateOfFire = 15;
		sprite = Sprite.projectile_wizard;
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}

	public void update() {
		move();
	}

	protected void move() {
		x += nx;
		y += ny;
		if (distance() > range) remove();
	}

	private double distance() {
		double dist = 0;
		dist = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x)) + ((yOrigin - y) * (yOrigin - y)));
		return Math.abs(dist);
	}

	public void render(Screen screen) {
		screen.renderProjectile((int) x - 8, (int) y - 8, this);
	}

}
