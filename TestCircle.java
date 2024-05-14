public class TestCircle {
    
    public static void main (String[]args)
    {
    Circle emma = new Circle(3.0);

    
    double circumference = emma.getC();
    System.out.println("Circumference: " + circumference);

    double area = emma.getArea();
    System.out.println("Area: " + area);

    emma.changeR(1.0);

    double area2 = emma.getArea();
    System.out.println("New area: " + area2);
    }
}
