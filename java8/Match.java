package java8;

interface ball
{
    void Redball(String s);
}
public class Match implements ball
{
    @Override
    public void Redball(String s ) {
        System.out.println("the red ball use in  "+s);
    }

    public static void main(String[] args) {
        Match ma = new Match();
        ma.Redball("Test");

        ball ba = new ball() {
            @Override
            public void Redball(String s) {
                System.out.println("test match is going for "+s);
            }
        };
        ba.Redball("10 says");

        //lambda
        ball be = (String ok) ->{
            System.out.println("test champions are "+ok);
        };
        be.Redball("australia");
    }
}
