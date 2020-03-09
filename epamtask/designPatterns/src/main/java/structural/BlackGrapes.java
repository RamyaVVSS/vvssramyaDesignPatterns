package structural;

public class BlackGrapes extends GrapesType{
	public BlackGrapes(GetFruits fruit) {
		super(fruit);
	}
	
	public void getvitamins() {
		super.getvitamins();
		System.out.println("Black grapes contain vitamin C");
	}
}
