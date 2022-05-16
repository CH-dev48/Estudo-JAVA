package fundamentosclass;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.print("Bom");
		System.out.print("dia!\n");
		
		System.out.println("Bom");
		System.out.println ("Bom");
		
		System.out.printf("Megasena: ");
				 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para trás.
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		 
		teclado.close();
	}

}
