package additional_seminar1;

public class Main {
    public static void main(String[] args) {
        // Создание объектов разных классов
        Mammal lion = new Mammal("Lion", 5, "Yellow");
        Bird sparrow = new Bird("Sparrow", 2, true);

        // Использование методов и вывод информации
        lion.makeSound();
        lion.displayInfo();

        sparrow.makeSound();
        sparrow.displayInfo();


//        Animal animal1 = new Animal("Wolf", 5);
//        Animal animal2 = new Animal("Kitty");
//        Animal animal3 = new Animal();
//        animal1.displayInfo();
//        animal2.displayInfo();
//        animal3.displayInfo();
//
//        animal3.age = 10;
//        animal3.name = "Lion";
//        animal3.displayInfo();
    }
}
