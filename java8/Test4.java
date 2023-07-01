package java8;

public class Test4 implements Abc
{

    @Override
    public void test() {
        int a =10;
        int b = 20;
        int c = a-b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.test();

    }
}
