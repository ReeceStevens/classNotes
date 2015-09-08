package pointwork;

public class Point {
    int x, y;
    
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int newx) {
        x = newx;
    }

    public void getX(void) {
        return x;
    }

    public void getY(void) {
        return y;
    }


    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public double getDistance(Point other) {
        double distance = Math.pow((other.x-x),2) + Math.pow((other.y - y),2);
        distance = Math.sqrt(distance);
        return distance;
    }
}
