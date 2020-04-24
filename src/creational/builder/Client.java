package creational.builder;

public class Client {

	AbstractBuilder builder = null;
	
	public Client(AbstractBuilder builder) {
		this.builder = builder;
	}
	
	public Product getProduct() {
		builder.setProperty1("val1");
		builder.setProperty2("val2");
		return builder.build();
	}
	
}
