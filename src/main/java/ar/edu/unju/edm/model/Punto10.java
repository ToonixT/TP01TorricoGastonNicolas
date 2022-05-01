package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto10 {

	private int ocup;
	public Punto10() {
		// TODO Auto-generated constructor stub
	}

	public int[] cuentaWhile() {
		ocup=0;
		int seq[]= new int[9];
		int p=320;
		while (p>=160)
		{
			seq[ocup]=p;
			p=p-20;
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