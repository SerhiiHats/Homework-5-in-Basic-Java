package iteratorOfList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(21);
        number.add(0);
        number.add(3);
        number.add(37);
        System.out.println("ArrayList целых чисел до операций над ними");
        System.out.println(number);

        // получаем «Iterator» для нашего ArrayList
        ListIterator<Integer> iterator = number.listIterator();  //  переборщик итератор «Iterator» перебирает от начала к концу коллекции

        while (iterator.hasNext()) {               // цикл - пока есть следующий елемент
            iterator.set(iterator.next() + 1);
        }
        System.out.println("ArrayList после операций над ними");

        for (Integer integer : number) {
            System.out.print(integer + " ");
        }
    }
}

