package MultilevelRunTimePolymorphism;

//the finally block will be executed even after a return statement in a method. 

/*The finally block will always execute even an exception 
occurred or not in Java. If we call the System.exit() 
method explicitly in the finally block then only 
it will not be executed. There are few situations where the 
finally will not be executed like JVM crash, power failure, software 
crash and etc. Other than these conditions, the finally block will be always executed.*/

public class FinallyBlockAfterReturnTest {
    public static final int i = 10;

    public static void main(String[] args) {
        System.out.println(count());
    }

    public static int count() {
        try {
            return i;
        } catch (Exception e) {
            return i;
        } finally {
            System.out.println("Finally block will execute even after a return statement in a method");
        }
    }
}