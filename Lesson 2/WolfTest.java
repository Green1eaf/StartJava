public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf("male", "Akella", 25, 10, "white");
        System.out.println("Wolf's sex = " + wolf.sex + "\n" +
                "Wolf's name = " + wolf.name + "\n" +
                "Wolf's weight = " + wolf.weight + "\n" +
                "Wolf's age = " + wolf.age + "\n" +
                "Wolf's colour = " + wolf.colour);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}