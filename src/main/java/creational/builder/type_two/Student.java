package creational.builder.type_two;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class Student {

    public Student(Builder builder) {
        this.age = builder.age;
        this.sex = builder.sex;
        this.name = builder.name;
        this.grade = builder.grade;
        this.gradeName = builder.gradeName;
    }


    public static class Builder {

        private int age;

        private int sex;

        private String name;

        private int grade;

        private String gradeName;


        public Builder baseInfo(String name, int age, int sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            return this;
        }

        public Builder grade(int grade, String gradeName) {
            this.grade = grade;
            this.gradeName = gradeName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }


    private int age;

    private int sex;

    private String name;

    private int grade;

    private String gradeName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
