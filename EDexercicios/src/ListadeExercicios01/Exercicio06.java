package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double custodeF,custoDistribuidor,custoImpostos, custoConsumidor;
		
		System.out.println("Digite o valor de f�brica:");
		custodeF = teclado.nextDouble();
		
		teclado.close();
		
		custoDistribuidor = (custodeF * 30) / 100;
		
		custoImpostos = (custodeF * 55)/100;
		
		custoConsumidor = custodeF + custoDistribuidor + custoImpostos;
		
		System.out.println("O pre�o do ve�culo para o consumidor final �:" + custoConsumidor);
		
		
	}

}
