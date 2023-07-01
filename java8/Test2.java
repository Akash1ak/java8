package java8;

public class Test2 implements Abc
{
    @Override
    public void test() {
        int a =10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.test();
    }
}
