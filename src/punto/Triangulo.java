/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 * Clase que representa un triangulo con sus operaciones
 * @author Johans Gonzalez
 */
public class Triangulo extends Puntos{
    
    /**
     * Atributo que contiene la cordenada x3
     */        
    private double x3;

    /**
     * atributo que contiene la coordenada y3
     */
    private double y3;
    
    /**
     * Guarda el perimetro del triangulo
     */
    private double perimetro;

    /**
     *constructor que inicializa las variables
     * @param x3
     * @param y3
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Triangulo(double x1,double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        
    }

    

    

  
    
    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
            if(clasificar()==1){
                System.out.println("Es un triangulo isoceles");
            }else{
                if(clasificar()==2){
                    System.out.println("Es un triangulo escaleno");
                }else{
                    System.out.println("Es un triangulo equilatero");
                }
            }
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        return true;
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(x2 - x1, 2 );
        double auxiliarY = Math.pow(y2 - y1, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(x3 - x2, 2);
        double auxiliarY = Math.pow(y3 - y2, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(x1 - x3, 2);
        double auxiliarY = Math.pow(y1 - y3, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Metodo que retorna 1 para isoceles, 2 para escaleno y 3 para equilatero
     * @return 
     */
    
    private byte clasificar(){
        
        if(darLado1()==darLado2()&&darLado1()!=darLado3()&&darLado2()!=darLado3()){
            return 1;
        }else{
            if(darLado1()==darLado3()&&darLado1()!=darLado3()){
                return 1;
            }else{
                if(darLado2()==darLado3()){
                    return 1;
                }else{
                    if(darLado1()!=darLado2()&&darLado1()!=darLado3()&&darLado2()!=darLado3()){
                        return 2;
                    }else{
                        return 3;
                    }
                }
            }
        }
        
    }
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    public double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    public double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
/**
 * retorna el valor de x3 
 * @return 
 */
    public double getX3() {
        return x3;
    }
    /**
     * modifica el valor de x3
     * @param x3 
     */
    public void setX3(double x3) {
        this.x3 = x3;
    }
    /**
     * retorna el valor de y3
     * @return 
     */
    public double getY3() {
        return y3;
    }
    /**
     * modifica el valor de y3
     * @param y3 
     */
    public void setY3(double y3) {
        this.y3 = y3;
    }
    /**
     * variable que retorna el valor del perimetro
     * @return 
     */
    public double getPerimetro() {
        return perimetro;
    }
    /**
     * modifica el valor del perimetro
     * @param perimetro 
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}