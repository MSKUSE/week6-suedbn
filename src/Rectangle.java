public class Rectangle extends Shape {


    private int sideA , sideB;

    public static int counter = 0;

    public int counterForObject = 0;


    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterForObject++;
    }

    public Rectangle(Point topLeft, int sideA) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideA);
        counter++;
        counterForObject++;
    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw new IllegalArgumentException("Side can't be negative");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            throw new IllegalArgumentException("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }

    public double area() {
        return this.sideA*this.sideB;
    }

    @Override
    public double perimeter() {
        return 2*sideA + 2*sideB;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "sideB=" + sideB +
                ", sideA=" + sideA +
                ", location=" + getLocation() +
                '}';
    }
}
