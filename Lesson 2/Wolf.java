class Wolf {
    private String sex;
    private String name;
    private int weight;
    private int age;
    private String colour;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
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