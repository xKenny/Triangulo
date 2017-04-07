/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgrafico;

import punto.Triangulo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Polygon;
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
import java.lang.Integer;

/**
 *
 * @author Duvan - David
 */
public class PanelBotones extends JPanel implements ActionListener {
    
    private int x1,x2,x3,y1,y2,y3;
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
    private Triangulo triangulo;
    
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
        
        LArea = new JLabel("Area: " );
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
            System.out.print(paleta.showDialog(null, "Seleccione un Color", Color.green));
        }
        else if (BTN_COLOR_LINEA.equals(e.getActionCommand())){
            JColorChooser paleta = new JColorChooser();
            paleta.setSize(300,300);
            this.ventana.getPanelTriangulo().setBackground(paleta.showDialog(null, "Seleccione un Color", Color.green));
            paleta.setVisible(true);
        }
        else if (BTN_PUNTO.equals(e.getActionCommand())){
            JDialog mensaje = new JDialog(new JFrame(), true);
            mensaje.setLayout(new GridLayout(3,3));
            mensaje.setSize(300,300);
            mensaje.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            JTextField campo1 = new JTextField();
            JTextField campo2 = new JTextField();
            JTextField campo3 = new JTextField();
            JTextField campo4 = new JTextField();
            JTextField campo5 = new JTextField();
            JTextField campo6 = new JTextField();
            mensaje.add(campo1);
            mensaje.add(campo2);
            mensaje.add(campo3);
            mensaje.add(campo4);
            mensaje.add(campo5);
            mensaje.add(campo6);
            mensaje.setVisible(true);
            triangulo = new Triangulo(Double.parseDouble(campo1.getText()),Double.parseDouble(campo2.getText()),Double.parseDouble(campo3.getText()),Double.parseDouble(campo4.getText()),Double.parseDouble(campo5.getText()),Double.parseDouble(campo6.getText()));
            this.LArea.setText("AREA:"+ this.triangulo.darArea());
            this.LPerimetro.setText("Perimetro: "+ this.triangulo.darPermietro());
            x1=Integer.parseInt(campo1.getText());
            x2=Integer.parseInt(campo2.getText());
            x3=Integer.parseInt(campo3.getText());
            y1=Integer.parseInt(campo4.getText());
            y2=Integer.parseInt(campo5.getText());
            y3=Integer.parseInt(campo3.getText());
            this.ventana.getPanelTriangulo().setX1(x1);this.ventana.getPanelTriangulo().setY1(y1);
            this.ventana.getPanelTriangulo().setX2(x2);this.ventana.getPanelTriangulo().setY2(y2);
            this.ventana.getPanelTriangulo().setX3(x3);this.ventana.getPanelTriangulo().setY3(y3);
            this.ventana.repaint();
        }
    }   
       
    
    

    
}
