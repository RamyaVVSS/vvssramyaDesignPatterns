package behavioural;

public class SelectOnline extends ProcessOrder{
	@Override
	public void Select() {
		System.out.println("Select the Item and add to the online shopping cart");
		System.out.println("Select the delivery address");
	}

	@Override
	public void Pay() {
		System.out.println("Online Payment can be done through Netbanking/Cards");
		
	}

	@Override
	public void Delivery() {
		System.out.println("The item is delivered to the respective address");
	}
}
