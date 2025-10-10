public abstract class Parallelogram implements Figure {
    private double height;
    private double width;

    public Parallelogram(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}