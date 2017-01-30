package com.Geam.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<GeamObject> object  = new LinkedList<GeamObject>();
	
	public void tick(){
		for(int i = 0; i < object.size(); i++){
			GeamObject tempObject = object.get(i);
			
			tempObject.tick();
		
		}
	}
	public void render(Graphics g){
		for(int i = 0; i < object.size(); i++){
			GeamObject tempObject = object.get(i);
			
			tempObject.render(g);
		
		}
	}
	public void addObject(GeamObject object){
		this.object.add(object);
	}
	
	public void removeObject(GeamObject object){
		this.object.remove(object);
		
	}
}

