package java8;

public class Test5 implements Abc
{

    @Override
    public void test() {
        int a =10;
        int b = 20;
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.test();

    }
}
