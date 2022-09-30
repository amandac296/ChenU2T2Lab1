public class Point {

    //instance variables
    private int x;
    private int y;

    //constructor that accepts and sets both instance variables
    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    //constructor that accepts one value and sets both x and y to the same value
    public Point (int value){
        x = value;
        y = value;
    }

    //constructor that has no parameters and sets x and y to 0 (the origin)
    public Point (){
        x = 0;
        y = 0;
    }

    //a "getter" method for x
    public int getX(){
        return x;
    }

    //a "getter" method for y
    public int getY (){
        return y;
    }

    //a "setter" method for x
    public int setX (int newX){
        x = newX;
    }

    //a "setter" method for y
    public int setY (int newY) {
        y = newY
    }

}
