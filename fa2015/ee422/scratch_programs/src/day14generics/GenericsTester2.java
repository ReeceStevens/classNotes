package day14generics;

public class GenericsTester2 {
	public static void main(String [] args) {
		Employee [] array = new Lawyer[10];		
		// BAD THING! 
		// array[0] = new Secretary(0);
	}
}

class Marketer extends Employee {
	public Marketer() {
		super(0);
	}	


	/*
	 * If we override this function in a subclass of
	 * marketer, you can return any object.
	 */
	public Object doSomething() {
		return new Object();
	}

	public Employee doSomethingElse(Employee e) {
		return e;
	}
}

class Advertiser extends Marketer {
	/*
	 * KEY THING HERE:
	 * Java allows this as a more specific type override.
	 * Covariance of return types
	 * 	A subclass can override a superclass function and
	 * 	return a subclass of the return type's class.
	 */
	@Override
	public Employee doSomething() {
		return new Employee(0);	
	}
	
	@Override
	//public Employee doSomethingElse(Marketer m){
	public Employee doSomethingElse(Employee e){
		return new Marketer();
	}
}
