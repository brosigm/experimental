package utils;

public class Cords {
    private int x;
    private int y;

    Cords(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getDistanceFrom(Cords other){
        return (int) Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
