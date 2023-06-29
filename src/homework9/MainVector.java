package homework9;

public class MainVector {
    public static void main(String[] args) {
        Vector vector1 = new Vector2D(12, 5);
        Vector vector2 = new Vector2D(5, 7);
        System.out.println(vector1);
        vector1.getInfoLength();
        System.out.println(vector2);
        vector2.getInfoLength();

        Vector vector3 = new Vector3D(13, 4,-2);
        Vector vector4 = new Vector3D(25, 17,-5);
        System.out.println(vector3);
        vector3.getInfoLength();
        System.out.println(vector4);
        vector4.getInfoLength();


    }
}
