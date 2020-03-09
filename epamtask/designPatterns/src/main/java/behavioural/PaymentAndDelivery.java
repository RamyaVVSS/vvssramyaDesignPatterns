package behavioural;

public class PaymentAndDelivery extends ProcessOrder{
	@Override
	public void Select() {
		System.out.println("Customer chooses the item directly from the store");
	}

	@Override
	public void Pay() {
		System.out.println("Pays at the counter by cash/card");
	}

	@Override
	public void Delivery() {
		System.out.println("The item is collected in the delivery counter");
		
	}
}
