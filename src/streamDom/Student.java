package streamDom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Student {
    private  String name;
   private int id;
    private  int age;
    private  String gender;
    private  String classroom;

    // constructor
    public Student (){}
    public  Student (String name, int id, int age , String gender , String classroom){
        this.name = name;
        this.age = age ;
        this.gender = gender;
        this.classroom = classroom;
        this.id  = id;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", classroom='" + classroom + '\'' +
                ", id='" + id + '\'' +
                '\n';
    }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(){{
            add(new Student("data", 001, 21, "male", "K"));
            add(new Student("fata", 002,59, "female", "K"));
            add(new Student("xata", 004, 69 , "female", "K"));
            add(new Student("ata", 002, 60,"male", "K"));
        }};
       List<Student> maleStudent =  students.stream().filter(student -> student.getGender().equalsIgnoreCase("male"))
                .toList();
        //System.out.println(maleStudent);

//        search by id

            int searchID = 001;
            Optional<Student> seachByID = maleStudent.stream().filter(s-> s.getId()== searchID)
                    .findFirst();
            if (seachByID.isPresent()){
             System.out.println("ID is " + searchID);

             }else {
                System.out.println("Not found");
            }

        //sort

       students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::print);
        System.out.println("-".repeat(70));

        students.stream().sorted((s1,s2) -> s2.getId() - s1.getId()).forEach(System.out::print);
    }
}
