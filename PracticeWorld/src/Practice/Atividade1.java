package Practice;
import java.lang.Math;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int n = teclado.nextInt();
double resultado = (Math.sqrt(n) + (n/2) + (Math.pow(n, 2)));

System.out.println(resultado);
	}

}
