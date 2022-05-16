package Practice;

import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;

		int b;

		

		Scanner teclado = new Scanner(System.in);

		

		System.out.print("Digite um número:");

		a = teclado.nextInt();

		

		System.out.print("Digite um outro número:");

		b = teclado.nextInt();

		

		teclado.close();

		

		System.out.println("a = " + a + " b = " + b);

		

		System.out.println("Realizando a troca...");



		int auxiliar = a;

		a = b;

		b = auxiliar;

		

		System.out.println("Agora temos...");

		System.out.println("a = " + a + " b = " + b);
	}

}
