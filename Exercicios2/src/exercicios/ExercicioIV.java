package exercicios;

import java.util.Scanner;

public class ExercicioIV {
	public static void main(String[] args) {
	int num1, num2;
	
	Scanner sc = new Scanner(System.in);
	
System.out.print("Digite o primeiro n�mero:");
num1 = sc.nextInt();

System.out.print("Digite o segundo n�mero:");
num2= sc.nextInt();
	
sc.close();

if(num1> num2) {
	System.out.print("Ordem dos n�meros:"   + num1   + num2);
}
else if (num2 > num1 ) {
	System.out.print("Ordem dos n�meros:"  + num2   + num1);
}
else if(num1 == num2 && num2 == num1){
	System.out.print("Os n�meros s�o iguais, ent�o a ordem n�o altera.");
}
	}
}
