package br.com.fevhoy.matlib.geom.figplanas.circ;


/**
 * area,circunferencia,raio,arco para calculos de um circulo
 * 
 * @author Rafael Mascarenhas Dal Moro
 * @version 1.2 30/12/2014
 * @review Mateus Berardo de Souza Terra 12/30/2014
 */
public class Circ{
    // Campos da classe
    private static double R;
    private static double A;
    private static double C;    
    private static double CA;
    private static double ARC;//area do arco
    private static int G; //tamanho do arco
    //metodo "result" para area do circulo
    public double getArea(double r){
        R=r;
        setArea();
        return A;
    }
    // metodo "result" para circunferencia
    public double getCirc(double r, boolean dif){
        R=r;
        setCirc();
        return C;
    }
    //metodo "result" para perimetro do arco
    public double getArc(double r ,int g){
        R=r;
        G=g;
        setArc();
        return C;
    }
    //metodo " result para area do arco
    public double getAreaArc(double r, int g, boolean dif){
       R=r;
       G=g;
       setAArc();
       return ARC;
    }
    //metodo para area do circulo
    public void setArea() {
       A = Math.PI * (Math.pow(R,2));
    }
    // metodo para circunferencia
    public void setCirc(){
        C= Math.PI * 2 * R;
    }
    //metodo para arco
    public void setArc(){
        CA= Math.PI * G * R / 180;
    }
    // metodo " result para area do arco 
    public void  setAArc(){
        ARC = G * Math.PI * Math.pow(R,2) / 360;
    }
}
