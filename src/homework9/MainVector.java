package homework9;

public class MainVector {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(12, 5);
        Vector2D vector2 = new Vector2D(7, 3);
        System.out.println("____________2D_VECTORS_______________");
        System.out.println("Vector#1: "+vector1+"\n"+vector1.vectorDim2D()+"\n"+"Vector length: " +vector1.length());
        System.out.println("Vector#2: "+vector2+"\n"+vector2.vectorDim2D());
        System.out.println("Vector length: "+vector2.length());
        System.out.println("Scalar 2D: "+vector1.Scalar(vector2));
        System.out.println("Sum 2D: " + vector1.Sum(vector2));
        System.out.println("Sub 2D: "+vector1.Sub(vector2));
        Vector2D[] vectorArray2d = Vector2D.arrayVector2D(2);
        System.out.println("Array: "+vectorArray2d[1]);
        System.out.println("Compare vectors: "+vector1.compare(vector2));
        System.out.println("____________3D_VECTORS_______________");
        Vector3D vector3 = new Vector3D(13, 4,-2);
        Vector3D vector4 = new Vector3D(25, 17,-5);
        System.out.println("Vector#3: "+vector3+"\n"+vector3.vectorDim3D()+"\n"+"Vector length: " +vector3.length());
        System.out.println("Vector#4: "+vector4+"\n"+vector4.vectorDim3D()+"\n"+"Vector length: " +vector4.length());
        System.out.println("Scalar 3D: "+vector3.Scalar(vector4));
        System.out.println("Sum 3D: " + vector3.Sum(vector4));
        System.out.println("Sub 3D: "+ vector3.Sub(vector4));
        Vector3D[] vectorArray3d = Vector3D.arrayVector3D(3);
        System.out.println("Array: "+vectorArray3d[1]);
        System.out.println("Compare vectors: "+vector3.compare(vector4));

    }
}
