package binarytree;

public class 콜바이 {
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "name is " + this.name;
    }
}
class FunctionCallTest {
    public static void assignNewPerson(Person p) {
        System.out.println(p.hashCode());
        p = new Person("hee");
        System.out.println("assi"+p.hashCode());
    }
    public static void changeName(Person p) {
        p.setName("hee");
    }

    public static void main(String[] args) {
        Person p = new Person("doy");

        assignNewPerson(p);
        System.out.println(p.hashCode()); // name is doy

        changeName(p);
        System.out.println(p.hashCode()); // name is hee
    }
}
