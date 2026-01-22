/*
Программа по учёту оценок сломалась, но в нашей части системы сохранились бэкапы!
Проведите преобразование, обратное тому, которое было в предыдущем задании. На вход теперь подаётся массив строк:
* Вероника Чехова физика — Безупречно
* Анна Строкова математика — Потрясающе
* Иван Петров геометрия — Безупречно
Требуется превратить их в одну запись вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка".
Метод для перевода оценки в строку-число уже реализован.
*/
public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {

        String grade = String.join(";",grades);

        return grade.toLowerCase().replace(" — безупречно", gradeStringToInt(grade)).replace(" — потрясающе",gradeStringToInt(grade));
    }

    public static void main(String[] Arg) {
        GradesReversed gradesReversed = new GradesReversed();

        String[] arrayOfGrades = new String[]{
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };
        System.out.println(gradesReversed.serializeGrades(arrayOfGrades));
    }

}