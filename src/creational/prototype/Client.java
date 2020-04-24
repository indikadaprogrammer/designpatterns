package creational.prototype;

public class Client {

	Prototype prototype = null;
	
	public Client(Prototype p) {
		this.prototype = p;
	}
	
	public void operation() {
		
		//When want to instantiate an object of prototype
		Prototype obj = prototype.clone();
		//Do stuff with obj
	
	}
}
