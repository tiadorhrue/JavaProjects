package GroupProject2;

public interface Shape {

    void calculateArea (int num);
    void calculatePerimeter(int num);
}
class Cirlce implements Shape{
    @Override
    public void calculatePerimeter(int radius) {

        System.out.println("The Perimeter of a circle is "+2*Math.PI*radius);
    }
    @Override
    public void calculateArea(int radius ) {
        System.out.println("The area of a circle is "+Math.PI*(radius*radius));

    }
}
class Square implements Shape{


    @Override
    public void calculateArea(int side) {
        System.out.println("The area of a square is "+side*side);

    }

    @Override
    public void calculatePerimeter(int side) {
        System.out.println("The Perimeter of a square is "+4*side);

    }
}
class ShapeTester{
    public static void main(String[] args) {
        Cirlce circle=new Cirlce();
        circle.calculateArea(4);
        circle.calculatePerimeter(4);

        System.out.println();

        Square square=new Square();
        square.calculateArea(4);
        square.calculatePerimeter(4);
    }
}