import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestOurClasses {

    @ParameterizedTest
    @CsvSource({"First test string, First test string","First test string,Second test string"})
    public void assertionChecking(String s1 , String s2)
    {
        try {
            Assertion.compare(s1,s2);
        } catch (AssertionError e) {
            System.err.println("Strings are't equal");
            System.out.println(s1+ " is not "+s2);
            System.exit(0);
        }
    }
    @ParameterizedTest
    @CsvSource({"5.4, 2.2","0,45.5","2.98,0","0,0"})
    public void divideByZerochecking(double fn , double sn)
    {
        try {
            Double result =DivideByZero.dividing(fn,sn);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("You try to divide sensitive numbers");
        }
    }
    @ParameterizedTest
    @CsvSource({"5.4, 2.2","0.0,45.5","2.98,0.0","0.0,0.0"})
    public void checkingOpportunityToDivide(double fn, double sn)
    {
        System.out.println(fn+" "+sn);
        try{
            CheckDividing.checkDividing(fn,sn);
        } catch (DividingException e) {
            e.printStackTrace();
            System.err.println(e.getException());
        }
    }
    @Test
    public void creatingClass() throws ClassNotFoundException {
        String className = "RandomName";

        try {
            CreatingClass.tryToCreateClass(className);
        }
        catch (java.lang.ClassNotFoundException e) {
            throw new ClassNotFoundException("Not found class "+className);
        }

    }
    @Test
    public void creatingClassAnother() {
        String className = "AnotherRandomName";
        CreatingClass.tryToCreateClassSecondVariant(className);
    }
}
