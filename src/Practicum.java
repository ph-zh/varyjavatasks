/*

*/
public class Practicum {
    public static void main(String[] args) {
        String excellent = "Марина Голубева,Анна Иванова,Василий Рябов,Екатерина Белых,Иван Засонин";

        String[] split = excellent.split(",");

        for (String student: split) {
            System.out.println(student + " — отлично");
        }
    }
}