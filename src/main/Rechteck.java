package main;

import javafx.scene.canvas.GraphicsContext;

public class Rechteck {
	private final double h = 50, w = 50, 
	sSpeed = 4, speedMax = 20,
	grav = 0.5;
	
	private double x,
	y,
	
	speed = sSpeed;
	
	private GraphicsContext gc;
	
	public Rechteck(GraphicsContext gc, double x, double y) {
		this.gc = gc;
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		if (y < gc.getCanvas().getHeight()) {
			y += speed;
			if (speed < speedMax)
			speed += grav;
		} else {
			y = 0;
			speed = sSpeed;
		}
	}
	
	public void show() {
		gc.fillRect(x, y, h, w);
	}
}