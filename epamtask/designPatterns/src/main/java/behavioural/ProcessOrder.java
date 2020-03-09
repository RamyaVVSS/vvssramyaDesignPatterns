package behavioural;

public abstract class ProcessOrder {
	public boolean product;
	public abstract void Select();
	public abstract void Pay();
	public abstract void Delivery();

	public final void processOrder() {
		Select();
		Pay();
		Delivery();
	}
}
