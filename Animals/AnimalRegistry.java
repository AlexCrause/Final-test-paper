package Animals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalRegistry {

    private List<Animals> animals;
    private static int animalCount = 0;

    public AnimalRegistry() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animals animal) {
        animals.add(animal);
        animalCount++;
    }

    public void listCommands(String name) {
        for (Animals animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println(animal.getCommands());
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    public void teachNewCommand(String name, String command) {
        for (Animals animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.addCommand(command);
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    public void listAnimalsByBirthDate() {
        animals.sort(Comparator.comparing(Animals::getBirthDate));
        for (Animals animal : animals) {
            System.out.println(animal);
        }
    }

    public void printTotalCount() {
        System.out.println("Total animals: " + animalCount);
    }
}
