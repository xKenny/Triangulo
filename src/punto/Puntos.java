/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 * Clase que representa un punto de cordenada en X y Y
 * @author Johans Gonzalez
 */
public class Puntos {
    
    /**
     * Atributo que aloja la cordenada x1
     */
    public double x1;

    /**
     * Atributo que aloja la cordenada y1
     */    
    public double y1;
   /**
    * atributo que aloja la coordenada x2
    */
    public double x2;
    
    /**
     * atributo que aloja la coordenada y2
     */
    public double y2;

    /**
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2 
     */
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Retorna el valor de x1 de la cordenada1
     * @return x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * Modifica cordenada x1
     * @param x1 
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * Retorna el valor de y1 de la cordenada1
     * @return y1
     */    
    public double getY1() {
        return y1;
    }

    /**
     * Modifica cordenada y1
     * @param y1
     */    
    public void setY1(double y1) {
        this.y1 = y1;
    }
    /**
     * retorna el valor de x2 en la coordenada 2
     * @return x2
     */
     public double getX2() {
        return x2;
    }
    /**
     * modifica coordenada x2
     * @param x2 
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    /**
     * retorna el valor de y2 en la coordenada 2
     * @return y2
     */
    public double getY2() {
        return y2;
    }
    /**
     * modifica coordenada y2
     * @param y2 
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }
                
}
