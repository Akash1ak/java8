package java8;

interface electricity
{
    void current();
}
public class Light implements electricity
{
    @Override
    public void current() {
        System.out.println("electricity is a good conductor of heat");
    }

    public static void main(String[] args) {
        Light lg = new Light();
        lg.current();

        electricity ele = new electricity() {
            @Override
            public void current() {
                System.out.println("electricity is also known as current");
            }
        };
        ele.current();

        electricity ee = ()->{
            System.out.println("ok Done");
        };
        ee.current();
    }
}
