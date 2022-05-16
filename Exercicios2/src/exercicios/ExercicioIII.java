package exercicios;

import java.util.Scanner;
public class ExercicioIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int NumA, NumB;

Scanner sc =  new Scanner(System.in);

System.out.print("Digite o número A: ");
NumA = sc.nextInt();

System.out.print("Digite o número B: ");
NumB = sc.nextInt();

sc.close();

if(NumA % NumB == 0) {
	
	System.out.print("O Número A é divisível por B! ");
}
else {
	
	System.out.print("O Número A não é divisível por B! ");
}
	}

}
