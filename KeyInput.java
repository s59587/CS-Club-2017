package com.Geam.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	private Handler handler;
	
	public KeyInput(Handler hanlder){
		this.handler = handler;
		
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		System.out.println(key);
		
		for(int i = 0; i < handler.object.size(); i++){
			GeamObject tempObject = handler.object.get(i);
			
			//if(tempObject.getId() == ID.Player){
				//key events for player 1
				
				//if(key == KeyEvent.VK_W) tempObject.setId();
			}
		}
		

	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		
	}
}
