package homework9;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String vectorDim2D() {
        return "This vector for the 2d coordinate system";
    }

    public double length() {

        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
    }

    public double Scalar(Vector2D vector2D) {

        return x * vector2D.getX() + y * vector2D.getY();
    }

    public Vector2D Sum(Vector2D vector2D) {

        return new Vector2D(x + vector2D.getX(), y + vector2D.getY());
    }

    public Vector2D Sub(Vector2D vector2D) {
        return new Vector2D(x - vector2D.getX(), y - vector2D.getY());
    }

    public static Vector2D[] arrayVector2D(int size) {
        Vector2D[] vectorArray2d = new Vector2D[size];
        for (int i = 0; i < size; i++) {
            vectorArray2d[i] = new Vector2D((Math.random() * 10), Math.random() * 10);
        }
        return vectorArray2d;
    }

    public boolean compare(Vector2D vector2D) {
        return (this.x == vector2D.getX() && this.y == vector2D.getY());
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }

}
