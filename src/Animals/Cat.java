package Animals;

public class Cat extends Animal {
    public Cat (String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println(name + " Miau, miau");
    }
}
