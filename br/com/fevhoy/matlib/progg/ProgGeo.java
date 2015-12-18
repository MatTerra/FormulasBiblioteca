package br.com.fevhoy.matlib.progg;


/**
 * classe ProgGeo- classe para calculos de uma pg
 * 
 * @author Mateus Berardo de Souza Terra
 * @review Rafael Mascarenhas Dal Moro <date>
 * @version 1.0 12/30/2014
 */
public class ProgGeo{
    // campos da classe
    private static double A1;
    private static double AN;
    private static int N;
    private static double Q;
    private static double SOMA;
    private static double SOMA_INF;
     // metodo para calcular e resgatar valor de an
    public static double getResult(double a1, int n, double q){
        A1=a1;
        N=n;
        Q=q;
        setAn();
        return AN;
    }
    //metodo para calcular e resgatar valor da soma
    public static double getResult(double a1, int n, double q, boolean dif){
        A1=a1;
        N=n;
        Q=q;
        setSoma();
        return SOMA;
    }
    //metodo para calcular e resgatar valor da soma infinita
    public static double getResult(double a1, double q){
        A1=a1;
        Q=q;
        setSoma(true);
        return SOMA_INF;
    }
    //calculo da soma infinita
    private static void setSoma(boolean dif){
        SOMA_INF=A1/(1-Q);
    }
    // calculo da soma
    private static void setSoma(){
        SOMA=A1*(Math.pow(Q,N)-1)/(Q-1);    
    }
    //calculo do an
    private static void setAn(){
        int n=N-1;
        AN=A1*(Math.pow(Q,n));
    }
}
