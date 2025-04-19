class Person {
    String name;
}

public class PassByReference {
    public static void changeName(Person p) {
        p.name = "Shivani";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Neha";
        changeName(person);
        System.out.println(person.name);  // Output: Shivani
    }
}

