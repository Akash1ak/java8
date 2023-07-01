package java8;

interface some
{
    void dell(String so);
}
public class laptop implements some {
    @Override
    public void dell(String s) {
        System.out.println("dell built quality is best " + s);
    }

}
class tab {
    public static void main(String[] args) {
        laptop lo = new laptop();
        lo.dell("good");

        {
            some so = (String d) -> {
                System.out.println("this is a lambda expression and tab is so " + d);
            };
            so.dell("expensive");
        }
        some s = new some() {
            @Override
            public void dell(String so) {
                System.out.println("this is a antonyms class  and amount is  "+so);
            }
        };
        s.dell("50000");
    }
}



