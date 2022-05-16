package Practice;

import java.util.Scanner;

public class ValorSaque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  int qtdCem;

	int qtdCinquenta;

	int qtdVinte;

	int qtdDez;

	int qtdCinco;

	int qtdUm;

		

	int valorSaque;

	int valorTemp;

	

	Scanner teclado = new Scanner(System.in);

	

	System.out.print("Digite o valor de saque: ");

	valorSaque = teclado.nextInt();

	

	teclado.close();

	

	qtdCem = valorSaque / 100;

	valorTemp = valorSaque % 100;

	

	qtdCinquenta = valorTemp / 50;

	valorTemp = valorTemp % 50;

	

	qtdVinte = valorTemp / 20;

	valorTemp = valorTemp % 20;

	

	qtdDez = valorTemp / 10;

	valorTemp = valorTemp % 10;

	

	qtdCinco = valorTemp / 5;

	valorTemp = valorTemp % 5;

	

	qtdUm = valorTemp ;

	

	System.out.println("Quantidade de notas:");

	System.out.println("100:" + qtdCem);

	System.out.println("50:" + qtdCinquenta);

	System.out.println("20:" + qtdVinte);

	System.out.println("10:" + qtdDez);

	System.out.println("5:" + qtdCinco);

	System.out.println("1:" + qtdUm);

	

	
	}

}
