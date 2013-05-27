package net.lifesizedesign.rain.level.tile;

import net.lifesizedesign.rain.graphics.Screen;
import net.lifesizedesign.rain.graphics.Sprite;

public class FloorTile extends Tile {

	public FloorTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
