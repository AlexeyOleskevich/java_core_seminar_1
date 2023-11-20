package by.oleskevich;

/**
 * Класс, предназначенный для форматированного
 * вывода результата вычислений
 */
public class ConsolePrinter {
    /**
     * Функция экранирования результата вычислений
     * @param result результат, который необходимо вывести
     */
    public static void printResult (double result) {
        System.out.printf("Answer is equals to %f\n", result);
    }
}
