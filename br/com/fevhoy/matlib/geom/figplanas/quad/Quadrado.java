package br.com.fevhoy.matlib.geom.figplanas.quad;


/**
 * Classe quadrado - classe com calculos do quadrado
 * 
 * @author Rafael Mascarenhas Dal Moro 
 * @version 1.1 12/30/2014
 * @review Mateus Berardo de Souza Terra 12/30/2014 
 */
public class Quadrado{
    private static double A;
    private static double AP;
    private static double L;
    private static double D;
    private static double P;
    private static double RESULTS[]= new double[4];
    // metodo "result"para area,perimetro,apotema,lado e diagonal
    public static double[] getResults(double l) {   
        L=l;
        setApotema();
        RESULTS[0]=AP;
        setDiagonal();
        RESULTS[1]=D;
        setPerimetro();
        RESULTS[2]=P;
        setArea();
        RESULTS[3]=A;
        return RESULTS;
    }
    //metodo para area
    private static void setArea(){
        A=Math.pow(L,2);
    }
    //metodo para apotema
    private static void setApotema(){
        AP=L/2;
    }
    //metodo para diagonal
    private static void setDiagonal(){
        D=L*Math.sqrt(2);  
    }
    //metodo para perimetro
    private static void setPerimetro(){
        P=4*L;
    }    
   }     

