/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scrolldiu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class CanvasImage extends JPanel{
    
    private BufferedImage imagen;
    
    public CanvasImage(){
        imagen = null;
        
    }
    
    public BufferedImage getImage(){
        return imagen;
    }
    
    public void setImage(BufferedImage image){
        imagen = image;
        this.setSize(new Dimension(imagen.getWidth(),imagen.getHeight()));
        this.setPreferredSize(new Dimension(imagen.getWidth(),imagen.getHeight()));
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen,0,0,null);
    }
}
