/**
 * Created by Marcin Gumkowski on 2016-09-17.
 */
public class Test {
    public static void main(String[] args) {

        Integer x3 = new Integer(66);
        Integer x1 = x3;
        Integer x2 = x3;
        int y1 = 2;
        int y2 = y1;
        y2 = 4;

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);


        Person p = new Person("Janusz", 2);
        Person j = p;
        p.setName("krzychu");

        System.out.println(j.getName());

    }


}

class Person {

    public String name;
    public Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
