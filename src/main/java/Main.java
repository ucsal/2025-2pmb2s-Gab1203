import br.com.mariojp.solid.srp.*;

public class Main {
	
	public static void main(String[] args) {
		
		Order o = new Order();
		o.add(new Item("Café", 8.0, 2)); // 16
		o.add(new Item("Bolo", 12.5, 1)); // 12.5
        System.setProperty("tax.rate", "0.10");// -> subtotal 28.5
		String receipt = new ReceiptService().generate(o);
		System.out.println(receipt);
		
	}
}
