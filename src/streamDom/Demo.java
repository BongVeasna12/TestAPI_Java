package streamDom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(){{
            add(new Student("Dara ", 111, 69, "male", "Java" ));
            add(new Student("Dara ", 112, 39, "female", "Java" ));
            add(new Student("Dara ", 113, 59, "male", "Java" ));
        }};
        //List<Student> maleStudent  = students.stream().filter(s-> s.getGender().equalsIgnoreCase("male"))
              //  .toList();
        //System.out.println(maleStudent);

        int search = 112;
        Optional<Student> searchById = students
                .stream().filter(s-> s.getId()== search).findFirst();
        if (searchById.isPresent()) {
            System.out.print("Id is: " + searchById);

        }


    }
}
