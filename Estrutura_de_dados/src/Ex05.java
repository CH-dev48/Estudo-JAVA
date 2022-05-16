import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> PriceModelList = new ArrayList<>();
	    ArrayList<ArrayList<String>> PriceQtyList = new ArrayList<>();
	    ArrayList<ArrayList<String>> PriceTotalList = new ArrayList<>();

	    for (int i = 0; i < nome.length; i++) {
	        PriceModelList.add(new ArrayList<String>());
	        String[] PriceModel = {"s6", "s7", "note4", "note5", "j5", "j6"};
	        for (int j = 0; j < PriceModel.length; j++) {
	            PriceModelList.get(i).add(PriceModel[j]);
	        }

	        PriceQtyList.add(new ArrayList<String>());
	        String[] PriceQut = {"12", "13", "21", "15", "43", "21"};
	        for (int k = 0; k < PriceQut.length; k++) {
	            PriceQtyList.get(i).add(PriceQut[k]);
	        }

	        PriceTotalList.add(new ArrayList<String>());
	        String[] PriceTotal = {"1323", "1312321", "43123212", "43434", "12312", "43322"};
	        for (int m = 0; m < PriceTotal.length; m++) {
	            PriceTotalList.get(i).add(PriceTotal[m]);
	        }
	    }

	    ArrayList<ArrayList<ArrayList<String>>> CustomersShoppingLists = new ArrayList<>();
	    CustomersShoppingLists.add(PriceModelList);
	    CustomersShoppingLists.add(PriceQtyList);
	    CustomersShoppingLists.add(PriceTotalList);

	}

}
