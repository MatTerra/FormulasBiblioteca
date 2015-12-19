package br.com.fevhoy.matlib.geom.figplanas.los;


/**
 * Esse programa calculara a area, perimetro e lados de um losango baseado em suas diagonais
 * 
 * @author Rafael Mascarenhas Dal Moro
 * @version 1.0 1/1/2015
 * review <name> <date>
 */
public class Losango extends FigPlana{
    // metodo "getArea" para area do losango
    public double getArea( double d, double d2){
		double D=d;
		double D2=d2;
		double A= D * D2 / 2;
		return A;
    }
    // metodo "getLado" para lado do losango
    public double getLado(double d, double d2, boolean dif){
		double D=d;
		double D2=d2;
		double L= Math.sqrt( Math.pow(D,2)/2 + Math.pow(D2,2)/2); 
     return L;
    }
    // metodo"getPer" para perimetro do losango
    public double getPer(boolean semi, double l1, double l2){
     double[] LS = {l1,l1,l2,l2};
	 getPerimetro(LS,semi);
	 return getPerimetro();
    }
    
}
    
