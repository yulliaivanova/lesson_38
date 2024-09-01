package lesson_38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    // junit подсвеивается красным, что означает, что мы не подключили фреймворк
    // для этого открыв браузер и ищем библиотеку junit jupiter maven
    // переходим в него и внутри есть весь список созданного
    // фреймворка, выбираем самую свежую, копируем код
    // открываем pom file и между тегами </propertie </project>
    // откываем тег dependencies и встявляем фреймворк

    // Тест кейсы
    // 1. Проверить не null ли возвращает метод

    // тестовые методв всегдя public void, они никогда ничего не возвращают
    // помечаем анотацией @Test

    @Test
    public void chekIfResultIsNotNull() throws NegativeArraySizeException {
        int[] actual = ArrayService.generateArrayBySize(7);
        assertNotNull(actual, "Метод вернул null вместо ожидаемого результата");
    }

    // 2. Возвращается ли нам массив корректного размера. assertEquals

    @Test
    public void correctSizeCheck() {
        try {
            //  ArrayService.generateArrayBySize(10);
            int[] generatedArray = ArrayService.generateArrayBySize(10);
            int arraysLength = generatedArray.length;
            assertEquals(10, arraysLength);
        } catch (NegativeArraySizeException e) {

        }

    }

    // 3. Проверить корректность значений внутри ячеек  массива. assertEquels

    @Test
    public void correctArrayValuesCheck() throws NegativeArraySizeException {
        int arraySize = 10;
        int[] array = ArrayService.generateArrayBySize(arraySize);
        for (int i = 0; i < arraySize; i++) {
            int value = i + 1;
            int arrayValue = array[i];
            assertEquals(value, arrayValue);
        }

    }

    // 4. Действительно ли метод выбрасывает ожидаемый ексепшин
    // при определенных обстоятельствах. assertThrows

    @Test
    public void expectedExceptionCheck() {

        assertThrows(NegativeArraySizeException.class, () -> {
            ArrayService.generateArrayBySize(-1);
        });
    }

    // 5. Быстродействие метода. assertTrue


}