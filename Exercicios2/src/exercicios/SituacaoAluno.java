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

		

		// verifica a quantidade de faltas � maior ou igual a 27

		if (faltas >= 27) {

			System.out.println("Situa��o: Reprovado por falta.");

		} else if (media >= 5.0) { // verifica se m�dia � maior ou igual a 5.0

			System.out.println("Situa��o: Aprovado por m�dia.");

		} else {

			System.out.println("Situa��o: Reprovado por m�dia.");

		}

		

		// outra forma de resolver a quest�o:

		

		System.out.println("Nome: " + nome);

		// verifica a quantidade de faltas � maior ou igual a 27

		if (faltas < 27) {

			if (media >= 5.0) { // verifica se m�dia � maior ou igual a 5.0

				System.out.println("Situa��o: Aprovado por m�dia.");

			} else {

				System.out.println("Situa��o: Reprovado por m�dia.");

			}

		} else {

			System.out.println("Situa��o: Reprovado por falta.");

		}



	}
}
