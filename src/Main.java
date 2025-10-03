import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Penguin());
        animals.add(new Lion());
        animals.add(new Monkey());
        int choice;
        do {
            int i = 0;
            System.out.println("Animals");
            System.out.println(i++ + ") Exit");
            for (Animal animal : animals) {
                String animalName = animal.getClass().toString().substring(6);
                System.out.println(i++ + ") " + animalName);
            }
            choice = getChoice(0, i-1);
            if(choice != 0) {
                Animal animal = animals.get(choice-1);
                animal.makeSound();
                System.out.println("Feed? 0: No, 1: Yes");
                if(getChoice(0, 1) == 1)
                    animal.feed();
            }
        } while (choice != 0);
    }
    public static int getChoice(int min, int max) {
        int n;
        while (true) {
            System.out.print("Enter choice: ");
            if(scanner.hasNextInt()) {
                n = scanner.nextInt();
                if(n >= min && n <= max)
                    return n;
                else
                    System.out.printf("Number must be between %d and %d!\n", min, max);
            } else {
                scanner.next();
                System.out.println("Invalid user!");
            }
        }
    }
}
