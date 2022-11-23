import java.util.Iterator;
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

        Iterator<Animal> animal= listOfAnimals.iterator();
        while (animal.hasNext()){
            if (animal.next().name.charAt(0) == 'A' || animal.next().name.charAt(0) =='E'||animal.next().name.charAt(0)== 'I' ||animal.next().name.charAt(0)== 'O' || animal.next().name.charAt(0) =='U' || animal.next().name.charAt(0) == 'Y' ) {
               animal.remove();
            }
        }

        System.out.println(listOfAnimals);
    }
}