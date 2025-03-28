public class Main {
    public static void main(String[] args) {

        Point p = new Point(3, 4);
        Rectangle r1 = new Rectangle(p, 3, 4);
        System.out.println(Rectangle.counter);
        System.out.println(r1.counterForObject);

        Rectangle r2 = new Rectangle(p, 3, 4);
        System.out.println(Rectangle.counter);
        System.out.println(r1.counterForObject);
        System.out.println(r2.counterForObject);

        System.out.println(Integer.parseInt("3"));

        System.out.println(p);
        Triangle t1 = new Triangle(p, 3,4,5);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());

    }
}