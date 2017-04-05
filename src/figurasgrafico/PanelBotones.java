/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgrafico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Duvan - David
 */
public class PanelBotones extends JPanel implements ActionListener {
    
    private JButton btnColorFondo;
    private JButton btnColorLinea;
    private JButton btnPunto;
    private static final String BTN_COLOR_FONDO = "COLORFONDO";
    private static final String BTN_COLOR_LINEA = "COLORLINEA";
    private static final String BTN_PUNTO = "PUNTO";
    
    private JLabel LArea;
    private JLabel LPerimetro;
    private JLabel LAltura;
    
    private VentanaPrincipal ventana;
    
    public PanelBotones(VentanaPrincipal ventana){
        this.ventana = ventana;
        setBackground(Color.WHITE);
        setLayout(new GridLayout(6, 1));
        
        btnColorFondo = new JButton ("Cambiar fondo");
        btnColorFondo.addActionListener((ActionListener) this);
        btnColorFondo.setActionCommand(BTN_COLOR_FONDO);
        add(btnColorFondo);
        
        btnColorLinea = new JButton ("Cambiar linea");
        btnColorLinea.addActionListener((ActionListener) this);
        btnColorLinea.setActionCommand(BTN_COLOR_LINEA);
        add(btnColorLinea);
        
        btnPunto = new JButton ("Cambiar punto");
        btnPunto.addActionListener((ActionListener) this);
        btnPunto.setActionCommand(BTN_PUNTO);
        add(btnPunto);
        
        LArea = new JLabel("Area: ");
        add(LArea);
        
         LPerimetro = new JLabel("Perimetro: ");
        add(LPerimetro);
        
         LAltura = new JLabel("Altura: ");
        add(LAltura);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(BTN_COLOR_FONDO.equals(e.getActionCommand())){
            JColorChooser paleta = new JColorChooser();
            paleta.setSize(300,300);
            this.ventana.getPanelTriangulo().setBackground(paleta.showDialog(null, "Seleccione un Color", Color.green));
            paleta.setVisible(true);
           
            
            //this.ventana.getPanelTriangulo().setBackground(Color.yellow);
            
            
            
        }
        else if (BTN_COLOR_LINEA.equals(e.getActionCommand())){
            System.out.println("Imprime Boton color linea");
        }
        else if (BTN_PUNTO.equals(e.getActionCommand())){
            JDialog mensaje = new JDialog(new JFrame(), true);
            mensaje.setSize(300,300);
            mensaje.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            mensaje.setVisible(true);
            
        }
    }
    

    
}
