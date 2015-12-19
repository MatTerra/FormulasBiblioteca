package br.com.fevhoy.matlib.geom.figplanas.los;

import br.com.fevhoy.matlib.geom.figplanas.tria.Triangulo;

/**
 * Esse programa calculara a area, perimetro e lados de um losango baseado em suas diagonais
 * 
 * @author Rafael Mascarenhas Dal Moro
 * @version 1.0 1/1/2015
 * review Mateus Berardo 18/12/2015
 */
public class Losango extends FigPlana{
    // metodo "getArea" para area do losango
    public double getArea( double d, double d2){
		return d*d2/2;
    }
    // metodo "getLado" para lado do losango
    public double getLado(double d, double d2){
		return Triangulo.pitagoras(d/2, d2/2);
    }
    // metodo"getPer" para perimetro do losango
    public double getPerimetro(double l1, double l2, boolean semi){
     	double[] LS = {l1,l1,l2,l2};
	return getPerimetro(LS,semi);
    }
}
    
