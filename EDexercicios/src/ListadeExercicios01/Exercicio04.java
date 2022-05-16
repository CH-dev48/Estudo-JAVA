package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		 double salarioFixo, salarioFinal,numvendas ;
		 
		 //Preço de um produto da venda.
		 double item = 500 , comissao;
		 
		 Scanner teclado = new Scanner(System.in);
		 
			System.out.printf("Digite seu Nome:");
			nome = teclado.next();

			System.out.printf("Digite o seu salário:");
			salarioFixo = teclado.nextDouble();
			
			System.out.printf("Digite o seu número de vendas:");
			numvendas = teclado.nextDouble();
			
			teclado.close();
			comissao = item * numvendas;

			salarioFinal = salarioFixo + ( comissao * 20) / 100;
			
			System.out.printf(nome      
					
					+   salarioFixo+"R$" 
					
			+  salarioFinal+"R$");
			



		
	}

}
