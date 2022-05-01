
package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto12 {

	private int altura;
	public Punto12() {
		// TODO Auto-generated constructor stub
	}

	public int getAltura() {
	
		return altura;
	}

	public void setAltura(int altura) {
		
		this.altura = altura; 
	}
	public double calcTiempo() {
		return Math.sqrt((altura*2)/9.81);
	}
}