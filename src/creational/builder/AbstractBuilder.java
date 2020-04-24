package creational.builder;

public interface AbstractBuilder {
	
	public void setProperty1(String val);
	
	public void setProperty2(String val);
	
	public Product build();
	
	
}
