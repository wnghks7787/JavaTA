public class Person {

    private String name;
    private int age;

    public Person() {
        this.name = "no name yet";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public void setName(String first, String last) {this.name = first + last;}

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public static Person createToddler() {
        Person toddler = new Person("A toddler", 2);
        return toddler;
    }

    public static Person createPreschooler() {
        Person preschooler = new Person("A pre-schooler", 5);
        return preschooler;
    }

    public static Person createAdolescent() {
        Person adolescent = new Person("An adolescent", 9);
        return adolescent;
    }

    public static Person createTeenager() {
        Person teenager = new Person("A teenager", 15);
        return teenager;
    }

    public static Person createAdult() {
        Person adult = new Person("An adult", 21);
        return adult;
    }
}
