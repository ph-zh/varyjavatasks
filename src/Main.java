/*
Напишите код хеш-таблицы государственных праздников stateHolidays, которая будет содержать месяцы и праздничные даты:
Январь — 1, 7;
Февраль — 23;
Март — 8;
Май — 1, 9;
Июнь — 12;
Ноябрь — 4.
*/
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> janDays = new ArrayList<>();
        janDays.add(1);
        janDays.add(7);
        stateHolidays.put("Январь", janDays);

        ArrayList<Integer> febDays = new ArrayList<>();
        febDays.add(23);
        stateHolidays.put("Февраль", febDays);

        ArrayList<Integer> marchDays = new ArrayList<>();
        marchDays.add(8);
        stateHolidays.put("Март", marchDays);

        ArrayList<Integer> mayDays = new ArrayList<>();
        mayDays.add(1);
        mayDays.add(9);
        stateHolidays.put("Май", mayDays);

        ArrayList<Integer> juneDays = new ArrayList<>();
        juneDays.add(12);
        stateHolidays.put("Июнь", juneDays);

        ArrayList<Integer> novDays = new ArrayList<>();
        novDays.add(4);
        stateHolidays.put("Ноябрь", novDays);

        System.out.println(stateHolidays);
    }
}