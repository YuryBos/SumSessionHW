package SumSessionHW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiddleElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        /*
        Task 2.
        Пусть дан ArrayList нечетной длины. Используя только Iterator
        (не прибегая к индексам и длине списка), вывести на экран элемент,
        находящийся ровно посередине списка.
                Example 1:
        Input: list = [1,2,4]
        Output: 2
        Example 2:
        Input: list = [1,2,3,4,5]
        Output: 3
        Example 3:
        Input: list = [1]
        Output: 1
        */
        Iterator<Integer> iterator1 = list.iterator();
        int sizeList = 0;
        while (iterator1.hasNext()) { // определяем размер списка list без использования метода size()
            iterator1.next();
            sizeList++;
        }

        int middleIndex = sizeList / 2; // определяем индекс среднего элемента списка list
        Iterator<Integer> iterator = list.iterator();
        int currentIndex = 0;
        while (iterator.hasNext()) { // выводим средний элемент списка list
            int element = iterator.next();
            if (currentIndex == middleIndex) {
                System.out.println(element);
                break;
            }
            currentIndex++;
        }
    }
}
