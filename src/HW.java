import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW {
    public static void main(String[] args) {
/*
 /*
    Задача 1
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий
элементы Yes или No, где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать
     */


        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println("List 1 " + num);

        List<Integer> num1 = new ArrayList<>();
        num1.add(5);
        num1.add(2);
        num1.add(3);
        num1.add(8);
        System.out.println("List 2 " + num1);

        System.out.println("=======================");
        Collections.sort(num1);
        System.out.println("SortList 2 " + num1);


    }

}
