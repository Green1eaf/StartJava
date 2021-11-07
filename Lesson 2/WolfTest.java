public class WolfTest {

    public static void main(String[] args) {

        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setName("Akella");
        wolf.setWeight(25);
        wolf.setAge(7);
        wolf.setColour("white");
        System.out.println("Wolf's sex = " + wolf.getSex() + "\n" +
                "Wolf's name = " + wolf.getName() + "\n" +
                "Wolf's weight = " + wolf.getWeight() + "\n" +
                "Wolf's age = " + wolf.getAge() + "\n" +
                "Wolf's colour = " + wolf.getColour());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}