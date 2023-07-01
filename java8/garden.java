package java8;

interface sofa
{
    void chair(int a);
}

public class garden implements sofa
{
    @Override
    public void chair(int a) {
        System.out.println("in this garden "+a + "chair");
    }
}
class children {
    public static void main(String[] args) {
        garden ch = new garden();
        ch.chair(20);

        {
            sofa ok = (int a) -> {
                System.out.println("this is a lambda expression methods" + a);
            };
            ok.chair(10);
        }
        sofa so = new sofa() {
            @Override
            public void chair(int a) {
                System.out.println("this is a garden");
            }
        };
        so.chair(50);
        }
    }
