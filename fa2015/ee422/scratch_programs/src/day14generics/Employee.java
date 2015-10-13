package day14generics;

public class Employee {
	
	public int years;
	
	/*public Employee () {
		this(0);
	}*/
	
	public Employee (int years) {
		this.years = years;
	}
	
	public double getSalary() {
		return 40000.0;
	}
	
	public int getVacationDays() {
		return 10 + getVacationBonus();
	}
	
	public String getVacationForm() {
		return "yellow";
	}
	
	protected int getVacationBonus() {
		return 2*years;
	}

}
