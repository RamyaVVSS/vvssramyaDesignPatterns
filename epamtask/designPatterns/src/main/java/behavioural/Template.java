package behavioural;

public class Template {
	public static void main(String... args) {
		System.out.println("Process of placing an online order:");
		System.out.println();
		ProcessOrder order = new SelectOnline();
		order.processOrder();
		System.out.println();
		System.out.println("Process of storing an order:");
		System.out.println();
		ProcessOrder pad = new PaymentAndDelivery();
		pad.processOrder();
	}
}
