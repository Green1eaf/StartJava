package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger horizon = new Jaeger("Horizon Brave", "Mark-1", "China", 81.8f, 2.004f);
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