/*
Настройте программу по учёту школьных оценок. На вход подаётся строка, один элемент которой имеет вид <имя, фамилия, предмет, оценка>.
Между собой элементы разделяются с помощью символа ";".
К примеру:
"вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5"
Нужно вывести на экран отдельные строки вида "Имя Фамилия предмет — Оценка". При этом нужно учесть, что
- Имя и фамилия должны начинаться с большой буквы — здесь вам поможет метод String capitalize(String str), который вы написали ранее.
- Название предмета должно состоять из строчных букв.
- Оценка должна быть преобразована в текст. Соответствующий метод String gradeToString(String grade) уже реализован в прекоде.
- Оценка должна быть отделена от предмета длинным тире '—'. Скопируйте символ в код и не забудьте добавить по пробелу с каждой стороны.
Выходные данные должны получиться такими:
- Вероника Чехова физика — Безупречно
- Анна Строкова математика — Потрясающе
- Иван Петров геометрия — Безупречно
*/
public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
			// реализуйте метод здесь
        System.out.println(grades);

        String[] split = grades.split(";");

        for (String grade : split) {
            String[] anotherSplit = grade.split(",");
            for (String anotherGrade : anotherSplit) {
                StringBuilder builder = new StringBuilder(anotherGrade.replace("4", gradeToString(anotherGrade)).replace("5", gradeToString(anotherGrade)));
                System.out.println(capitalize(builder.toString()));
            }
        }
    }

    public static void main(String[] args) {
        String[] students = new String[]{
                "вероника,чехова,ФИЗИКА,5",
                "анна,строкова,МАТЕМАТИКА,4",
                "иван,петров,ГЕОМЕТРИЯ,5",
        };

        Grades grade = new Grades();
        String stringStudent = String.join(";", students);
        grade.gradeBeautifier(stringStudent);
    }
}