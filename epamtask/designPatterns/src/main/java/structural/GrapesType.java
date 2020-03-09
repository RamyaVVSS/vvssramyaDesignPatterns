package structural;

public class GrapesType implements GetFruits{
	protected GetFruits fruit;

	public GrapesType(GetFruits fruit){
		this.fruit= fruit;
	}

	public void getvitamins() {
		this.fruit.getvitamins();
	}
}
