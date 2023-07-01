package java8;

public class Test1 implements Abc
{

    @Override
    public void test() {
        int a =10;
        int b = 20;
        int c = a*b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.test();

    }
}
