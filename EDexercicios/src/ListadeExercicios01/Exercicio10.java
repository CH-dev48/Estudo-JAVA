package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio,Pi = 3.14,Area,Perimetro;

		Scanner teclado = new Scanner(System.in);

		System.out.printf("Digite o Raio da sua Circunferência:");
		raio = teclado.nextDouble();
		
		teclado.close();
		
		Area = Pi * (raio * raio);
		
		Perimetro = 2 * Pi *raio;
		
		System.out.println("Área da circunferência:" + Area);
		
		System.out.println("Perímetro da Circunferência:" + Perimetro);
	}

}
