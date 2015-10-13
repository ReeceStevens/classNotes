package day14generics;

public class Lawyer extends Employee {

	private String sueMsg = "See you in court!! Bwahahahahahaha!";
	
	public Lawyer (int years) {
		// super();
		super(years);
		this.years = years*2;
	}
	
	@Override
	public int getVacationDays()	{
		return 15 + getVacationBonus();
	}
	
	public String getVacationForm() {
		return "pink";
	}
	
	public void sue() {
		System.out.println( sueMsg);
	}

}
