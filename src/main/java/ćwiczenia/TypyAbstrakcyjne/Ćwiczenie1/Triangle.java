package ćwiczenia.TypyAbstrakcyjne.Ćwiczenie1;

class Triangle implements Shape {

    private double firstArm;
    private double secondArm;
    private double thirdArm;

    public Triangle(double firstArm, double secondArm, double thirdArm) {
        this.firstArm = firstArm;
        this.secondArm = secondArm;
        this.thirdArm = thirdArm;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = (firstArm + secondArm + thirdArm) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstArm) * (halfPerimeter - secondArm) * (halfPerimeter - thirdArm));
    }

    @Override
    public double calculatePerimeter() {
        return firstArm + secondArm + thirdArm;
    }
}
