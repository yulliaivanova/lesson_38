package lesson_38;

public class ArrayService {

    // ArrayService для работы с массивами

    // Задача написать метод, который на вход принимает размер массива N
    // метод должен возвращать массив целых чисел указанного размера,
    // заполненный последовательно значениями от 1 до N.
    // 5 -> [1, 2, 3, 4, 5]

    public static int[] generateArrayBySize(int size) throws NegativeArraySizeException {
        // алгоритм:
        // 1. Проверить, не содержит ли входящий параметр отрицательное значение
        // 2. Если параметр содержит отрицательное знчение- выбросить ошибку
        // 3. Создать массив указанного размера size
        // 4. Обьявляем цикл, который идет по массиву
        // 5. Каждую ячейку заполняем значением индекса массива +1
        // 6. Возвращаем результат

        if (size < 0) {
            // если набрать thr, то идея сгенирирует throw new
            throw new NegativeArraySizeException("Массив не может иметь отрицательный размер");
            // т к нам ексепшн проверяемый, мы обязаны в шапку метода
            // задекларировать то, наш метод умеет бросаться проверяемым
            // эксепшином
        }

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        return array;


    }

}
