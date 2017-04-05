/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgrafico;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Duvan - David
 */
public class VentanaPrincipal extends JFrame {
    
    private JPanel panelImagen;
    
    private JPanel panelOpciones;
    
    private JPanel panelBotones;
    
    private JPanel panelTriangulo;
    
    public VentanaPrincipal(){
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TRABAJO FIGURAS");
        getContentPane().setLayout(new BorderLayout());
        
        panelImagen = new PanelImagen();
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones();
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
        
        panelBotones = new PanelBotones(this);
        getContentPane().add(panelBotones, BorderLayout.WEST);
        
        panelTriangulo = new PanelTriangulo();
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
       
        setVisible(true);
        

    }

    public JPanel getPanelTriangulo() {
        return panelTriangulo;
    }
    
    
    
}
