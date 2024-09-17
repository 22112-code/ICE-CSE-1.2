class Person {
    private String name;
    private int age;

    //Make a default constructor
    public Person() {
        System.out.println("Naba Chowdhury");
        System.out.println("20");
        //Write your code here...

    }

    //Make a Parameterized constructor
    public Person(String name, int age) {
        //Write your code here...
        this.name=name;
        this.age =age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
        // Creating objects using constructors
        Person person1= new Person();
        Person person2= new Person("Nuhat Chowdhury",12);
        //Create an object named "person1" by Default constructor.
        //Create an object named "person2" by Parameterized constructor.
person1.Person();
        // Accessing object attributes
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
