public class Person {

    private String firstName;
    private String lastName;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("First name set to " + firstName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("Last name set to " + lastName);
    }

    public String getLastName() {
        return this.lastName;
    }

    public void doSomething() {
        System.out.println(this.firstName + " " + this.lastName + " is watching Disney Plus.");
    }













}
