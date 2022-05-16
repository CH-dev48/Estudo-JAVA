package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, resultadoAdicao,resultadoMultiplicacao,resultadoDivisao = 0 ,resultadoSubtracao,resto;
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro número:");
		num1 = teclado.nextDouble();

		System.out.printf("Digite o segundo número:");
		num2 = teclado.nextDouble();

		teclado.close();
		
		resultadoAdicao = num1 + num2;
		
		if(num1 >= num2) {
		resultadoDivisao = num1 / num2;
		}

		else if(num2 >=  num1) {
			resultadoDivisao = num2 / num1;
		}
		
		resultadoMultiplicacao = num1 * num2;
		
		resultadoSubtracao = num1 - num2;
		
		resto = num1 % num2;
		
		System.out.println("resultado Adição:" + resultadoAdicao);
		
		System.out.println("resultado Substração:" + resultadoSubtracao);
		
		System.out.println("resultado Multiplicação:" + resultadoMultiplicacao);
		
		System.out.println("resultado Divisão:" + resultadoDivisao);
		
		System.out.println("resultado Resto:" + resto);
		
		}
	}


