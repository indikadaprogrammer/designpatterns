package creational.factorymethod;

public abstract class Creator {
	
	public abstract Product factoryMethod();
	
	public void operation() {
		Product p = factoryMethod();
		// do somehting with product
	}
	
}
