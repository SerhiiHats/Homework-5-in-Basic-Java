package teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teacherList = new ArrayList<>();
        teacherList.add("Сорока");
        teacherList.add("Пятун");
        teacherList.add("Згеря");
        teacherList.add("Соловьева");
        teacherList.add("Бурцева");
        teacherList.add("Колачева");

        System.out.println("Лучший учитель находится под № " + teacherList.indexOf("Бурцева")); // индекс обекта indexOf("Бурцева")
        System.out.println("Самый не очень учитель находится под № " + teacherList.indexOf("Пятун"));


    }
}
