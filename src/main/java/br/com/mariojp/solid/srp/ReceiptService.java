package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {

        double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.calculateTax(subtotal);
        double total = subtotal + tax;

		ReceiptFormatter receiptFormatter = new ReceiptFormatter();

		return receiptFormatter.formatReceipt(order, subtotal, tax,total);
	}
}
