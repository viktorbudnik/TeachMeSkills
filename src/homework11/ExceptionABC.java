package homework11;

public class ExceptionABC extends Exception{
    public ExceptionABC(String str)
    {
        super(str);
        System.out.println(str);
    }
}
