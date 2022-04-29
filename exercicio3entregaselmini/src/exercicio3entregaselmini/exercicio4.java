package exercicio3entregaselmini;

import java.util.Scanner;

public class exercicio4 {
	//4.  Reescreva o segundo método do exercício anterior para ser um método recursivo. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner (System.in);
		
		System.out.println(" Digite o valor em binário para ser convertido:");
		String binariov;
		binariov = teclado.nextLine();


		int tamanho = binariov.length();
        int expo =0;
        
	    System.out.println("O número binário é: " + potencia(binariov,tamanho,expo)); }
		
		public static int potencia (String binariov, int tamanho, int expo) {		
            
		int valorp =  ((int) Math.pow(2, expo ));
        char cont = binariov.charAt(tamanho -1 );
            if(tamanho == 1 ){
                return valorp;
            }else{
                if (cont == '1'){
                return valorp = valorp + potencia(binariov, tamanho - 1, expo +1);
                }else{
                return potencia(binariov, tamanho - 1 , expo + 1);
                }
            }			
		}
	}


