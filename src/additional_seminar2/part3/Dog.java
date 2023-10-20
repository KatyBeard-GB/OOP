package additional_seminar2.part3;

// Реализация интерфейса Pet
class Dog implements Pet {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void play() {
        System.out.println("The dog plays fetch.");
    }
}
