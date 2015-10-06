package day13review;
import java.util.*;


public class Point2Tester {
	public static void main (String [] args) {
		Point2 p1 =  new Point2(1,2);
		Point2 p2 = new Point2(2,3);
		Point2 p3 = new Point2(1,2);
		
		boolean b1 = p1 == p3;
		boolean b2 = p1.equals(p3);
		boolean b3 = p1.equals("Hello");
		System.out.println("" + b1 + b2 + b3);

		Set<Point2> pSet = new HashSet<Point2>();
		pSet.add(p1);
		System.out.println(pSet.contains(p1));
		System.out.println(pSet.contains(p3));
	}
}
