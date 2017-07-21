package creational.builder;

import creational.builder.type_one.Person;
import creational.builder.type_one.PersonDirector;
import creational.builder.type_one.TomBuilder;
import creational.builder.type_two.Student;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class TestBuilder {
    public static void main(String[] args) {


        Person person = new Person();

        PersonDirector director = new PersonDirector(new TomBuilder(person));

        director.constructPerson(20, "23242994929922X");

        System.out.println(person);


        Student student = new Student.Builder().baseInfo("lily", 20, 1).grade(1, "grade one").build();

        System.out.println(student);


    }
}
