package net.lifesizedesign.rain.level.tile.spawn_level;

import net.lifesizedesign.rain.graphics.Screen;
import net.lifesizedesign.rain.graphics.Sprite;
import net.lifesizedesign.rain.level.tile.Tile;

public class SpawnStoneTile extends Tile {

	public SpawnStoneTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
