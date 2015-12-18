package br.com.fevhoy.matlib;
/**
 * Classe Baskarah - classe para calculo de baskarah
 * 
 * @author Mateus Berardo de Souza Terra
 * @review  <date>
 * @version 2.0 12/30/2014
 */
public class Baskarah{
    //campos da classe
    private static double A;
    private static double B;
    private static double C;
    private static double X1;
    private static double X2;
    private static double D;
    private static boolean CASE;
    private static double[] RESULTS = new double[2];
    //método de calculo e resgate dos resultados
    public static double[] getResults(double a, double b, double c){
        A=a;
        B=0-b;
        C=c;
        setDelta();
        setX1();
        setX2();
        RESULTS[0]=X1;
        RESULTS[1]=X2;
        return RESULTS;
    }
    //metodo para calcular delta
    private static void setDelta(){
        D=(B*B)-(4*A*C);
        D=Math.sqrt(D);
    }
    //metodo para calcular x1
    private static void setX1(){
        X1=(B+D);
        X1=X1/(2*A);
    }    
    //metodo para calcular x2
    private static void setX2(){
        X2=(B-D);
        X2=X2/(2*A);
    }        
}
