/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgrafico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Duvan - David
 */
public class PanelTriangulo extends JPanel {
    public PanelTriangulo() {
        
        setBackground(Color.GRAY);

    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Polygon polygon = new Polygon();
        polygon.addPoint(230,150);
        polygon.addPoint(230,200);
        polygon.addPoint(280,200);
        
        g.setColor(Color.BLUE);
        g.drawPolygon(polygon);
        g.fillPolygon(polygon);
        g.setColor(Color.BLACK);
        g.drawLine(230, 0, 230, 300);
        g.drawLine(0, 150, 467, 150);
    }
    
}
