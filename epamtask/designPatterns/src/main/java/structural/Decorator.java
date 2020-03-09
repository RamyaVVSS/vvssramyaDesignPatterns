package structural;

public class Decorator {
	public static void main(String[] args) {
		GetFruits blackgrapes = new BlackGrapes(new Grapes());
		blackgrapes.getvitamins();
		
		System.out.println();
		
		GetFruits grapes = new BlackGrapes(new GreenGrapes(new Grapes()));
		grapes.getvitamins();

	}
}
