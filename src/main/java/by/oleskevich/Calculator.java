package by.oleskevich;

/**
 * Класс, производящий основные
 * математические операции над
 * вещественными числами
 */
public class Calculator {

    /**
     * Функция, вычисляющая сумму
     * двух вещественных чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма слагаемых
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Функция, вычисляющая разность
     * двух вещественных чисел
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Функция, вычисляющая произведение
     * двух вещественных чисел
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Функция, вычисляющая результат
     * деления двух вещественных чисел
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public static double divide(double a, double b) {
        return a / b;
    }
}
