package java8;

public interface shutup
{
    void up(int a,String o);
}
class mouth implements shutup
{

    @Override
    public void up(int a, String o) {
        System.out.println("number is "+a + "string is "+o);
    }
}
class hand
{
    public static void main(String[] args) {
        mouth mo = new mouth();
        mo.up(55,"shutup");
        {
            shutup su = (int d ,String l) -> {
                System.out.println("this is lambda "+ d + "String "+ l);
            };
            su.up(6,"swim");
        }
        shutup sh = new shutup() {
            @Override
            public void up(int a, String o) {
                System.out.println("int i "+ a + "String os "+o);
            }
        };
        sh.up(89,"jvnwejivnijern");
    }
}
