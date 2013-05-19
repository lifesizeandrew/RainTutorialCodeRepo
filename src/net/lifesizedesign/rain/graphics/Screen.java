package net.lifesizedesign.rain.graphics;

public class Screen {

	private int width, height;
	public int[] pixels;
	
	int xtime = 0,  ytime = 0;
	int counter = 0;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render() {
		for (int y = 0; y < height; y++){
			//if (y <  0 || y >= height) break;
			for (int x = 0; x < width; x++) {
				//if (x < 0 || x >= width) break;
				pixels[x + y * width] = 0x0089db;
			}
		}
	}
	
}
