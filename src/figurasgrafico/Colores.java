/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgrafico;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

/**
 *clase para la creacion de la paleta de colores
 * @author david
 */
public class Colores extends JDialog{
       private Component contentPane;
       /*constructor*/
    public Colores() {
    }
    
/*metodo para colorear la figura*/
public Color colorfigura(){
   
        Color color=JColorChooser.showDialog(contentPane, "Elige un color", Color.BLACK);
        return color;
        }
/*metodo para colorear las lineas de la figura*/
public Color colorlinea(){
        
        Color color=JColorChooser.showDialog(contentPane, "Elige un color", Color.BLACK);
        return color;
        }
    
}
