package additional_seminar2.part2;

public class Main {
    public static void main(String[] args) {
        // Использование объявленных констант
        System.out.println("Array size: " + Constants.ARRAY_SIZE);
        System.out.println("Max value: " + Constants.MAX_VALUE);

//        Constants.ARRAY_SIZE = 30; // не получается
        // Создание и заполнение массива
        int[] numbers = new int[Constants.ARRAY_SIZE];
        for (int i = 0; i < Constants.ARRAY_SIZE; i++) {
            numbers[i] = i * Constants.MAX_VALUE;
        }

        // Вывод содержимого массива
        System.out.println("Array contents:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
