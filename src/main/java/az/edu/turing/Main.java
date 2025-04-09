package az.edu.turing;

import az.edu.turing.entity.Family;
import az.edu.turing.entity.Human;
import az.edu.turing.entity.Pet;
import az.edu.turing.enums.DayOfWeek;
import az.edu.turing.enums.Species;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<DayOfWeek, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY, "Go to work");
        schedule.put(DayOfWeek.TUESDAY, "Go to the gym");
        schedule.put(DayOfWeek.WEDNESDAY, "Go to the cinema");
        schedule.put(DayOfWeek.THURSDAY, "Go to the park");
        schedule.put(DayOfWeek.FRIDAY, "Go to the restaurant");
        schedule.put(DayOfWeek.SATURDAY, "Go to the swimming pool");
        schedule.put(DayOfWeek.SUNDAY, "Go to the zoo");



        Human father = new Human("John", "Smith", 1978, 130, schedule);
        Human mother = new Human("Anna", "Smith", 1980, 120, schedule);
        Human child = new Human("Mike", "Smith", 2005, 110, schedule);
        Family family = new Family(mother, father);
        Pet dog = new Pet(Species.DOG, "Buddy", 3, 75, new String[]{"playing", "eating"});
        Pet cat = new Pet(Species.CAT, "Tom", 5, 50, new String[]{"sleeping", "eating"});
        Pet fish = new Pet(Species.FISH, "Nemo", 1, 25, new String[]{"swimming", "eating"});
        family.setPet(dog);
        System.out.println("Initial family size: " + family.countFamily());
        family.addChild(child);
        System.out.println("After adding child: " + family.countFamily());
        family.deleteChild(child);
        System.out.println("After deleting child: " + family.countFamily());
        System.out.println("Family details: " + family);

        System.out.println("Animal species details:");
        for (Species species : Species.values()) {
            System.out.println(species);
        }


        System.out.println("Pet details: " + dog);
        dog.eat();
        dog.respond();
        dog.foul();

        System.out.println("Pet details: " + cat);
        cat.eat();
        cat.respond();
        cat.foul();
        System.out.println("\n");

        System.out.println("Pet details: " + fish);
        fish.eat();
        fish.respond();
        fish.foul();
        System.out.println("\n");

        System.out.println("Human interactions:");
        father.greetPet();
        mother.describePet();
        mother.feedPet(true);
    }
}
