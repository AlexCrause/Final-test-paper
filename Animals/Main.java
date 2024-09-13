package Animals;

import Animals.Pets.*;
import Animals.PackAnimals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AnimalRegistry registry = new AnimalRegistry();

        while (true) {
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Список команд животного");
            System.out.println("3. Научить животное новой команде");
            System.out.println("4. Список животных по дате рождения");
            System.out.println("5. Показать общее количество животных");
            System.out.println("6. Выход");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите тип животного (Собака, Кошка, Хомяк, Лошадь, Верблюд, Осёл): ");
                    String type = scanner.nextLine();
                    System.out.print("Введите имя животного: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите дату рождения (YYYY-MM-DD): ");
                    String birthDate = scanner.nextLine();

                    Animals animal = null;
                    switch (type.toLowerCase()){
                        case "собака":
                            animal = new Dog(name, birthDate);
                            break;
                        case "кошка":
                            animal = new Cat(name, birthDate);
                            break;
                        case "хомяк":
                            animal = new Hamster(name, birthDate);
                            break;
                        case "лошадь":
                            animal = new Horse(name, birthDate);
                            break;
                        case "верблюд":
                            animal = new Camel(name, birthDate);
                            break;
                        case "осел":
                            animal = new Donkey(name, birthDate);
                            break;
                        default:
                            System.out.println("Неизвестный тип животного.");
                            continue;
                    }
                    registry.addAnimal(animal);
                    break;

                case 2:
                    System.out.print("Введите имя животного для вывода команд: ");
                    String animalName = scanner.nextLine();
                    registry.listCommands(animalName);
                    break;

                case 3:
                    System.out.print("Введите имя животного, чтобы научить новой команде: ");
                    String animalToTeach = scanner.nextLine();
                    System.out.print("Введите новую команду: ");
                    String command = scanner.nextLine();
                    registry.teachNewCommand(animalToTeach, command);
                    break;

                case 4:
                    registry.listAnimalsByBirthDate();
                    break;

                case 5:
                    registry.printTotalCount();
                    break;

                case 6:
                    System.out.println("Выход...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
