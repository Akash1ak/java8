package java8;
@FunctionalInterface        //  -->only one abstract method is allowed
public interface Abc
{
    void test();

    // abstract void rada();    only one abstract method is there
    default void show()  //we can use default method or static method for a Backword Compatability means exting or old code no problem for new implementation
    {
        System.out.println("this is show method");
    }
}
