package Practice;
import java.lang.Math;
import java.util.Scanner;

public class QuestionDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.print("Digite a: ");
	        double la = teclado.nextDouble();
	        
	        System.out.print("Digite b: ");
	        double lb = teclado.nextDouble();
	        
	        System.out.print("Digite c: ");
	        double lc = teclado.nextDouble();
	        
	        double s = (la + lb + lc) / 2;
	        
	        double resultado = Math.sqrt(s * (s - la) * (s - lb) * (s - lc));
	        
	        if (la == lb && lb == lc) {
	            System.out.println("o tri�ngulo � equilatero");
	        }else if (la != lb && lb != lc && la != lc) {
	            System.out.println("o tri�ngulo � escaleno");
	        }else if (la == lb || lb == lc || la == lc) {
	            System.out.println("o tri�ngulo � is�sceles");
	        }
	        
	        System.out.print("A sua �rea �: ");
	        System.out.print(resultado);
		       
	}

}
