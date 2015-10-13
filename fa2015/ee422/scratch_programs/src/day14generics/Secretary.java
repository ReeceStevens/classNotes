package day14generics;

public class Secretary extends Employee {
	
	public Secretary (int years) {
		super(years);
	}
	
	protected int getVacationBonus() {
		return 0;
	}

}
