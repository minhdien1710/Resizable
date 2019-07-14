

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);


        Circle circle1 = new Circle(2, "white", false);
        System.out.println(circle1);
        circle1.resize(Math.random()*101);
        System.out.println("new radius after resize: " + circle1.getRadius());

        Rectangle rectangle1 = new Rectangle(20, 10, "blue", true);
        System.out.println(rectangle1);
        rectangle1.resize(Math.random()*101);
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());

        Square square1 = new Square(15, "black", true);
        System.out.println(square1);
        square1.resize(Math.random()*101);
        ;

    }
}
