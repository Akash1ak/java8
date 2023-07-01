package java8;


interface small
{
    void jio();
}
public class Mobile implements small
{
    @Override
    public void jio() {
        System.out.println("this is a implement method");
    }
}
class phone
{
    public static void main(String[] args) {
        Mobile mo = new Mobile();
        mo.jio();
        {
            small sm = () -> {
                System.out.println("this ia a lambda expression");
            };
            sm.jio();
        }
        small ll = new small() {
            @Override
            public void jio() {
                System.out.println("this is a annoyances class method");
            }
        };
        ll.jio();

    }
}
