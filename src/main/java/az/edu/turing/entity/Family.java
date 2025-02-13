package az.edu.turing.entity;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private Pet pet;

    static {
        System.out.println("Family class is loading");
    }
    //getter and setter
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    //getter and setter

    public  Family (Human mother , Human father){
        this.father=father;
        this.mother=mother;
    }

    public void addChild(Human child){
        children.add(child);
    }

    public void deleteChild(Human child){
        children.remove(child);
    }

    public void countfamily(){
        System.out.println(2+children.size());
    }

    public String toString(){
        StringBuilder familyDetails = new StringBuilder();
        familyDetails.append("Father name ->").append(father.getName()).append("\n").append("Mother name ->").append(mother.getName());

        if (!children.isEmpty()){
            for (int i = 0; i < children.size(); i++) {
                familyDetails.append(i + 1).append(".st Child name -> ").append(children.get(i).getName()).append("\n");
            }
            familyDetails.append("Count of Family Members -> " + 2).append(children.size());
        }
        return new String(familyDetails);
    }

}
