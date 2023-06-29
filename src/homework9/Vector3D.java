package homework9;

public class Vector3D extends Vector {
    public Vector3D(double x, double y, double z) {
        super(x, y,z);
        Vector.VectorDim = "This vector in the 3d coordinate system";
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
        System.out.println("x: " + this.getX() + "  y: " + this.getY() + "  z: " + this.getZ() + "\nlength: " + length()+"\n");
    }
}

