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

class Wolf {
    public String sex;
    public String name;
    public int weight;
    public int age;
    String colour;

    public Wolf(String sex, String name, int weight, int age, String colour) {
        this.sex = sex;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.colour = colour;
    }

    public void go() {
        System.out.println("Волк идет");
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public void howl() {
        System.out.println("Волк воет");
    }

    public void hunt() {
        System.out.println("Волк охотится");
    }
}