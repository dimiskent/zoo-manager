public class Monkey extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The monkey screams");
    }

    @Override
    public void feed() {
        System.out.println("You just fed a banana to the monkey");
    }
}
