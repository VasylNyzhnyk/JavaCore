package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Задание 1
 Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
•	добавления
•	удаления
•	поиска элемента по значению
•	поиска элемента по индексу
•	поиска максимального элемента
•	поиска минимального элемента
•	поиска среднего арифметического всех элементов
При этом:
•	при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
•	при удалении - уменьшают своё значение на удаляемый элемент
Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.
*/
public class DemoCollections {

    public static void main(String[] args) throws IOException {
        List arrayList = new ArrayList();
        insert(arrayList);
        remove(arrayList);
        System.out.println(arrayList);
    }

    public static void insert(List list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
    }


    public static void remove(List list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.size(); i++) {
            list.remove(Integer.parseInt(reader.readLine()));
        }
    }
}