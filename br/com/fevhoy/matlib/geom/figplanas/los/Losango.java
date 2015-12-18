package br.com.fevhoy.matlib.geom.figplanas.los;


/**
 * Esse programa calculara a area, perimetro e lados de um losango baseado em suas diagonais
 * 
 * @author Rafael Mascarenhas Dal Moro
 * @version 1.0 1/1/2015
 * review <name> <date>
 */
public class Losango{
    private static double D;
    private static double D2;
    private static double L;
    private static double A;
    private static double P;
    // metodo "getResult" para area do losango
    public double getResult( double d, double d2){
     D=d;
     D2=d2;
     setArea();
     return A;
    }
    // metodo "getResult" para lado do losango
    public double getResult(double d, double d2, boolean dif){
     D=d;
     D2=d2;
     setLado();
     return L;
    }
    // metodo"getResult" para perimetro do losango
    public double getResult(boolean dif2){
     setPer();
     return P;
    }
    // metodo para calcular area
    public void setArea(){
     A= D * D2 / 2;
    } 
   //metodo para calcular lado
    public void setLado(){
     L= Math.sqrt( Math.pow(D,2)/2 + Math.pow(D2,2)/2);   
    } 
    // metodo para calcular perimetro
    public void setPer(){
     P = 4 * L;
    }
}
    
