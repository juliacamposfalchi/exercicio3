package exercicio3entregaselmini;
import java.math.*;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Exerc�cio 3: Escreva um programa em Java que leia um n�mero representando um n�mero na base 
//bin�ria. O seu programa dever� ter um m�todo para converter e retornar o valor da base bin�ria 
//para decimal. 
		Scanner teclado = new Scanner (System.in);
		
		System.out.println(" Digite o valor em bin�rio para ser convertido:");
		String binariov;
		binariov = teclado.nextLine();
		
		System.out.println("O n�mero bin�rio �: " + potencia(binariov)); }
		
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
