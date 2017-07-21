package creational.builder.type_one;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class PersonDirector {

    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public Person constructPerson(int age, String cardNo) {

        builder.buildName();
        builder.buildAge(age);
        builder.buildCardNo(cardNo);

        return builder.build();
    }
}
