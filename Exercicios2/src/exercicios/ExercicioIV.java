package exercicios;

import java.util.Scanner;

public class ExercicioIV {
	public static void main(String[] args) {
	int num1, num2;
	
	Scanner sc = new Scanner(System.in);
	
System.out.print("Digite o primeiro número:");
num1 = sc.nextInt();

System.out.print("Digite o segundo número:");
num2= sc.nextInt();
	
sc.close();

if(num1> num2) {
	System.out.print("Ordem dos números:"   + num1   + num2);
}
else if (num2 > num1 ) {
	System.out.print("Ordem dos números:"  + num2   + num1);
}
else if(num1 == num2 && num2 == num1){
	System.out.print("Os números são iguais, então a ordem não altera.");
}
	}
}
