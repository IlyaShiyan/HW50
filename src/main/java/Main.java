import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        ListIterator<Animal> animal= listOfAnimals.listIterator();
        while (animal.hasNext()){
            Animal an = animal.next();
            if (an.name.charAt(0) == 'A' || an.name.charAt(0) =='E'||an.name.charAt(0)== 'I' ||an.name.charAt(0)== 'O' || an.name.charAt(0) =='U' || an.name.charAt(0) == 'Y' ) {
               animal.remove();
               break;
            }
        }

        System.out.println(listOfAnimals);
    }
}