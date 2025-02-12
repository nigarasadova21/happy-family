package az.edu.turing;

import az.edu.turing.entity.Human;
import az.edu.turing.entity.Pet;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Linda", 3, 60, new String[]{"eating", "playing"});
        dog.respond();
        dog.foul();
        dog.eat();

        Pet cat = new Pet("Cat", "Tosu", 7, 80, new String[]{"Sleeping", "running"});
        cat.respond();
        cat.foul();
        cat.eat();

        Pet duck = new Pet("Duck", "Donald Duck");
        duck.respond();
        duck.foul();
        duck.eat();

        Pet chicken = new Pet();
        chicken.setSpecies("Chicken");
        chicken.setNickname("Chilli");
        chicken.setAge(3);
        chicken.setTrickLevel(10);
        chicken.setHabits(new String[]{"Eating", "Running"});

        chicken.respond();
        chicken.foul();
        chicken.eat();


        Human father = new Human("Robert", "Davidson", 1974);
        Human mother = new Human("Cristina", "Davidson", 1989);
        String[][] schedule = {
                {"Monday", "Go to the gym"},
                {"Tuesday", "Read a book"},
                {"Wednesday", "Watch a movie"},
                {"Thursday", "Learn Java"},
                {"Friday", "Meet friends"},
                {"Saturday", "Go hiking"},
                {"Sunday", "Relax at home"}
        };

        Human son = new Human("Gabriel", "Davidson", 2000, 55, dog, mother, father, schedule);

        System.out.println(son);
        son.greetPet();
        son.describePet();
    }
}