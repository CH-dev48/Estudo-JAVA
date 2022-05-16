package Practice;
import java.lang.Math;
import java.util.Scanner;
public class QuestionTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = teclado.nextInt();
        
        boolean bs = (boolean) (ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0); 
        
        if (bs) {
            System.out.println(ano + " é um ano bissexto.");
        }else {            
            System.out.println(ano + " não é um ano bissexto.");
        }
    
	}

}
