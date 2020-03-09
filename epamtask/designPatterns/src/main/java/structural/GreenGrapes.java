package structural;

public class GreenGrapes extends GrapesType{
	public GreenGrapes(GetFruits fruit) {
		super(fruit);
	}
	
	public void getvitamins() {
		super.getvitamins();
		System.out.println("Green grapes contain vitamin C");
	}
}
