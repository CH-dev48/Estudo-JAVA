package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
	     int resultadoSoma, resultadoSubtracao,resultadoDivisao;
	     int  resultadoMultiplicacao;
	      Scanner teclado = new Scanner(System.in);

	System.out.printf("Digite o primeiro número:");
	num1 = teclado.nextInt();

	System.out.printf("Digite o segundo número:");
	num2 = teclado.nextInt();

	teclado.close();

	resultadoSoma = num1 + num2;
	resultadoSubtracao = num1 - num2;
	resultadoDivisao = num1 / num2;
	resultadoMultiplicacao = num1 * num2;

	System.out.println("Seu resultado da Adição:"  + resultadoSoma);

	System.out.println("Seu resultado da Multiplicacao:"  + resultadoMultiplicacao);
		
	System.out.println("Seu resultado da Divisao:"  + resultadoDivisao);
	
	System.out.println("Seu resultado da Subtração:"  + resultadoSubtracao);
	
	}

}
