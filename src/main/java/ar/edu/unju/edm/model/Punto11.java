package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto11 {

	private int ocup;
	public Punto11() {
		// TODO Auto-generated constructor stub
	}

	public int[] cuentaDoWhile() {
		ocup=0;
		int seq[]= new int[9];
		int p=320;
		while (p>=160)
		do{
			seq[ocup]=p;
			p=p-20;
			ocup++;
		}while (p>=160);
		
		return seq;
	}

	public void PrintSeq(int array[]) {
		int i;
		  for(i=0;i<ocup;i++)
			  System.out.print(array[i]+ " ");
	}
}