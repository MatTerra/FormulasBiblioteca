package br.com.fevhoy.matlib.geom.figplanas.ret;


/**
 * 
 * 
 * @author Rafael Mascarenhas Dal Moro
 * @review Mateus Berardo de Souza Terra 12/30/2014
 * @version 1.2 12/30/2014
 */
public class Retangulo{
     private static double L;
     private static double L2;
     private static double D;
     private static double P2;     
     private static double P;
     private static double A;
    // metodo "result" para area
    public static double getArea(double l, double l2){
        L= l;
        L2=l2;
        setArea();
        return A;
    }
    // metodo "result" para diagonal
    public static double getDiag(double l, double l2){
        L=l;
        L2=l2;
        setDiag();//subtituir por metodo de pitagoras
        return D;
    }
    // metodo "result" para perimetro
    public static double getPer(double l, double l2){
        L=l;
        L2=l2;
        setPer();
        return P2;
    }
    //metodo "result" para semiperimetro
    public static double getSemiPer(double l, double l2){
        L=l;
        L2=l2;
        setSemiPer();
        return P;
    }
    // metodo para area
    private static void setArea(){
        A=L*L2;
    }
    // metodo para perimetro
    private static void setPer(){
        P2 = (2 * L) + (2 * L2);
    }
    //metodo para semi perimetro
    private static void setSemiPer(){
        P = L+L2;
    }
    // metodo para diagonal
    private static void setDiag(){
        D = Math.sqrt(Math.pow(L,2) + Math.pow(L2,2));
    }
}
