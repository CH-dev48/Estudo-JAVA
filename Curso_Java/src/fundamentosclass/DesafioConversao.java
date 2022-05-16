package fundamentosclass;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe  o primeiro salário:");
		String valor1 = teclado.next().replace(",",".");
		
		System.out.print("\nInforme  o segundo salário:");
		String valor2 = teclado.next().replace(",",".");
		
		System.out.print("\nInforme  o terceiro salário:");
		String valor3 = teclado.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos Salários é " + media);
		teclado.close();

	}

}
