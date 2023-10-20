package additional_seminar2.part1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Вызов методов makeSound()
        dog.makeSound(); // Выводит "Buddy barks."
        cat.makeSound(); // Выводит "Whiskers meows."
    }
}
