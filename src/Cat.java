/*class Cat extends Animal{
    public Cat(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    public Cat() {
        super("Cat", -1, 4, true);
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }
}*/
class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = appetite < 0;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return full;
    }

    public void eat(Plate p) {
        if (appetite > 0) {
            while (appetite > 0 && p.getFood() > 0) {
                p.decreaseFood(1);
                appetite--;
                System.out.println("Кот съел 1 еду");
                System.out.println("Аппетит кота: " + appetite);
            }
            full = appetite <= 0;
        } else {
            System.out.println("Sorry, don't want to eat!");
        }
    }
}
