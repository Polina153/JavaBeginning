class Dog extends Animal implements Swimable{
    public Dog(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    @Override
    void voice() {
        System.out.println("Gaff");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
