package ListadeExercicios01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;

Scanner teclado = new Scanner(System.in);

System.out.printf("Digite um Número:");
num  =  teclado.nextInt();

teclado.close();
for(int i = 1; i < 11; i++){
	System.out.println(num + "X" + i +"="+ (num * i));
}
	}

}
