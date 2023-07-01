package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Mahabharat {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Yudhishthira");
        list.add("Arjun");
        list.add("Bheem");
        list.add("Nakul");
        list.add("Sahadev");


        System.out.println("====================Filter=========================");
        list.stream().filter((String d) -> d.length() > 3).forEach(System.out::println);
        System.out.println("====================Distinct=========================");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("====================Limit=========================");
        list.stream().limit(5).forEach(System.out::println);
        System.out.println("====================Skips=========================");
        list.stream().skip(1).forEach(System.out::println);
        System.out.println("====================Map=========================");
        Map<String, Integer> ok = list.stream().collect(Collectors.toMap(String::toString, String::length));
        System.out.println(ok);
        System.out.println("====================Sorted=========================");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("====================Sortedlengthofcharacter=========================");
        list.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);
        System.out.println("====================Reduce=========================");
        int sum =Arrays.stream(new int[] {7,5,9,8,6,2}).reduce(0,(a, b) ->a+b);
        System.out.println(sum);
        System.out.println("====================Reduceusingoptional=========================");
        OptionalInt done = Arrays.stream(new int[] {66,55,88,99,82,33}).reduce((a,b) ->a+b);
        System.out.println(done);
        System.out.println("====================max=========================");
        OptionalInt so = Arrays.stream(new int[] {66,55,88,99,82,33}).max();
        System.out.println(so);
        System.out.println("====================min=========================");
        OptionalInt soo = Arrays.stream(new int[] {66,55,88,99,82,33}).min();
        System.out.println(soo);
        System.out.println("====================count=========================");
        long noOfbigname =list.stream().filter((String name) ->name.length() >5).count();
        System.out.println(noOfbigname);
        System.out.println("====================Collector=========================");
        List<String> jj = list.stream().limit(5).distinct().collect(Collectors.toList());
        System.out.println(jj);
        System.out.println("====================Any match=========================");

        



    }
}
