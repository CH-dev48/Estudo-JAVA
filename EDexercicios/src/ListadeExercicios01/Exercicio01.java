package ListadeExercicios01;


import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1, num2;
      int resultado;
      Scanner teclado = new Scanner(System.in);

System.out.printf("Digite o primeiro número:");
num1 = teclado.nextInt();

System.out.printf("Digite o segundo número:");
num2 = teclado.nextInt();

teclado.close();

resultado = num1 + num2;

System.out.println("Seu resultado será:" + resultado);

	}

}
