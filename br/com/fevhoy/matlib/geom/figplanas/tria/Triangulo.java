package br.com.fevhoy.matlib.geom.figplanas.tria;


/**
 * Esse programa calculara a area e o perimetro de um triangulo comum utilizando diferentes metodos
 * 
 * @author Rafael
 * @version 1.0
 * @review Mateus Berardo de Souza Terra 18/12/2015
 */

public class Triangulo{
    // metodo get para area do triangulo via heron
    public static double heron(double l1, double l2, double l3){
       double P = getPerimetro(l1,l2,l3,true);
       double A = Math.sqrt(P *(P - l1) * (P -l2) * (P - l3)); 
       return A;
    }
    //metodos para calculo de pitagoras
    public static double pitagoras(double l1, double l2, char missing){
        double l;
        switch (missing){
            case 'c':
                return l=Math.sqrt(Math.pow(l2,2)-Math.pow(l1,2));
            case 'h':
                return l=Math.sqrt(Math.pow(l2,2)+Math.pow(l1,2));
            default:
                return 0.0;
        }
    }
    public static double pitagoras(double l1, double l2){
        double l;
        return l=Math.sqrt(Math.pow(l2,2)+Math.pow(l1,2));     
    }
    //metodo get para area do triangulo
    public static double getArea(double b, double h){
       return b*h;
    }
    //metodo para area do triangulo equilatero
    public static double getArea(double l){
       return Math.pow(l,2)*Math.sqrt(3)/4;
    }
    //metodo para calcular a altura do triangulo equilatero
    public static double getAltura(double l){
       return l*Math.sqrt(3)/2;
    }
    //metodo para calcular o apotema do triangulo equilatero
    public static double getApotema(double h){
       return h/3;
    }
    //metodo para calcular raio do circulo circunscrito ao triangulo equilatero
    public static double getRaioCircunscrita(double h){
       return h*2/3;
    }
    //metodo para calcular perimetro do triangulo equilatero
    public static double getPerimetro(double l, boolean semi){
        double P = l*3 / 2;
        if(semi == true) return P;
        return 2 * P;
    }
    // metodo get para perimetro do triangulo
    public static double getPerimetro(double l1,double l2, double l3, boolean semi){
        double P = l1 + l2 + l3 / 2;
        if(semi == true) return P;
        return 2 * P;
    }  
  
}
