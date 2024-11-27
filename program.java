class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void haveBirthday() {
        this.age += 1;
    }
}

public class program {
    public static void main(String[] args) {
        Person person1 = new Person("pradyun", 9);
        Person person2 = new Person("Bob", 10);

        person1.displayInfo();
        person2.displayInfo();

        person1.changeName("mark");
        person1.haveBirthday();

        System.out.println("After changes:");
        person1.displayInfo();
    }
}
