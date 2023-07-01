package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    String name;

    int id;

    String subject;

    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));


//        List<String> ok = studentList.stream().map(Student :: getName).collect(Collectors.toList());
//        System.out.println("Using the list :"+ok);
//
//        Set<String> subject = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
//        System.out.println("using the set :"+subject);
//
//        Map< Double,String> submarks = studentList.stream().collect(Collectors.toMap(Student ::getPercentage, Student ::getName));
//        System.out.println(submarks);

        Set<Student> col = studentList.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(col);

        Set<Student> col1 = new HashSet<>(studentList);
        System.out.println(col);


//        Map<String,Integer>ok = studentList.stream().collect(Collectors.toMap(Student::getName,((Student s)->s.getName().length())));
//        System.out.println(ok);


      String namejoining =studentList.stream().map(Student::getName).collect(Collectors.joining(" ,"));
        System.out.println(namejoining);

        long countiong = studentList.stream().map(Student::getName).collect(Collectors.counting());
        System.out.println("name counting "+countiong);

        Optional<Double>highpercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(highpercentage);
        System.out.println("============================================================================================");
        Optional<Double>lowpercentage =studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(lowpercentage);
        System.out.println("============================================================================================");
        Double sumationofpercentage = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));
        System.out.println("summation of all percentage "+sumationofpercentage);
        System.out.println("============================================================================================");
        Double Avaraging = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));
        System.out.println("avaraging percentage "+Avaraging);
        System.out.println("============================================================================================");
//        DoubleSummaryStatistics Summeringstat = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
//        System.out.println("highest marks "+Summeringstat.getMax());
//        System.out.println("minimum marks "+Summeringstat.getMin());
//        System.out.println("avarage marks "+Summeringstat.getAverage());

        IntSummaryStatistics Summeringstat = studentList.stream().collect(Collectors.summarizingInt(Student::getId));
        System.out.println("highest marks "+Summeringstat.getMax());
        System.out.println("minimum marks "+Summeringstat.getMin());
        System.out.println("avarage marks "+Summeringstat.getAverage());
        System.out.println("============================================================================================");
        Map<String,List<Student>> StudentGroupBy =studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(StudentGroupBy);

        System.out.println("==============================================================================================");

        Double summationofmarks = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));
        System.out.println("summation of marks"+summationofmarks);

        System.out.println("==============================================================================================");
        Map<Boolean,List<Student>> partation =studentList.stream().collect(Collectors.partitioningBy(Student ->Student.getPercentage()>80));
        System.out.println(partation);
        System.out.println("===============================================================================================");

    }

}
