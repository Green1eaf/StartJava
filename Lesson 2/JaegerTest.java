public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger horizon = new Jaeger();
        horizon.setModelName("Horizon Brave");
        horizon.setMark("Mark-1");
        horizon.setOrigin("China");
        horizon.setHeight(81.8f);
        horizon.setWeight(2.004f);
        System.out.println(horizon);
        horizon.drift();
        System.out.println(horizon.readyForBattle());
        System.out.println(horizon.scanKaiju());
        horizon.move();
        horizon.fire();
        horizon.useVortexCannon();

        System.out.println();

        Jaeger ronin = new Jaeger();
        ronin.setModelName("Tacit Ronin");
        ronin.setMark("Mark-1");
        ronin.setOrigin("Japan");
        ronin.setHeight(82.7f);
        ronin.setWeight(2.12f);
        System.out.println(ronin);
        ronin.drift();
        System.out.println(ronin.readyForBattle());
        System.out.println(ronin.scanKaiju());
        ronin.move();
        ronin.fire();
        ronin.useVortexCannon();
    }
}