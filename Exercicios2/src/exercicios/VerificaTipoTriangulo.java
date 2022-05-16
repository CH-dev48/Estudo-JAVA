package exercicios;

import java.util.Scanner;
public class VerificaTipoTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a, b, c;

		

		Scanner teclado = new Scanner(System.in);

		

		System.out.println("Digite o lado a: ");

		a = teclado.nextDouble();

		System.out.println("Digite o lado b: ");

		b = teclado.nextDouble();

		System.out.println("Digite o lado 😄 ");

		c = teclado.nextDouble();

		

		teclado.close();

		// verifica se os três lados formam um triângulo

		if (a < b + c && b < a + c && c < a + b) {

			System.out.println("Os lados formam um triângulo.");

			if (a == b && b == c) { // verifica se todos os lados são iguais

				System.out.println("O triângulo é equilátero.");

			} else if (a == b || b == c || a == c) { // verifica se há dois lados iguais

				System.out.println("O triângulo é isóceles.");

			} else {

				System.out.println("O triângulo é escaleno.");

			}

		} else {

			System.out.println("Os lados NÃO formam um triângulo.");

		}
	}

}
