public class DividingException extends Exception {
    private String exception;
    public DividingException(double firstNumber, double secondNumber)
    {
        if(firstNumber==0.0&&secondNumber!=0.0)
        {
            exception="0 divide any number is 0";
        }
        if(secondNumber==0.0&&firstNumber!=0.0)
        {
            exception="any number divide by 0 is Infinity";
        }
        if(firstNumber==0.0&&secondNumber==0.0)
        {
            exception="0 divide 0 is uncertainty";
        }
    }
    public String getException()
    {
        return exception;
    }
}
