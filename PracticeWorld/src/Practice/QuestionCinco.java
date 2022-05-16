package Practice;
import java.util.Scanner;
public class QuestionCinco {
static double n = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int t = teclado.nextInt();
        
        boolean cres = true;
        double ultimoN = 0;
        
        for (int i = 0; i < t; i++) {
            ultimoN = n;
            System.out.print("Digite um número: ");
            double n = teclado.nextDouble();
            
            if (n < ultimoN) {
                cres = false;
            }
        }
        
        if (cres) {
            System.out.print("Os números digitados estão em ordem crescente.");
        }else{
            System.out.print("Os números digitados  estão em ordem decrescente.");
        }
	}

}
