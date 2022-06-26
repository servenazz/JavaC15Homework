package by.tms.lesson6and7;

public class Point {

    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Point (double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance () {
        System.out.println(Math.sqrt (Math.pow(x2 - x1) + Math.pow (y2 - y1)));
        return distance;
    }
}
