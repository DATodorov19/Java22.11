public class Main {

    public static void main(String[] args)
    {
        Person person = new Person("Pesho", 20);
        System.out.println(person.getName());
        person.setName("12345");
        System.out.println(person.getName());

        person.name = "12345";
        System.out.println(person.getName());
    }

}
