import java.util.Scanner;

public class Exercicio2 {

	public static void iniciar() {
		
	double multiplicando, multiplicador, resultado, contador;
	
	Scanner teclado = new Scanner(System.in);
	System.out.print("Digite um n�mero");
	multiplicando = teclado.nextDouble();
	System.out.print("Digite outro n�mero");
	multiplicador = teclado.nextDouble();
	teclado.close();
	
	resultado = multiplicando;
	contador = multiplicador;
	
	//2 x 3 = 6
	//2+2 + = 6
	//repeti��es vai ser de multiplicador - 1
	while(contador > 1) {
		resultado += multiplicando;
		multiplicador --;
	}
	System.out.println(multiplicando + "X"+ multiplicador + "="+ resultado);
	}
	
}
