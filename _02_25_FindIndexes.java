package SumSessionHW;

public class _02_25_FindIndexes {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        finderIndex(nums, target);

        nums = new int[]{3, 2, 4};
        target = 6;
        finderIndex(nums, target);

        nums = new int[]{3, 3};
        target = 6;
        finderIndex(nums, target);
    }

    /*
    Дан массив nums целых чисел и целое число target,
    найдите индексы двух элементов массива, чтобы сумма этих значений
    была равна target. Предполагается, что существует всегда только одно
    решение и нельзя использовать один и тот же элемент массива дважды.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
    */

    public static void finderIndex(int nums[], int target) {
        int length = nums.length; // задаем переменную для длины массива
        for (int i = 0, j = length - 1; i < j; ) {
            if (nums[i] + nums[j] == target) { // если сумма элементов равна target
                System.out.println("[" + i + ", " + j + "]"); // выводим индексы
                break; // выход из цикла
            } else if (i == 0 && j == 1) { // конечные условия при которых все элементы массива просмотрены
                System.out.println("No solution");
                break;
            } else if (j == i + 1) { // если i находится на 1 левее j
                i = 0; // помещаем i в начало массива
                j--; // сдвигаем j на 1 влево
            } else if (nums[i] + nums[j] != target) { // если сумма элементов не равна target
                i++; // сдвигаем i на 1 вправо

            }
        }
    }
}
