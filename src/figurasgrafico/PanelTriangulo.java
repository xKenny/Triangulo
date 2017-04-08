/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgrafico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Duvan - David
 */
public class PanelTriangulo extends JPanel {
    /*atributos de la clase*/
    public Color color;
    public Color colorfondo;
    
    private int x1,x2,x3,y1,y2,y3;
   
    /*constructor que defines aspectos principales del panel*/
    public PanelTriangulo() {
        
        setBackground(Color.GRAY);
         Dimension d = getSize();
        System.out.print(d.getHeight() + " " + d.getWidth());  

    }
    /*metodo para dibujar el triangulo*/
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D grafico = (Graphics2D) g;
        
        
        Polygon polygon = new Polygon();
        polygon.addPoint(x1+230,150-y1);
        polygon.addPoint(x2+230,150-y2);
        polygon.addPoint(x3+230,150-y3);
       
        
        g.drawLine(230, 0, 230, 300);
        g.drawLine(0, 150, 467, 150);
        
        g.setColor(color);
        g.drawPolygon(polygon);
        grafico.setColor(colorfondo);
        grafico.fill(polygon);
        
    }
    /*metodos getter y setter*/
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
    
    
    
}
