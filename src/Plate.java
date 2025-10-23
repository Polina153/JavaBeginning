class Plate {
    private int food;


    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
        System.out.println("Еда уменьшилась на 1");
    }

    void info() {
        System.out.println("plate: " + food);
    }
}
