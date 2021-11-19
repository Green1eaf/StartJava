package com.startjava.lesson_2_3_4.robot;

class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String readyForBattle() {
        return "Ready";
    }

    public String vortexCannon() {
        return "activated";
    }

    public String toString() {
        return "modelName: " + modelName + 
                "\nmark: " + mark + 
                "\norigin: " + origin + 
                "\nheight: " + height +
                "\nweight: " + weight;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println(modelName + " is moving");
    }

    public void fire() {
        System.out.println("Piu! Piu!");
    }

    public String scanKaiju() {
        return modelName + " is scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}