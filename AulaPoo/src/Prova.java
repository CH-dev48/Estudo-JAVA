import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor, se digitar uma frase, digite tudo junto.");	
		System.out.println("Digite uma palavra:");
		String pl = sc.nextLine();
			
		String palindromo = "";
		
		for(int i = pl.length() -1; i >= 0; i--){
			
			palindromo += pl.charAt(i);

		}
		
		if(palindromo.equals(pl)) {
			System.out.print("� um pal�ndromo!\n" + palindromo);
		}
		else {
			System.out.print("N�o � um pal�ndromo!\n" + palindromo);
			
		}
		sc.close();
	}
	

}
