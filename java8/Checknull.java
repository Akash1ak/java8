package java8;

import java.util.*;
import java.util.function.Predicate;

public class Checknull implements Predicate
{

    @Override
    public boolean test(Object o) {

        System.out.println("true");
        return o != null;
    }

    public static void main(String[] args) {
        Checknull cn = new Checknull();
        cn.test(44);
        System.out.println();
    }
}
