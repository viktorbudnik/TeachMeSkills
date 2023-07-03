package homework11;

public class Homework10 {
    public static void checkABC(String str) throws ExceptionABC {
        str = str.toLowerCase();
        if (str.contains("abc")) {
            System.out.println("This string contain 'abc'");
        } else {
            throw new ExceptionABC("This string doesn't contain 'abc'");
        }
    }

    public static void check555(String str) throws Exception555 {
        if (str.startsWith("555", 0)) {
            System.out.println("This string start with '555'");
        } else
            System.out.println("This string doesn't start with '555'");
    }

    public static void check1a2b(String str) throws Exception1a2b{
        if (str.endsWith("1a2b")) {
            System.out.println("This string ends with '1a2b'");
        } else
            System.out.println("This string doesn't ends with '1a2b'");
    }
}
