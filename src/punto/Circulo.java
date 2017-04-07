/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

import punto.Puntos;

/**
 *
 * @author David Jimenez - Duvan Poveda
 */
public class Circulo extends Puntos {

    public Circulo(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }
    
    
    public void darResultados() {
        System.out.println("Radio: " + darRadio());
        System.out.println("Perimetro: " + darPerimetro());
        System.out.println("Area: " + darArea());
        System.out.println("Diametro: " + darDiametro());
    }
    /**
     * Metodo que retorna el valor del radio
     * @return radio
     */
    private double darRadio(){
        double radio;
        double auxiliarX = Math.pow(x1 - x2, 2);
        double auxiliarY = Math.pow(y1 - y2, 2);
        
        radio = Math.sqrt(auxiliarX +  auxiliarY);
        return radio;
    }
    /**
     * Metodo que retorna el area del circulo
     * @return 
     */
    private double darArea(){
        double area;
        area = (Math.PI)*(Math.pow(darRadio(), 2));
        return area;
    }
    /**
     * Metodo que retorna el perimetro del circulo
     * @return 
     */
    private double darPerimetro(){
        return 2*Math.PI*darRadio();
    }
    private double darDiametro(){
        return darRadio()*2;
    }
    
}

