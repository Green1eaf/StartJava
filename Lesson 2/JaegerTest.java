public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger horizon = new Jaeger();
        horizon.setModelName("Horizon Brave");
        horizon.setMark("Mark-1");
        horizon.setOrigin("China");
        horizon.status();
        horizon.move();
        horizon.fire();

        System.out.println();

        Jaeger ronin = new Jaeger();
        ronin.setModelName("Tacit Ronin");
        ronin.setMark("Mark-1");
        ronin.setOrigin("Japan");
        ronin.status();
        System.out.println(ronin.scanKaiju());
        ronin.move();
        ronin.fire();
    }
}