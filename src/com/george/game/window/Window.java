package com.george.game.window;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.george.game.Game;
import com.george.game.entities.Player;

public class Window
{
    public int width;
    public int height;
    String title;
    java.awt.Container con;
    JPanel health;
    public JProgressBar bar;
    public int healthValue;
    
    public Window(final String title, final int height, final int width, final Game game) {
    	ImageIcon icon = new ImageIcon("C:\\Users\\ggl20\\Documents\\George\\Programming\\Java\\Arena_Game_Icon.png");
    	
    	this.healthValue = 100;
    	//Frame Size
    	JFrame frame = new JFrame(title);
        health = new JPanel();
        bar = new JProgressBar();
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        bar.setPreferredSize(new Dimension(190, 35));
        bar.setValue(healthValue);
        bar.setStringPainted(true);
        bar.setBackground(Color.DARK_GRAY);
        bar.setForeground(Color.RED);
        con = frame.getContentPane();
        
        //Icon Code
        frame.setIconImage(icon.getImage());
        
        //Frame Configurations
        
        health.setBounds(10, 10, 200, 40);
        health.setBackground(Color.lightGray);
        health.add(bar);
        con.add(health);
        frame.add(game);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        

    }
    
    public void takeDamage() {
    	healthValue -= 5;
    	bar.setValue(healthValue);
    }
}
