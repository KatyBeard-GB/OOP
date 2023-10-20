package additional_seminar2.part4;

// Интерфейс для математических операций
interface MathOperations {
    int add(int a, int b);

    // default позволяет назначить дефолтную реализацию метода
    default int subtract(int a, int b) {
        return a - b;
    }
}
