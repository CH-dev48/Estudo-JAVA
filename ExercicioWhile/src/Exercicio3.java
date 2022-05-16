import java.util.Scanner;

public class Exercicio3 {
public static void iniciar() {
	
	int numero, somaDosNumerosPares = 0, qtdNumeroPares= 0;
			double media;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Digite um número")
	numero = teclado.nextInt();
	
	while(numero!= 0) {
		if (numero > 0 && numero % 2 ==0) {
			somaDosNumerosPares += numero;
			qtdNumeroPares++;
		}
		System.out.print("Digite um número:");
		numero = teclado.nextInt();
	}
	
}

}
