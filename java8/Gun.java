package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Gun {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();   // <>  known as generic
        name.add("Akash");
        name.add("Angakd");
        name.add("Shubham");
        name.add("Saurabh");
        name.add("Vijaly");
        name.add("Ashish");
        name.add("Aman");
        name.add("om");
        name.add("Akash");


        String ok = "Aman";



       // name.stream().forEach(System.out::println); //this gives a list as it is
       // name.stream().distinct().forEach(System.out::println); //this is gives a unique value of list
       // name.stream().limit(3).forEach(System.out::println); //this gives a only first 3 list values
       // name.stream().skip(2).forEach(System.out::println);  //this is skips a 2 elments from first
       // name.stream().sorted().forEach(System.out::println);   //this gives a sorting order
       // name.stream().map(String::toUpperCase).forEach(System.out::println); //this gives a length of each String
        // name.stream().filter((String ok)->ok.length()>5).forEach(System.out::println);  //filtering the data or list
        int sum = Arrays.stream(new int[]{10,20,30,40,5,50,60}).reduce(0,(a,b)->a+b);
        System.out.println(sum);
//
//        OptionalInt sum1 = Arrays.stream(new int[]{50,60,4,8,7,5}).reduce((a,b)->a+b);
//        System.out.println(sum1);
//
//        name.stream().filter((String names) ->names !=ok).forEach(System.out::println);

        name.stream().filter((String jj)->jj.length() > 5).forEach(System.out::println);

        System.out.println("==============================================================");

        long count = name.stream().filter((String names)->names.length() > 1).count();
        System.out.println(count);

        System.out.println("================================================================");

        List<String> first3no = name.stream().limit(3).collect(Collectors.toList());
        System.out.println(first3no);

        System.out.println("================================================================");


    }
}
