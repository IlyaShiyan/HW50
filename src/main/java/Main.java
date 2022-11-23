import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> listOfAnimals = new LinkedList<>();
        listOfAnimals.add(new Animal("Cat"));
        listOfAnimals.add(new Animal("Dog"));
        listOfAnimals.add(new Animal("Fox"));
        listOfAnimals.add(new Animal("Elephant"));
        listOfAnimals.add(new Animal("Monkey"));
        listOfAnimals.add(new Animal("Wolf"));
        listOfAnimals.add(new Animal("Tiger"));
        listOfAnimals.add(new Animal("Lion"));
        listOfAnimals.add(new Animal("Hippo"));
        listOfAnimals.add(new Animal("Hare"));


        for (Animal animal:listOfAnimals) {
            if (animal. == "A" || animal. =="E".hashCode() ||animal. == "I" ||animal. == "O" || animal. =="U" || animal. == "Y" ) {
                listOfAnimals.remove(animal);
            }
        }

        System.out.println(listOfAnimals);
    }
}