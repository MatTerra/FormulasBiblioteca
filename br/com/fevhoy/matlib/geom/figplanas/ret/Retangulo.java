package br.com.fevhoy.matlib.geom.figplanas.ret;

import br.com.fevhoy.matlib.geom.figplanas.tria.Triangulo;

/**
 * 
 * 
 * @author Rafael Mascarenhas Dal Moro
 * @review Mateus Berardo de Souza Terra 18/12/2015
 * @version 1.2 12/30/2014
 */
public class Retangulo{
    // metodo "result" para area
    public static double getArea(double l, double l2){
        return l*l2;
    }
    // metodo "result" para diagonal
    public static double getDiagonal(double l, double l2){
        double D = Triangulo.pitagoras(l,l2);//subtituir por metodo de pitagoras
        return D;
    }
    // metodo "result" para perimetro
    public static double getPerimetro(double l, double l2, boolean semi){
        if(semi==true){
            return l+l2;
        }
        return 2*(l+l2);
    }
    public static double getApotema(double h){
        return h/2;
    }
}
