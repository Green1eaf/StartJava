public class JaegerTestWithConstructor {
    
    public static void main(String[] args) {
        JaegerWithConstructor horizon = new JaegerWithConstructor();
        horizon.status();
        horizon.move();
        horizon.fire();

        System.out.println();

        JaegerWithConstructor ronin = new JaegerWithConstructor("Tacit Ronin", "Mark-1", "Japan");
        ronin.status();
        System.out.println(ronin.scanKaiju());
        ronin.move();
        ronin.fire();
    }
}