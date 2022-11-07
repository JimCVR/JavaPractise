package Tema_8;

public class Punto {
    private int x;
    private int y;
    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "("+ x +"," + y +")";
    }

    public int [] getXY(){
        int [] results = new int [2];
        results[0] = x;
        results[1] = y;
        return results;
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    public double distance(int x,int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

}
