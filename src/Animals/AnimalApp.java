package Animals;

public class AnimalApp {
    public static void main(String[] args) {
        AnimalCollection collection = new AnimalCollection();
        Dog dog1 = new Dog ("Reksio");
        Dog dog2 = new Dog ("Pimpuś");
        Dog dog3 = new Dog ("Olaf");
        Cat cat1 = new Cat ("Kicia");
        Cat cat2 = new Cat ("Mruczek");
        Cat cat3 = new Cat ("Kitka");
        collection.addAnimal(dog1);
        collection.addAnimal(dog3);
        collection.addAnimal(dog2);
        collection.addAnimal(cat1);
        collection.addAnimal(cat2);
        collection.addAnimal(cat3);
        collection.moveAll();
        }
}
