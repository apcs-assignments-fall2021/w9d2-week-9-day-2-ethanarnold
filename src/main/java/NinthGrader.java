public class NinthGrader extends Student {

    public NinthGrader (String firstName, String lastName) {
        super(firstName, lastName, 2025);
    }

    public NinthGrader () {
        super("Jon", "Atkinson", 2025);
    }
    public void doSomething() {
        System.out.println("I'm preparing for a Harkness discussion!");
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", " + 2025 + " (Ninth Grader)";
    }
}
