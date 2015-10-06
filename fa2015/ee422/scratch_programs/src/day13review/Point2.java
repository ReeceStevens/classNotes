package day13review;

public class Point2 {
	int x; 
	int y;
	public Point2 (int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals (Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (o instanceof Point2) 
			return x == ((Point2)o).x && y == ((Point2)o).y;
		return false;
	}
}
