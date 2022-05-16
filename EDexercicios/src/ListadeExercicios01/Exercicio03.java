package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado = new Scanner(System.in);
		double DistanciaTotal, CombustivelTotal, ConsumoMedio;		
				
		System.out.print("Digite Distancia percorrida pelo veículo(Km/h): ");
		DistanciaTotal = teclado.nextDouble();
		
		System.out.print("Digite o total de Litros Que gastou no veículo(L): ");
		CombustivelTotal = teclado.nextDouble();

		teclado.close();		
		
		ConsumoMedio = DistanciaTotal * CombustivelTotal;

		System.out.println("Consumo médio do seu veículo por Litro:" + ConsumoMedio);
	}

}
