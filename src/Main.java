import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Penguin());
        animals.add(new Lion());
        animals.add(new Monkey());

        for (Animal animal : animals) {
            animal.makeSound();
            animal.feed();
        }
    }
}
