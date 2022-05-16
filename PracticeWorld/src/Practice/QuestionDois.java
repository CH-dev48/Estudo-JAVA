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
	            System.out.println("o triângulo é equilatero");
	        }else if (la != lb && lb != lc && la != lc) {
	            System.out.println("o triângulo é escaleno");
	        }else if (la == lb || lb == lc || la == lc) {
	            System.out.println("o triângulo é isósceles");
	        }
	        
	        System.out.print("A sua área é: ");
	        System.out.print(resultado);
		       
	}

}
