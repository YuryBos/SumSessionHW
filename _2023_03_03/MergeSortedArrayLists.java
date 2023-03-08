package SumSessionHW;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrayLists {
    public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(4);

    List<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(3);
    list2.add(4);
//    list2.add(30);

    List<Integer> result = mergeLists(list1, list2);
    System.out.println(result);
}
   /* Task 1.
    Даны два ArrayList, элементы которых упорядочены.
    Объединить их в трерий ArrayList, элементы которого тоже должны быть отсортированы.
    Example 1:
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
    Example 2:
    Input: list1 = [], list2 = []
    Output: []
    Example 3:
    Input: list1 = [], list2 = [0]
    Output: [0]*/
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(); // создаем список для записи результата слияния двух списков
        int i = 0, j = 0; // создаем переменные для индексов списков list1 и list2
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) { // если элемент списка list1 меньше элемента списка list2
                result.add(list1.get(i)); // добавляем элемент списка list1 в список result
                i++;
            } else {
                result.add(list2.get(j)); // иначе добавляем элемент списка list2 в список result
                j++;
            }
        }
        while (i < list1.size()) { // если элементы списка list1 остались, то добавляем их в список result
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) { // если элементы списка list2 остались, то добавляем их в список result
            result.add(list2.get(j));
            j++;
        }
        return result;
    }
}
