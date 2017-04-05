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
        polygon.addPoint(0,0);
        polygon.addPoint(0,50);
        polygon.addPoint(50,50);
        
        g.setColor(Color.BLUE);
        g.drawPolygon(polygon);
    }
    
}
