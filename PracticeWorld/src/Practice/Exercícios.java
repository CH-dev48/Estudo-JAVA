package Practice;
import java.util.Scanner;
public class Exerc�cios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ax� + bx + c

		

				// importando classes: CTRL + Shift + O

				

				// declara um scanner para ler do teclado

				Scanner teclado = new Scanner(System.in);

				

				// informa ao usu�rio o que deve ser digitado

				System.out.print("Digite o coeficiente a: ");

				// declara uma vari�vel do tipo double,

				// e l� do teclado o pr�ximo double.

				double a = teclado.nextDouble();

				System.out.print("Digite o coeficiente b: ");

				double b = teclado.nextDouble();

				System.out.print("Digite o coeficiente c: ");

				double c = teclado.nextDouble();

				

				// fecha fluxo de dados do scanner

				teclado.close();

				

				// Java Extension Pack (Visual Studio Code)

				

				// delta = b� - 4 x a x c

				double delta = Math.pow(b, 2.0) - 4 * a * c;

				

				// imprime o delta calculado

				System.out.println("Delta � igual a " + delta);
	}

}
