package java8;

interface mypleasure
{
    abstract void apology();
    default void please()
    {
        System.out.println("she said sorry");
    }
    static void regrate()
    {
        System.out.println("i feel regrate when she said sorry" );
    }
}
public class sorry implements mypleasure
{

    @Override
    public void apology() {
        System.out.println("apology is a one of the great behaviour");
    }

    public static void main(String[] args) {
        sorry so = new sorry();
        so.apology();
        so.please();
        mypleasure.regrate();
    }
}
