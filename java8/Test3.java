package java8;

public class Test3  implements Abc
{

    @Override
    public void test()
    {
        int a =10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test();
    }
}
