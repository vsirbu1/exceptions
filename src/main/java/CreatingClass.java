public class CreatingClass {
    public static void tryToCreateClass(String className) throws ClassNotFoundException {
        Object object = Class.forName(className);
    }
    public static void tryToCreateClassSecondVariant(String className)  {
        try {
            Object object = Class.forName(className);
        }
        catch (java.lang.ClassNotFoundException e) {
            System.err.println("Not found class "+className);
        }
    }
}
