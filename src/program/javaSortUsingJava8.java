package program;
import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class javaSortUsingJava8
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        /* Using Strema Api
        studentList.stream().sorted(Comparator.comparingDouble(Student::getCgpa).reversed().
                thenComparing(Comparator.comparing(Student::getFname)).
                thenComparing(Comparator.comparingInt(Student::getId)))
                .map(Student::getFname).
                forEach(System.out::println);*/


      /* Using Lambda Expression */

      studentList.stream().sorted((s1,s2)->{
           if(Double.compare(s1.getCgpa(),s2.getCgpa()) ==0){
               return s1.getFname().compareTo(s2.getFname());
           } else {
               return Double.compare(s1.getCgpa(),s2.getCgpa());
           }
       }).map(Student::getFname).forEach(System.out::println);


      studentList.stream().sorted(Comparator.comparing(Student::getCgpa).reversed().thenComparing((s1,s2)->{
          return s1.getFname().compareTo(s2.getFname());
      }));


        /* Using Sort and comparator
        studentList.sort(
                Comparator.comparing(Student::getCgpa).thenComparing(Student::getFname)
        );*/
    }
}



