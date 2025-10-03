public class Penguin extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The penguin trumpets");
    }

    @Override
    public void feed() {
        System.out.println("You just fed fish to the penguin");
    }
}
