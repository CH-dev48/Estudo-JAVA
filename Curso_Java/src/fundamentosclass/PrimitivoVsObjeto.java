package fundamentosclass;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String ("texto"); //isso � um objeto 
		s.toUpperCase();
		
		//Wrappers s�o a vers�o objeto do tipo primitivos!
		
		int a = 123;
		System.out.println(a);
	}

}
