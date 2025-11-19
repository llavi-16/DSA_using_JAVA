abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing circle");
    }
}

public class Abstraction{
    public static void main(String[] args){
        Shape s = new Circle();
        s.draw();
    }
}