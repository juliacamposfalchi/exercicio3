package exercicio3entregaselmini;

import java.util.Random;
import java.util.Scanner;

public class exercicio1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Exercício 1: Escreva um programa em Java que preencha um vetor de 10 posições com valores 
//inteiros (o preenchimento deverá ser feito por um método). Um segundo método deverá ser 
//chamado para calcular e retornar a soma dos elementos armazenados no array.
	
		int[] z = new int [10];
		int zzz;
		
		zzzzz(z);
		zzz = zzzz(z);
		
		System.out.println(" A soma é: " + zzz);
	}
		public static void zzzzz (int [] z) {
			Random zz = new Random();
		for(int i=0; i<z.length; i++) {
			z[i] = zz.nextInt(100);	
			System.out.print(z[i] + "\t");
		}
		System.out.println();
	}
		
		public static int zzzz (int [] z) {		
		int aux = z[0];
			for(int i=1; i <z.length-1; i++ ) {
			aux += z[i];
		} return aux;
		}

}


