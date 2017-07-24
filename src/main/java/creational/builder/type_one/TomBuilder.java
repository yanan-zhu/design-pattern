package creational.builder.type_one;

import bean.Person;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class TomBuilder implements PersonBuilder {

    Person person;

    public TomBuilder(Person person) {
        this.person = person;
    }

    @Override
    public Person build() {
        return person;
    }

    @Override
    public void buildName() {
        person.setName("tom");
    }

    @Override
    public void buildAge(int age) {
        person.setAge(age);
    }

    @Override
    public void buildCardNo(String cardNo) {
        person.setCardNo(cardNo);
    }
}
