public class ReassigningReference {
    public static void reassign(Person p) {
        p = new Person();        // new object created
        p.name = "Amit";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Shivani";
        reassign(person);
        System.out.println(person.name);  // Output: Shivani
    }
}
