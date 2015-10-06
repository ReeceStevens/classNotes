package day10interface1;

public class Lawyer extends Employee {

	private String sueMsg = "See you in court!";	
	public Lawyer(int years) {
		// First thing this will do is try to call the empty constructor
		// for the superclass. Since there isn't one, it'll give an error.
		// We have to explicitly call the superclass's constructor with a
		// valid argument by using the command "super(years)"
		super(years);	
	}

	@Override
	public int getVacationDays() {
		return 15;
	}

	public String getVacationForm() {
		return "pink";
	}

	public String sue() {
		return sueMsg;
	}
}
