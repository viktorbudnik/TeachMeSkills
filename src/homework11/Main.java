package homework11;
import static homework11.Homework10.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("______task1______");
        String str = "1234-AbC-5678-dEf-R2D2";
        try {
            checkABC(str);
        } catch (ExceptionABC e) {
            e.getStackTrace();
        }
        try {
            check555(str);
        } catch (Exception555 e) {
            e.getStackTrace();
        }
        try {
            check1a2b(str);
        } catch (Exception1a2b e) {
            e.getStackTrace();
        }
    }

}
