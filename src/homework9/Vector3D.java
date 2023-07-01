package homework9;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public String vectorDim3D() {
        return "This vector for the 3d coordinate system";
    }
    public double length() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2)+ Math.pow(this.getZ(), 2));
    }
    public double Scalar(Vector3D vector3D) {
        return x * vector3D.getX() + y * vector3D.getY() + z * vector3D.getZ();
    }
    public Vector3D Sum(Vector3D vector3D) {

        return new Vector3D(x + vector3D.getX(), y + vector3D.getY(), z+ vector3D.getZ());
    }
    public Vector3D Sub(Vector3D vector3D) {
        return new Vector3D(x - vector3D.getX(), y - vector3D.getY(), z - vector3D.getZ());
    }
    public static Vector3D[] arrayVector3D(int size) {
        Vector3D[] vectorArray3d = new Vector3D[size];
        for (int i = 0; i < size; i++) {
            vectorArray3d[i] = new Vector3D((Math.random()*10), (Math.random()*10), Math.random()*10);
        }
        return vectorArray3d;
    }
    public boolean compare(Vector3D vector3D) {
        return (this.x == vector3D.getX() && this.y == vector3D.getY()&&this.z== vector3D.getZ());
    }
    @Override
    public String toString() {
        return x + ", " + y+", " +z;
    }
}

