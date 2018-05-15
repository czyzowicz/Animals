package Animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {
    private List<Animal> animalColl =  new ArrayList<>();
    public void addAnimal (Animal animal){
        animalColl.add(animal);
    }
    public void removeAnimal (Animal animal){
        animalColl.remove(animal);
    }
    public void moveAll(){
        for (int i = 0; i <animalColl.size() ; i++) {
            animalColl.get(i).move();
        }
    }
}
