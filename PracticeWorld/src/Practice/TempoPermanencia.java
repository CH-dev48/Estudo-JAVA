package Practice;

import java.util.Scanner;

public class TempoPermanencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horaEntrada;

		int minEntrada;

		int horaSaida;

		int minSaida;

		

		Scanner teclado = new Scanner(System.in);

		

		System.out.print("Digite a hora de entrada (0 ~ 23): ");

		horaEntrada = teclado.nextInt();

		

		System.out.print("Digite os minutos de entrada (0 ~ 59): ");

		minEntrada = teclado.nextInt();

		

		System.out.print("Digite a hora de saída (0 ~ 23): ");

		horaSaida = teclado.nextInt();

		

		System.out.print("Digite os minutos de saída (0 ~ 59): ");

		minSaida = teclado.nextInt();

		

		teclado.close();

		

		int horaPermanencia = horaSaida - horaEntrada;

		int minPermanencia = minSaida - minEntrada;

		

		System.out.println("O tempo de permanencia na fila foi de " + horaPermanencia

				+ ":" + minPermanencia);
	}

}
