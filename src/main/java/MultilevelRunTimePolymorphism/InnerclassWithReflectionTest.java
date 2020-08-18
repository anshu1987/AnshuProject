package MultilevelRunTimePolymorphism;

/*A static inner class can be instantiated without
the need for an instance of the outer class. In general, an Inner class 
is a part of nested class, called Non-static nested classes in Java. 
The types of inner classes are member inner class, anonymous inner class, and local inner class.
We can instantiate a static inner class with reflection using InnerClass.class.newInstance(). 
If we need an instance of the outer class to instantiate a non-static inner class, */
//we can specify it before a new operator.

public class InnerclassWithReflectionTest {
    public static void main(String args[]) {
        try {
            InnerClass inner = (InnerClass) InnerClass.class.newInstance();
            inner.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // inner class
    static class InnerClass {
        public void test() {
            System.out.println("Testing Inner Class using reflection");
        }
    }
}