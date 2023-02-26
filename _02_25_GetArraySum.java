package SumSessionHW;

import java.util.Arrays;

public class _02_25_GetArraySum {
    public static void main(String[] args) {

        int[] digits = {1, 2, 3};
        getArraySum(digits);

        digits = new int[]{4, 3, 2, 1};
        getArraySum(digits);

        digits = new int[]{9};
        getArraySum(digits);
    }

    /*
    Дано целое число, представленное его разрядами, которые записаны в массив.
    Например, число 123 представляется массивом [1, 2, 3]. Получите массив,
    который преставляет сумму исходного числа и 1.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
     */
    public static void getArraySum(int[] digits) {
        if (digits.length == 1 && digits[0] == 9) { // если в массиве один элемент и он равен 9
            digits = new int[]{1, 0}; // то создаем новый массив с двумя элементами 1 и 0
            System.out.println(Arrays.toString(digits));
        return; // выход из метода
        }
        if (digits[digits.length - 1] == 9) { // если последний элемент массива равен 9
            digits[digits.length - 1] = 0; // то присваиваем ему значение 0
            digits[digits.length - 2] += 1; // а предпоследнему элементу массива прибавляем 1
            System.out.println(Arrays.toString(digits));
        } else {
            digits[digits.length - 1] += 1; // иначе просто прибавляем 1 к последнему элементу массива
            System.out.println(Arrays.toString(digits));
        }
    }
}