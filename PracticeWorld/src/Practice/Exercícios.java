package Practice;
import java.util.Scanner;
public class Exercícios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ax² + bx + c

		

				// importando classes: CTRL + Shift + O

				

				// declara um scanner para ler do teclado

				Scanner teclado = new Scanner(System.in);

				

				// informa ao usuário o que deve ser digitado

				System.out.print("Digite o coeficiente a: ");

				// declara uma variável do tipo double,

				// e lê do teclado o próximo double.

				double a = teclado.nextDouble();

				System.out.print("Digite o coeficiente b: ");

				double b = teclado.nextDouble();

				System.out.print("Digite o coeficiente c: ");

				double c = teclado.nextDouble();

				

				// fecha fluxo de dados do scanner

				teclado.close();

				

				// Java Extension Pack (Visual Studio Code)

				

				// delta = b² - 4 x a x c

				double delta = Math.pow(b, 2.0) - 4 * a * c;

				

				// imprime o delta calculado

				System.out.println("Delta é igual a " + delta);
	}

}
