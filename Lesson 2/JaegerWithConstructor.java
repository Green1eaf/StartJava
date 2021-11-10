class JaegerWithConstructor {

    private String modelName = "Bracer Phoenix";
    private String mark = "Mark-5";
    private String origin = "USA";
    private float height = 70.7f;
    private float weight = 2.1f;
    private int strength = 8;
    private int armor = 9;

    public JaegerWithConstructor() {}

    public JaegerWithConstructor(String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    private String readyForBattle() {
        return "Ready";
    }

    private String vortexCannon() {
        return "activated";
    }

    public void status() {
        System.out.println("modelName: " + modelName + 
                "\nmark: " + mark + 
                "\norigin: " + origin + 
                "\nVortexCannon: " + vortexCannon() + 
                "\nReadyForBattle: " + readyForBattle());
    }

    public boolean drift() {
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