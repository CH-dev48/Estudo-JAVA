package exercicios;
import java.util.Scanner;
public class SituacaoAluno {
	public static void main(String[] args) {

		String nome;

		double n1, n2, n3, media;

		int faltas;

		

		Scanner teclado = new Scanner(System.in);

		

		System.out.print("Digite o nome do aluno: ");

		nome = teclado.next();

		System.out.print("Digite a N1: ");

		n1 = teclado.nextDouble();

		System.out.print("Digite a N2: ");

		n2 = teclado.nextDouble();

		System.out.print("Digite a N3: ");

		n3 = teclado.nextDouble();

		System.out.print("Digite a quantidade de faltas: ");

		faltas = teclado.nextInt();

		

		teclado.close();

		

		media = (n1 + n2 + n3) / 3.0;

		

		System.out.println("Nome: " + nome);

		

		// verifica a quantidade de faltas é maior ou igual a 27

		if (faltas >= 27) {

			System.out.println("Situação: Reprovado por falta.");

		} else if (media >= 5.0) { // verifica se média é maior ou igual a 5.0

			System.out.println("Situação: Aprovado por média.");

		} else {

			System.out.println("Situação: Reprovado por média.");

		}

		

		// outra forma de resolver a questão:

		

		System.out.println("Nome: " + nome);

		// verifica a quantidade de faltas é maior ou igual a 27

		if (faltas < 27) {

			if (media >= 5.0) { // verifica se média é maior ou igual a 5.0

				System.out.println("Situação: Aprovado por média.");

			} else {

				System.out.println("Situação: Reprovado por média.");

			}

		} else {

			System.out.println("Situação: Reprovado por falta.");

		}



	}
}
