import java.util.*;

abstract class Shape{
    abstract void draw();
}

class Square extends Shape{
    @Override
    void draw(){
        System.out.println("You drew a square.");
    }
}

class Assessment1{
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();        
    }
}