package creational.prototype;

public class ConcretePrototype implements Prototype {

	@Override
	public Prototype clone() {
		ConcretePrototype copy = new ConcretePrototype();
		// set properties of copy accordingly
		return copy;
	}
}
