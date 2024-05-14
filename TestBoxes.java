public class TestBoxes
{
    public static void main (String[]args)
    {
    Box izzy = new Box(2.0,6.0);

    double area = izzy.getArea();
    izzy.bigger(2.0);
    double perimeter = izzy.getPerimeter();

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
    }
}