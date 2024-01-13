import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        // Группа 1
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> students1 = new ArrayList<>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        students1.add(s4);
        students1.add(s5);
        students1.add(s6);

        StudentGroup group1 = new StudentGroup(students1, 1);

        // Группа 2
        Student s21 = new Student("Иван", 25);
        Student s22 = new Student("Игорь", 23);
        Student s23 = new Student("Иван", 22);
        Student s24 = new Student("Игорь",  23);
        Student s25 = new Student("Лена",  23);

        List<Student> students2 = new ArrayList<>();
        students2.add(s21);
        students2.add(s22);
        students2.add(s23);
        students2.add(s24);
        students2.add(s25);

        StudentGroup group2 = new StudentGroup(students2, 2);

        // Группа 3
        Student s31 = new Student("Иван", 25);
        Student s32 = new Student("Игорь", 23);

        List<Student> students3 = new ArrayList<>();
        students3.add(s31);
        students3.add(s32);

        StudentGroup group3 = new StudentGroup(students3, 3);

        // Группа 4
        Student s41 = new Student("Иван", 25);
        Student s42 = new Student("Игорь", 23);
        Student s43 = new Student("Иван", 22);
        Student s44 = new Student("Игорь",  23);

        List<Student> students4 = new ArrayList<>();
        students4.add(s41);
        students4.add(s42);
        students4.add(s43);
        students4.add(s44);

        StudentGroup group4 = new StudentGroup(students4, 5);

        // Группа 4
        Student s51 = new Student("Иван", 25);
        Student s52 = new Student("Игорь", 23);
        Student s53 = new Student("Иван", 22);
        Student s54 = new Student("Игорь",  23);

        List<Student> students5 = new ArrayList<>();
        students5.add(s51);
        students5.add(s52);
        students5.add(s53);
        students5.add(s54);

        StudentGroup group5 = new StudentGroup(students5, 4);

        // Поток
        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);
        groups.add(group5);

        StudentSteam stream = new StudentSteam(groups, 1);

        System.out.println(stream);

//        for(StudentGroup group : stream)
//        {
//            System.out.println(group);
//        }

        System.out.println("=========================================================");

        Collections.sort(stream.getStream());

        for(StudentGroup group : stream)
        {
            System.out.println(group);
        }


//        System.out.println(group4580);
//
//        for(Student std : group4580)
//        {
//            System.out.println(std);
//        }
//
//        System.out.println("=========================================================");
//
//        Collections.sort(group4580.getGroup());
//
//        for(Student std: group4580.getGroup())
//        {
//            System.out.println(std);
//        }

    }
}
