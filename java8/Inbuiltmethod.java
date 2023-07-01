package java8;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Predicate;

public class Inbuiltmethod {
    int id;
    String name;
    double percentage;
    String specification;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Inbuiltmethod(int id, String name, double percentage, String specification) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Inbuiltmethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", specification='" + specification + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Inbuiltmethod> listOfInbuiltmethods = new ArrayList<Inbuiltmethod>();

        listOfInbuiltmethods.add(new Inbuiltmethod(111, "John", 81.0, "Mathematics"));

        listOfInbuiltmethods.add(new Inbuiltmethod(222, "Harsha", 79.5, "History"));

        listOfInbuiltmethods.add(new Inbuiltmethod(333, "Ruth", 87.2, "Computers"));

        listOfInbuiltmethods.add(new Inbuiltmethod(444, "Aroma", 63.2, "Mathematics"));

        listOfInbuiltmethods.add(new Inbuiltmethod(555, "Zade", 83.5, "Computers"));

        listOfInbuiltmethods.add(new Inbuiltmethod(666, "Xing", 58.5, "Geography"));

        listOfInbuiltmethods.add(new Inbuiltmethod(777, "Richards", 72.6, "Banking"));

        listOfInbuiltmethods.add(new Inbuiltmethod(888, "Sunil", 86.7, "History"));

        listOfInbuiltmethods.add(new Inbuiltmethod(999, "Jordan", 58.6, "Finance"));

        listOfInbuiltmethods.add(new Inbuiltmethod(101010, "Chris", 89.8, "Computers"));


        Predicate<Inbuiltmethod> mathpredicate =
                (Inbuiltmethod inbult) -> inbult.getSpecification().equals("Mathematics");

        List<Inbuiltmethod> mathematicsStudents = new ArrayList<Inbuiltmethod>();

        for (Inbuiltmethod inb : listOfInbuiltmethods)
        {
            if (mathpredicate.test(inb))
            {
                mathematicsStudents.add(inb);
            }
        }
        System.out.println(mathematicsStudents);
    }
}
