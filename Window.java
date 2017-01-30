package com.Geam.main;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

import org.ietf.jgss.GSSName;

public class Window extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Window(int width, int height, String title, Geam geam) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.add((Component) geam);
		frame.setVisible(true);
		((Geam) geam).start();
	}
}
