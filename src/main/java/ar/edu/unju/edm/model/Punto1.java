package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Punto1 {

	private int numero;
	
	public Punto1() {}
	
	public int getNumero() {
			return numero;
		}
		
	public void setNumero(int numero) {
			this.numero=numero; 
	}
	
	
	public int ResFact() {
		
		int resultado=1;
		if (numero==0)
		{
			if (numero==0 || numero==1)
			{
				return resultado;
			}
			else
			{
				resultado=numero;
				for(int i=numero-1; i>0; i++)
				{
					resultado=resultado*i;
				}
				return resultado;
			}
		}else 
			return 0;
	}
	
	
	
	
	
	}

//cambiar