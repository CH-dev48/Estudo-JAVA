package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado = new Scanner(System.in);
		double DistanciaTotal, CombustivelTotal, ConsumoMedio;		
				
		System.out.print("Digite Distancia percorrida pelo ve�culo(Km/h): ");
		DistanciaTotal = teclado.nextDouble();
		
		System.out.print("Digite o total de Litros Que gastou no ve�culo(L): ");
		CombustivelTotal = teclado.nextDouble();

		teclado.close();		
		
		ConsumoMedio = DistanciaTotal * CombustivelTotal;

		System.out.println("Consumo m�dio do seu ve�culo por Litro:" + ConsumoMedio);
	}

}
