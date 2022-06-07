package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> zoo = new ArrayList<>();
        zoo.add(0, "Жераф");
        zoo.add(1, "Обезьяна");
        zoo.add(2, "Лев");
        zoo.add(3, "Слон");
        zoo.add(4, "Верблюд");
        zoo.add(5, "Бегемот");
        zoo.add(6, "Зебра");
        zoo.add(7, "Крокодил");
        System.out.println("ArrayList  до удаления, его размер : " + zoo.size());
        for (int i = 0; i < zoo.size(); i++) {
            System.out.print(i + ". " + zoo.get(i) + "  ");
        }
        System.out.println();

        zoo.remove(2);
        zoo.remove(4);
        /**  zoo.remove(6);       //  7 - животное уже нельзя удалить т.к. его не существует, потому как всего было 8 - 2 = 6
         // исключение - IndexOutOfBoundsException и аварийное завершение работы
         */
        System.out.println();
        System.out.println("ArrayList  после удаления, его размер : " + zoo.size());
        for (int i = 0; i < zoo.size(); i++) {
            System.out.print(i + ". " + zoo.get(i) + "  ");
        }
    }
}
