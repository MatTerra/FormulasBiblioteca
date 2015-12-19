package br.com.fevhoy.matlib.geom.figplanas.circ;


/**
 * area,circunferencia,raio,arco para calculos de um circulo
 * 
 * @author Rafael Mascarenhas Dal Moro
 * @version 2.0 30/12/2014
 * @review Mateus Berardo de Souza Terra 18/12/2015
 */
public class Circ{
    //metodo "result" para area do circulo
    public static double getArea(double r, double arc, char unid){
        switch(unid){
            case 'g':
                return Math.PI*r*r*arc/90;
            case 'r':
                return r*r*arc/2;
            default:
                return 0.0;
        }
    }
    // metodo "result" para circunferencia
    public static double getCircunferencia(double r, double arc, char unid){
        switch(unid){
            case 'g':
                return Math.PI*r*arc/180;
            case 'r':
                return r*arc;
            default : 
                return 0.0;
        }
    }
    
    public static double getAngulo(double c, double r, boolean emRad){
        if (emRad==false){
            return 180*c/Math.PI*r;
        }
        return c/r;
    }
}
