import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Animal name1 = new Animal("Cat");
        Animal name2 = new Animal("Dog");
        Animal name3 = new Animal("Fox");
        Animal name4 = new Animal("Elephant");
        Animal name5 = new Animal("Monkey");
        Animal name6 = new Animal("Wolf");
        Animal name7 = new Animal("Tiger");
        Animal name8 = new Animal("Lion");
        Animal name9 = new Animal("Hippo");
        Animal name10 = new Animal("Hare");
        LinkedList<Animal> listOfAnimals = new LinkedList<>();
        listOfAnimals.add(name1);
        listOfAnimals.add(name2);
        listOfAnimals.add(name3);
        listOfAnimals.add(name4);
        listOfAnimals.add(name5);
        listOfAnimals.add(name6);
        listOfAnimals.add(name7);
        listOfAnimals.add(name8);
        listOfAnimals.add(name9);
        listOfAnimals.add(name10);
        

        for (Animal i:listOfAnimals) {
            if (i.toString() == "A" || i.toString() =="E" ||i.toString() == "I" ||i.toString() == "O" || i.toString() =="U" ||i.toString() == "Y" ) {
                listOfAnimals.remove(i);
            }
        }

        System.out.println(listOfAnimals);
    }
}
