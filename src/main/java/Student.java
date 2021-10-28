public class Student extends Person {
    // Instance variables:
    // firstName and lastName are already inherited
    private int classYear;

    // Constructors
    // A constructor that takes three parameters for the
    // firstName, lastName, and classYear
    public Student(String firstName, String lastName, int c) {
        super(firstName, lastName);
        this.classYear = c;
    }

    // A constructor that assumes that a default student is a ninth-grader
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        this.classYear = 2025;
    }

    // A default/no-argument constructor
    public Student() {
        super("Jerry", "Seinfeld");
        this.classYear = 2024;
    }

    // doSomething() method
    public void doSomething() {
        System.out.println("I'm studying!");
    }

    // toString()
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
    }



    // Getters
    // We've already inherited getFirstName() and getLastName()
    // so we only need to add getClassYear
    public int getClassYear() {
        return this.classYear;
    }

    // Setters
    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }
}
