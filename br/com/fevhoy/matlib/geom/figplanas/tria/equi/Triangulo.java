package br.com.fevhoy.matlib.geom.figplanas.tria.equi;


/**
 * Esse programa mostrarÃ¡ a area,perimetro,apotema,raio da circunferencia circunscrita e altura de um triangulo equilatero
 * 
 * @author Rafael Mascarenhas Dal Moro 
 * @version 1.0 1/1/2015
 * review Mateus Berardo de Souza Terra 1/1/2015
 * 
 */
public class Triangulo{
    private static double L;
    private static double A;
    private static double H;
    private static double AP;
    private static double P;
    private static double R;   
    // metodo "getResult" para area do trieq;
    public double getResult(double l){
        L=l;
        setArea(); 
        return A;
    }
    // metodo "getResult" para altura;
    public double getResult(double l, boolean dif2){
        L=l;
        setAltura();
        return H;
    }
    // metodo "getResult" para apotema
    public double getResult(boolean h){
        setAp();
        return AP;   
    }
    // metodo "getResult" para perimetro
    public double getResult(double l, boolean p, boolean p2){
        L=l;
        setPer();
        return P;
    }
    //metodo "getResult" para raio da circunferencia circunscrita;
    public double getResult(boolean r, boolean r2){
        setRaio();
        return R;
    }
    // metodo para definir area
    public void setArea(){
        A= Math.pow(L,2)* Math.sqrt(3) / 4;
    }
    // metodo para definir altura
    public void setAltura(){
        H = L * Math.sqrt(3) / 2;
    }
    // metodo para definir apotema to triangulo equilatero
    public void setAp(){
        AP= H / 3;
    }
    // metodo para definir perimetro 
    public void setPer(){
        P= 3 * L; 
    }
    // metodo para definir raio da circunferencia circunscrita
    public void setRaio(){
        R = H * 2 /3;
    }
}
