package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto2 {

	private int year;
	public Punto2() {
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public boolean esBisiesto() {  // un año es bisiesto si es divisible por 4 o 400,pero no por 100
		
		boolean bisiesto;
		if (year%4 == 0)
		{
			if(year%400 == 0)
				bisiesto=true;
			else
			{
				if(year%100 == 0)
					bisiesto=false;
				else
					bisiesto=true;
			}
		}else
			bisiesto=false;
		
return bisiesto;
	}
}