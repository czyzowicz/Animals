package Animals;

public abstract class Animal {
    public abstract void move();
    protected String name;
    public Animal(String name) {this.name = name;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}