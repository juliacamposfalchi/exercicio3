package exercicio3entregaselmini;
import java.math.*;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Exercício 3: Escreva um programa em Java que leia um número representando um número na base 
//binária. O seu programa deverá ter um método para converter e retornar o valor da base binária 
//para decimal. 
		Scanner teclado = new Scanner (System.in);
		
		System.out.println(" Digite o valor em binário para ser convertido:");
		String binariov;
		binariov = teclado.nextLine();
		
		System.out.println("O número binário é: " + potencia(binariov)); }
		
		public static int potencia (String binariov) {
		int tamanho = binariov.length();
		int valorp = 0;
		
		for(int i = 0; i < binariov.length(); i++) {
			char cont = binariov.charAt(tamanho - 1 );
			if(cont == '1') { 
				valorp = valorp +((int) Math.pow(2, i));
			}
			tamanho --;
			
		}return valorp ;
		} 
		
		
		
		
	

}
