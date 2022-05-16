package exercicios;
import java.util.Scanner;
public class RaizeSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double a, b, c, delta, r1, r2;

		

		Scanner teclado = new Scanner(System.in);

		// 1. Pedir ao usuário para entrar com os coeficientes

		System.out.print("Digite o coeficiente a: ");

		a = teclado.nextDouble();

		System.out.print("Digite o coeficiente b: ");

		b = teclado.nextDouble();

		System.out.print("Digite o coeficiente 😄 ");

		c = teclado.nextDouble();

		

		teclado.close();

		// 2. Calcular o delta da equação

		delta = Math.pow(b, 2.0) - 4 * a * c;

		

		// 3. Calcular as raízes da equação

		if (delta > 0) {

			System.out.println("delta é maior que zero, logo possui duas raízes reais...");

			r1 = (-1.0 * b + Math.sqrt(delta)) / (2.0 * a);

			r2 = (-1.0 * b - Math.sqrt(delta)) / (2.0 * a);

			System.out.println("r1: " + r1 + " e r2: " + r2);

		} else if (delta == 0) {

			System.out.println("delta é igual zero, logo possui duas raízes iguais...");

			r1 = (-1.0 * b + Math.sqrt(delta)) / 2.0 * a;

			r2 = r1;

			System.out.println("r1: " + r1 + " e r2: " + r2);

		} else {

			System.out.println("A equação não possui raízes reais.");

		}


	}

}
