package br.com.fevhoy.matlib.proga;


/**
 * classe ProgArit- classe para calculos de uma pa
 * 
 * @author Mateus Berardo de Souza Terra
 * @review <name> <date>
 * @version 2.0 12/30/2014
 */
public class ProgArit{
    // campos da classe
    private static int A1;
    private static int AN;
    private static int N;
    private static int R;
    private static int SOMA;
     // metodo para calcular e resgatar valor de an
    public static int getResult(int a1, int n, int r){
        A1=a1;
        N=n;
        R=r;
        setAn();
        return AN;
    }
    //metodo para calcular e resgatar valor da soma
    public static int getResult(int a1, int an, int n, int r, boolean a){
        A1=a1;
        AN=an;
        N=n;
        R=r;
        if(a==true){            
            setSoma();
        }else{
            setAn();
            setSoma();
        } 
        return SOMA;
    }
    // calaculo da soma
    private static void setSoma(){
        SOMA=(A1+AN)*N/2;        
    }
    //calculo do an
    private static void setAn(){
        AN=A1+((N-1)*R);
    }
}
