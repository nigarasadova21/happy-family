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


        Human father = new Human("John", "Smith", 1978, 130, schedule);
        Human mother = new Human("Anna", "Smith", 1980, 120, schedule);
        Human child = new Human("Mike", "Smith", 2005, 110, schedule);
        Family family = new Family(mother, father);
        Pet pet = new Pet(Species.DOG, "Buddy", 3, 75, new String[]{"playing", "eating"});
        family.setPet(pet);
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

        System.out.println("Pet details: " + pet);
        pet.eat();
        pet.respond();
        pet.foul();

        System.out.println("Human interactions:");
        father.greetPet();
        mother.describePet();
        mother.feedPet(true);
    }
}
