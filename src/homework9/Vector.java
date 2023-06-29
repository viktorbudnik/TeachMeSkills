package homework9;

public abstract class Vector implements IntVector {
    private double x;
    private double y;
    private double z;
    public static String VectorDim;

    public Vector(double x, double y) {
            this.x=x;
            this.y=y;
    }
    public Vector(double x, double y, double z){
            this.x=x;
            this.y=y;
            this.z=z;
    }
        public double getX() {
                return x;
        }
        public double getY() {
                return y;
        }
        public double getZ() {
                return z;
        }
    @Override
    public double length() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.getZ(), 2));
    }
    public abstract void getInfoLength();

}
