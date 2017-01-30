package com.Geam.main;

import java.awt.Graphics;

/**
 * @author S59587
 *
 */
public abstract class GeamObject {

	protected int x, y;
	protected ID id;
	protected int speedX, speedY;
	
	public GeamObject(int x, int y, ID id){
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getx(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setId(ID id){
		this.id = id;
	}
	public ID get(){
		return id;
	}
	public void setSpeedX(int speedX){
		this.speedX = speedX;
	}
	public void setSpeedY(int speedY){
		this.speedY = speedY;
	}
	public int getspeedX(){
		return speedX;
	}
	public int getSpeedY(){
		return speedY;
	}
	
}
