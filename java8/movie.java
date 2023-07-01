package java8;
interface song
{
    void bestsong(String song);
}
public class movie implements song {

    @Override
    public void bestsong(String song) {
        System.out.println("this is a best song total "+song +" duration");
    }
}
class act {
    public static void main(String[] args) {
        movie mo = new movie();
        mo.bestsong("5 min");
        {
          song ii = (String so) ->{
              System.out.println("lambda song "+so);
          };
          ii.bestsong("dhoka");
        }
        song ll = new song() {
            @Override
            public void bestsong(String song) {
                System.out.println("song is "+song);
            }
        };
        ll.bestsong("la la la ");
    }
}
