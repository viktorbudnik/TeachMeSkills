package homework9;

public class Vector2D extends Vector{
    public Vector2D(double x, double y) {
        super(x, y);
        Vector.VectorDim = "This vector in the 2d coordinate system";
    }
    @Override
    public String toString() {
        return VectorDim;
    }

    @Override
    public double getVectorLength() {
        return 0;
    }
    @Override
    public void getInfoLength() {
        System.out.println("x: " + this.getX() +"  y: " + this.getY() + "\nlength: " + length()+"\n");
    }

}
