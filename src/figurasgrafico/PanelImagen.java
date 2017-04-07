/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgrafico;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Duvan - David
 */
public class PanelImagen extends JPanel {
    
    private JLabel etiquetaImagen;
    private JLabel nombres;
    
    public PanelImagen(){
        setBackground(Color.WHITE);
        setBorder(new LineBorder (Color.GRAY));
        ImageIcon icon = new ImageIcon("imagenes/logo.JPG");
        etiquetaImagen = new JLabel("            TRIANGULO");
        etiquetaImagen.setFont(new Font("Verdana",Font.BOLD, 25));
        etiquetaImagen.setForeground(Color.BLUE);
        nombres = new JLabel("                  David Jimenez - Duvan poveda");etiquetaImagen.setFont(new Font("Verdana",Font.BOLD, 25));
        etiquetaImagen.setFont(new Font("Arial",Font.BOLD, 20));
        etiquetaImagen.setForeground(Color.black);
        etiquetaImagen.setHorizontalAlignment(JLabel.LEFT);
        etiquetaImagen.setIcon(icon);
        add(etiquetaImagen);
        add(nombres);
    }
}
