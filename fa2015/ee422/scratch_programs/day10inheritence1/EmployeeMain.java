package day10interface1;

public class EmployeeMain {
	public static void main(String [] args) {
		Employee e = new Lawyer(0);
		Lawywer l = new Lawyer(0);
		System.out.println(e.years);
		System.out.println(l.years);

		System.out.println(e.getVacationDays());
		System.out.println(l.getVacationDays());
	}
}
