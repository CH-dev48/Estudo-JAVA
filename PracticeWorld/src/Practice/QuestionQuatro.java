package Practice;
import java.util.Scanner;
public class QuestionQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);

	        System.out.print("Digite o sexo: ");
	        String sex = teclado.nextLine();
	        
	        System.out.print("Digite a idade: ");
	        int idade = teclado.nextInt();
	        
	        System.out.print("Digite o tempo de contribui��o: ");
	        int cont = teclado.nextInt();
	        
	        if (sex.equals("M") && idade >= 65 && cont >= 10) {
	            System.out.print("a Pessoa � APOSENT�VEL.");
	        }else if (sex.equals("M") && idade >= 63 && cont>= 15) {
	            System.out.print("a Pessoa � APOSENT�VEL.");
	        }else if (sex.equals("F") && idade >= 63 && cont >= 10) {
	            System.out.print("a Pessoa � APOSENT�VEL.");
	        }else if (sex.equals("F") && idade >= 61 && cont >= 15) {
	            System.out.print("a Pessoa � APOSENT�VEL.");
	        }else{
	            System.out.print("a Pessoa N�O � APOSENT�VEL.");
	        }
	}

}
