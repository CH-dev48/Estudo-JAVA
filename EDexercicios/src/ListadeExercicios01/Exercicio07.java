package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int idadeNadador;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Digite a Idade do Nadador:");
		idadeNadador = teclado.nextInt();
		
		teclado.close();
		
		if(idadeNadador >= 5 && idadeNadador <= 7) {
		
			System.out.printf("Sua categoria � Infantil A = 5 - 7 anos.");
		}
        else if(idadeNadador >=8 && idadeNadador <=10){
		
        	System.out.printf("Sua categoria � Infantil B = 8 - 10 anos.");
		}
        else if(idadeNadador >=11 && idadeNadador <=13){
    		
        	System.out.printf("Sua categoria � Juvenil A = 11 - 13 anos.");
		}
        else if(idadeNadador >=14 && idadeNadador <=17){
    		
        	System.out.printf("Sua categoria � Juvenil B  = 14 - 17 anos.");
		}
        else if(idadeNadador >=18 && idadeNadador <=25){
    		
        	System.out.printf("Sua categoria � S�nior = 18 - 25 anos.");
		}
        else {
    		
        	System.out.printf("Idade fora da faixa et�ria.");
		}
		
		}

		


	}


