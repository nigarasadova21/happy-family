package az.edu.turing.entity;

import az.edu.turing.enums.DayOfWeek;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Family family;
    private Map<DayOfWeek, String> schedule;



    {
        System.out.println("Human created");
    }


    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Human(String mike, String smith, int i, int i1, Map<DayOfWeek, String> schedule) {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Family family, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.family = family;
        this.schedule = schedule;
    }

    public void greetPet() {
        if (family == null || family.getPet() == null) {
            System.out.println("No pet assigned to this family.");
            return;
        }
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        if (family == null || family.getPet() == null) {
            System.out.println("No pet assigned to this family.");
            return;
        }

        if (pet.getTrickLevel() > 50) {
            System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is very sly");
        } else {
            System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is almost not sly");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void feedPet(boolean isTimeToFeed) {
        if (family != null && family.getPet() != null) {
            Pet pet = family.getPet();
            if (isTimeToFeed) {
                System.out.println("Feeding " + pet.getNickname());
            } else {
                Random random = new Random();
                int randomValue = random.nextInt(100);
                if (pet.getTrickLevel() > randomValue) {
                    System.out.println("Feeding " + pet.getNickname());
                } else {
                    System.out.println(pet.getNickname() + " is not hungry now.");
                }
            }
        } else {
            System.out.println("No pet found in the family.");
        }
    }


    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet, family, schedule);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq +
                ", pet=" + (pet != null ? pet.toString() : "no pet") +
                "}";
    }
}
