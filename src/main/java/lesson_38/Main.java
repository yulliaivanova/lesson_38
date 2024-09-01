package lesson_38;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // test case тест сценарии для проверки
        // Тест кейсы
        // 1. Проверить не null ли возвращает метод
        // 2. Возвращается ли нам массив корректного размера
        // 3. Проверить корректность значений внутри ячеек  массива
        // 4. Действительно ли метод выбрасывает ожидаемый ексепшин
        // при определенных обстоятельствах
        // 5. Быстродействие метода

        try {
            int[] array = ArrayService.generateArrayBySize(7);

            if (array == null){
                System.out.println("Метод вернул null ");
            } else {
                System.out.println("Все в порядке. Метод вернул массив");
            }
            System.out.println("Размер массива "+ array.length);
            System.out.println(Arrays.toString(array));

          //  ArrayService.generateArrayBySize(-1);

            long start = System.currentTimeMillis();
            ArrayService.generateArrayBySize(10000);
            System.out.println("Затрачено миллисекунд  - " + (System.currentTimeMillis() - start));

        } catch (NegativeArraySizeException e) {
            System.out.println("Выброшена ошибка NegativeArraySize ");
            System.out.println("Тест ошибки - " + e.getMessage());
        }

    }





}
