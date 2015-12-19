package br.com.fevhoy.matlib.geom.figplanas;

/**
 * Métodos gerais para figuras planas
 * 
 * @author Mateus Berardo
 * @version 1.0 18/12/2015
 */
public class FigPlana{
    public static double getPerimetro(double[] ls, boolean semi){
        double p=0;
        for (double l : ls){
            p+=l;
        }
        return p;
    }
    public static double getArea(double p, double apot){
        return p*apot;
    }
    public static double getArea(double[] ls, double apot){
        double p=0;
        for (double l : ls){
            p+=l;
        }
        p=p/2;
        return p*apot;
    }
}
