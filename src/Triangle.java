public class Triangle extends Shape {
    private int sideA , sideB , sideC;

    public Triangle(Point topLeft, int sideA, int sideB, int sideC) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0){
            this.sideB = 0;
            throw new IllegalArgumentException("Side can't be negative");
        }
        else {
            this.sideB = sideA;
        }
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

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC < 0){
            this.sideC = 0;
            throw new IllegalArgumentException("Side can't be negative");
        }
        else {
            this.sideC = sideC;
        }
    }

    @Override
    public double area() {
        return (sideA*sideB)*0.5;
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }
}
