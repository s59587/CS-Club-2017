package com.Geam.main;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GeamObject {
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		speedX = 1;
	}

	
	
	public void tick(){
		x += speedX;
		y += speedY;
		
	}
	
	public void render(Graphics g) {
		if(id == ID.Player)g.setColor(Color.white);
		else if(id == ID.Player2)g.setColor(Color.blue);
		g.fillRect(x,  y, 32, 32);
	}
}
