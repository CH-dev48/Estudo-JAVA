package Practice;
import java.util.Scanner;
public class QuestionSeis {
	
	static int selectedNumber;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			           
	        showMenu();
	    }

	    public static void showMenu() {
	        
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.print("Menu: opção 1 - Pizza Marguerita opção 2 - Pizza de Calabresa opção3 - Pizza de Pepperoni opção4 - Pizza de Mussarela opção5 - Sair");
	        System.out.print("Favor Selecione uma das opções: ");
	        
	        selectedNumber = teclado.nextInt();
	        
	        checkSelection();
	    }

	    public static void checkSelection() {
	        
	        if (selectedNumber == 5) {
	            System.out.print("Obrigado e volte sempre!");
	        }
	        
	        if (selectedNumber == 1) {
	            
	            System.out.print("Sabor de Pizza:  Marguerita");
	            
	            showMenu();
	        }else if (selectedNumber == 2) {
	            System.out.print("Sabor de Pizza: Calabresa");
	            
	            showMenu();
	        }else if (selectedNumber == 3) {
	            System.out.print("Sabor de Pizza:  Pepperoni");
	            
	            showMenu();
	        }else if (selectedNumber == 4) {
	            System.out.print("Sabor de Pizza:  Mussarela");
	            
	            showMenu();
	        }
	}

}
