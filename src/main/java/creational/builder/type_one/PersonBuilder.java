package creational.builder.type_one;

/**
 * Created by zhuyanan on 17/7/21.
 */
public interface PersonBuilder {

    Person build();

    void buildName();

    void buildAge(int age);

    void buildCardNo(String cardNo);
}
