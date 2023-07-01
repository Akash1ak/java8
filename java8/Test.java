package java8;

interface okdone
{
    void show();
}

public class Test implements okdone
{
    @Override
    public void show() {
        System.out.println("this is a show method normal");
    }
}
    class exam {
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        {
            okdone ok = () -> {
                System.out.println("this is a lambda expression methods");
            };
            ok.show();
        }
        okdone done = new okdone() {
            @Override
            public void show() {
                System.out.println("this is a anonymous call");
            }
        };
        done.show();
    }
}




