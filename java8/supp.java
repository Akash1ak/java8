package java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class supp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };  //consumer
        numbers.forEach(method);


        ArrayList<String> words = new ArrayList<>();
        words.add("all");
        words.add("students");
        words.add("are great");
        words.add("but saurabh & shubham");
        words.add("extra ordinary student");

        Consumer<String> app = (s) -> {
            System.out.println(s);
        };
        words.forEach(app);
    }
}
