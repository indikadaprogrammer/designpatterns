package creational.builder;

public class ConcreteBuilder implements AbstractBuilder {

	String property1 = null;
	String property2 = null;
	
	@Override
	public void setProperty1(String val) {
		this.property1 = val;
	}

	@Override
	public void setProperty2(String val) {
		this.property2 = val;
	}

	@Override
	public Product build() {
		return new Product(property1, property2);
	}

}
