public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int setX){
        this.x = setX;
    }

    public void setY(int setY){
        this.y = setY;
    }
    public double distance(){
        return distance(0, 0);
    }

    public double distance(Point anatherPoint){
        return distance(anatherPoint.x, anatherPoint.y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

}