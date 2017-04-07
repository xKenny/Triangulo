/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

import punto.Puntos;

/**
 *clase que representa un cuadrado con sus operaciones
 * @author David Jimenez - Duvan Poveda
 */
public class Cuadrado extends Puntos {
   /**
    * atributo que contiene la coordenada x3
    */
    private double x3;
    /**
     * atributo que contiene la coordenada y3
     */
    private double y3;
    /**
     * atributo que contiene la coordenada x4
     */
    private double x4;
    /**
     * atributo que contiene la coordenada y4
     */
    private double y4;
/**
 * constructor que inicializa las variables 
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 * @param x3
 * @param y3
 * @param x4
 * @param y4 
 */
    public Cuadrado(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
    
    
    /**
     * Metodo que da los resultados del cuadrado
     */
    public void darResultados() {
        if(tipoCuadra()){
            System.out.println("Es un cuadrado");
        }else{
            System.out.println("Es un rectangulo");
        }
        System.out.println("Lado1: " + darLado1());
        System.out.println("Lado2: " + darLado2());
        System.out.println("Lado3: " + darLado3());
        System.out.println("Lado4: " + darLado4());
        System.out.println("Perimetro: " + darPerimetro());
        System.out.println("Area: " + darArea());
    }
    /**
     * Metodo que retorna verdad si es cuadrado y falso si es rectangulo
     * @return 
     */
    private boolean tipoCuadra() {
        if(darLado1()==darLado2()&&darLado1()==darLado3()&&darLado1()==darLado4()){
            if(darLado2()==darLado3()&&darLado2()==darLado4()){
                if(darLado3()==darLado4()){
                    return true;
                }
            }
        }
      return false; 
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(x1 - x2, 2);
        double auxiliarY = Math.pow(y1 - y2, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
      /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(x2 - x3, 2);
        double auxiliarY = Math.pow(y2 - y3, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
      /**
     * Retorma longitud de lado CD
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(x3 - x4, 2);
        double auxiliarY = Math.pow(y3 - y4, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
      /**
     * Retorma longitud de lado DA
     * @return 
     */
    private double darLado4(){
        double auxiliarX = Math.pow(x1 - x4, 2);
        double auxiliarY = Math.pow(y1 - y4, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * 
     * Metodo que retorna el perimetro del cuadrado
     * @return Perimetro
     */
    private double darPerimetro() {  
      return darLado1() + darLado2() + darLado3() + darLado4();
    }
     /**
     * Metodo que retorna el area de el cuadrado
     * @return  Area
     */
    private double darArea() {
        double area;
        area = (darLado1())*(darLado2());
        return area;
    }
    /**
     * retorna la coordenada x3
     * @return 
     */
    public double getX3() {
        return x3;
    }
    /**
     * modifica la coordenada x3
     * @param x3 
     */
    public void setX3(double x3) {
        this.x3 = x3;
    }
    /**
     * retorna la coordenada y3
     * @return 
     */
    public double getY3() {
        return y3;
    }
    /**
     * modifica la coordenada y3
     * @param y3 
     */
    public void setY3(double y3) {
        this.y3 = y3;
    }
    /**
     * retorna la coordenada x4
     * @return 
     */
    public double getX4() {
        return x4;
    }
    /**
     * modifica la variable x4
     * @param x4 
     */
    public void setX4(double x4) {
        this.x4 = x4;
    }
    /**
     * retorna la coordenada y4
     * @return 
     */
    public double getY4() {
        return y4;
    }
    /**
     * modifica la variable y4
     * @param y4 
     */
    public void setY4(double y4) {
        this.y4 = y4;
    }
 
}
