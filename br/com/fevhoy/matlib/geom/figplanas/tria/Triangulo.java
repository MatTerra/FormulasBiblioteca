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
   public static double Heron(double l1, double l2, double l3){
    double P = getPerimetro(l1,l2,l3,true);
    double A = Math.sqrt(P *(P - l1) * (P -l2) * (P - l3)); 
    return A;
   }
   //metodo get para area do triangulo
   public static double getArea(double b, double h){
       return b*h;
    }
   // metodo get para perimetro do triangulo
   public static double getPerimetro(double l1,double l2, double l3, boolean semi){
    double P = l1 + l2 + l3 / 2;
    if(semi == true) return P;
    return 2 * P;
   }  
  
}
