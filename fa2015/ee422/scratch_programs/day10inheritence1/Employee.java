package day10inheritence1;

public class Employee {
	
	public int years;

	public Employee (int years) {
		this.years = years;
	}

	public double getSalary() {
		return 40000.0;
	}

	public int getVacationDays() {
		return 10 + 2*years;
	}

	public String getVacationForm() {
		return "yellow";
	}
}
