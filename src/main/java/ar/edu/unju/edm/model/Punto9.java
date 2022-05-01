package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto9 {

	private int ocup;
	public Punto9() {
		// TODO Auto-generated constructor stub
	}

	public int[] cuentaFor() {
		ocup=0;
		int seq[]= new int [9];
		int p;
		for(p=320;p>=160; p=p-20)
		{
			seq[ocup]=p;
			ocup++;
		}
		
		return seq;
	}

	public void PrintSeq(int array[]) {
		int i;
		  for(i=0;i<ocup;i++)
			  System.out.print(array[i]+ " ");
	}
}