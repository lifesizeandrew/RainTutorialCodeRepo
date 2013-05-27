package net.lifesizedesign.rain.level.tile;

import net.lifesizedesign.rain.graphics.Screen;
import net.lifesizedesign.rain.graphics.Sprite;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnBrickTile;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnHedgeTile;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnFloorTile;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnGrassTile;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnRockTile;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnStoneTile;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnWallTile;
import net.lifesizedesign.rain.level.tile.spawn_level.SpawnWaterTile;

public class Tile {

	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile hedge = new HedgeTile(Sprite.hedge);
	public static Tile wall = new WallTile(Sprite.wall);
	public static Tile floor = new FloorTile(Sprite.floor);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
	public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
	public static Tile spawn_rock = new SpawnRockTile(Sprite.spawn_rock);
	public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);
	public static Tile spawn_wall = new SpawnWallTile(Sprite.spawn_wall);
	public static Tile spawn_brick = new SpawnBrickTile(Sprite.spawn_brick);
	public static Tile spawn_stone = new SpawnStoneTile(Sprite.spawn_stone);
	
	public static final int col_spawn_grass = 0xff00ff00;
	public static final int col_spawn_hedge = 0xff20a800;
	public static final int col_spawn_water = 0xff0000ff;
	public static final int col_spawn_rock = 0;
	public static final int col_spawn_floor = 0xff787878;
	public static final int col_spawn_wall = 0xff000000;
	public static final int col_spawn_brick = 0;
	public static final int col_spawn_stone = 0xffa48000;
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {
	}

	public boolean solid() {
		return false;
	}
}