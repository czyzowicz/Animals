package Animals;

public class Dog extends Animal {
    public Dog (String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println(name + " Hau, hau");
    }
}
