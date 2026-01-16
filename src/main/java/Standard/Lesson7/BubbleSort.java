/*** Пузырьковая сортировка, для разминки ***/

package Standard.Lesson7;

import static java.lang.System.out;

public class BubbleSort {
    public static void main(String[] args) {
        int[] standardArray = new int[] {3, 5, 1, 6, 2, 4}; // инициализация через {}

        // классическая пузырьковая сортировка (с поиском минимального элемента)
        for (int i = 0; i < standardArray.length - 1; ++i) {
            int minVal = standardArray[i];
            int pos = i;

            // ищем минимальный элемент, чтобы поменять его местами с элементом в i
            for (int j = i + 1; j < standardArray.length; ++j) {
                if (minVal > standardArray[j]) {
                    minVal = standardArray[j];
                    pos = j;
                }
            }

            int temp = standardArray[i];
            standardArray[i] = standardArray[pos];
            standardArray[pos] = temp;
        }

        for (int elem: standardArray) out.print(elem + " ");
        out.println();

        standardArray = new int[] {3, 5, 1, 6, 2, 4};
        // какая-то псевдопузырьковая сортировка по возрастанию, которую я придумал сам
        // имеется проблема с лишними присваиваниями
        for (int i = 0; i < standardArray.length - 1; ++i) {  // -1, так как нет смысла проверять последний элемент
            int elementToMove = standardArray[i];
            int toMoveIndex = i;
            for (int j = i + 1; j < standardArray.length; ++j) {  // +1, так как сверять элемент с самим собой нет необходимости
                if (elementToMove > standardArray[j]) {
                    standardArray[toMoveIndex] = standardArray[j];
                    standardArray[j] = elementToMove;
                    toMoveIndex = j;
                }
            }
        }

        for (int elem: standardArray) out.print(elem + " ");
    }
}
