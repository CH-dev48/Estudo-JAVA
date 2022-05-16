package Practice;

import java.util.Scanner;

public class ExperimentoBiologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int idadeU;

Scanner teclado = new Scanner(System.in);

System.out.print("Digite a sua idade: ");
idadeU = teclado.nextInt();


if(idadeU < 18) {
	System.out.print("Você é menor de idade!");
}
else{
	System.out.print("Você é maior de idade! ");
	
}
	}

}
