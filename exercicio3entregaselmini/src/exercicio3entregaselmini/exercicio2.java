package exercicio3entregaselmini;

import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
		//Exerc�cio 2: Reescreva o segundo m�todo do exerc�cio anterior para ser um m�todo recursivo. 
					
		System.out.println( "      " + zzzzzzz(10)); 
	}
				
				public static int zzzzzzz (int cont) {
					Random zz = new Random(); 
					int aux = zz.nextInt(100) ;
					System.out.print(aux + "  ");
					
						if(cont == 1) {							
							return aux;
						}else {						
						return	aux = aux + zzzzzzz(cont-1);
						
						}
				}
				
				
}


