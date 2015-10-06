package day10;
import java.awt.*;
import java.util.*;
import myutils.StopWatch;

public class KnightsTourHomework {
	static final int N = 5;
	static final boolean DEBUG = false;
	static int isInsideTime = 0;
	static int getNextsTime = 0;
	static int makeTourTime = 0;
	static StopWatch sInside = new StopWatch();
	static StopWatch sGetNexts = new StopWatch();
	static StopWatch sMakeTour = new StopWatch();

	/**
	 * This program computes and prints a Knight's tour of an NxN chessboard,
	 * visiting each square once, and only once.  The start and end points  may be 
	 * different.
	 * Initialize size of the chess board.
	 * Initialize starting point.
	 * Call tour calculation method.
	 * Print out the tour.
	 * @param args
	 */
	public static void main(String[] args) {
		Point p = new Point(2, 2);

		ArrayList<Point> tour = new ArrayList<Point>();
		tour.add(p);
		Set<Point> visited = new HashSet<Point>();
		visited.add(p);
		if (makeTour(p, tour)) {
			System.out.println(tour);
		} else {
			System.out.println("No tour.");
		}
		System.out.println(sInside.getElapsedTime()/StopWatch.NANOS_PER_SEC + " sec in Inside");
		System.out.println(sGetNexts.getElapsedTime()/StopWatch.NANOS_PER_SEC + " sec in getNexts");
		System.out.println(sMakeTour.getElapsedTime()/StopWatch.NANOS_PER_SEC + " sec in makeTour");
	}
	
	
	/**
	 * This recursive method starts off with a current starting point, and an ordered 
	 * list representing the squares visited so far.
	 * @param current The starting point for this method call.
	 * @param tour The tour traversed so far, a list of Point objects.
	 * @return true if the tour of all squares was completed, false otherwise.
	 */
	static boolean makeTour (Point current, ArrayList<Point> tour) {
		sMakeTour.start();
		if (tour.size() == N*N)
			return true;
		
		ArrayList<Point> nexts = getNexts(current);
		for (Point p1 : nexts) { // Go through all possible next moves.
			if (!tour.contains(p1)) { // Proceed only if the next move has not been visited.
				tour.add(p1); // Add the selected 'next move' to the tour.
				if (DEBUG) System.out.println(current + " " + p1 + " " + tour);
				boolean result = makeTour(p1, tour); // Call the tour recursively
				if (result) {
					return true; // If you succeed, pass true all the way to the top.
				} else {
					tour.remove(tour.size() -1); // remove this 'next move', and try another
				}
			}
		}
		sMakeTour.stop();
		return false;	// If the for loop exits, we haven't been successful from this starting point.
	}
	
	static boolean isInside (Point p) {
		sInside.start();
		boolean inside = p.x >= 0 && p.y >= 0 && p.x < N && p.y < N;
		sInside.stop();
		return inside;
	}
	
	static ArrayList<Point> getNexts(Point p) {
		sGetNexts.start();
		ArrayList<Point> nexts = new ArrayList<Point>();
		nexts.add(new Point(p.x + 2, p.y + 1));
		nexts.add(new Point(p.x + 2, p.y - 1));
		nexts.add(new Point(p.x - 2, p.y + 1));
		nexts.add(new Point(p.x - 2, p.y - 1));
		nexts.add(new Point(p.x + 1, p.y + 2));
		nexts.add(new Point(p.x + 1, p.y - 2));
		nexts.add(new Point(p.x - 1, p.y + 2));
		nexts.add(new Point(p.x - 1, p.y - 2));
		
		Iterator<Point> i1 = nexts.iterator();
		while (i1.hasNext()) {
			if (!isInside(i1.next())) {
				i1.remove();
			}
		}
		sGetNexts.stop();
		return nexts;
	}
}
