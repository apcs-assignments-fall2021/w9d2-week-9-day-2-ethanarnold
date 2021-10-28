public class PersonClient {
    public static void main(String[] args) {
        Person EpisodeThree = new Person("Anakin", "Skywalker");
        EpisodeThree.setFirstName("Darth");
        EpisodeThree.setLastName("Vader");
        System.out.println(EpisodeThree.getFirstName());
        System.out.println(EpisodeThree.getLastName());
        EpisodeThree.doSomething();

        Student s = new Student("Jon", "Atkinson");
        System.out.println(s);

        NinthGrader n = new NinthGrader();
        System.out.println(n);

        NinthGrader x = new NinthGrader("Blake", "Boosh");
        System.out.println(x);
    }
}