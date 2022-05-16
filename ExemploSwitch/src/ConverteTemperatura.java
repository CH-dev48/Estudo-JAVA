import java.util.Scanner;

public class ConverteTemperatura {

	public static void iniciar() {
		double temp, conversao;
		char opcao;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura: ");
		temp = teclado.nextDouble();
		System.out.print("Digite opção para conversão(c - Celsius / f - Fahrenheit):");
		opcao = teclado.next().charAt(0);
		
		switch(opcao) {
		
		case 'c';
		break
		}
		
	
	}
	
}
