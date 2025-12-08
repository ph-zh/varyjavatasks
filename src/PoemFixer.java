/*
Часто при реализации больших программ часть данных в них попадает в неподходящем, «сыром» виде.
Такие данные нужно преобразовать, чтобы избежать ошибок в их дальнейшей обработке. Напишите метод String fixPoem(String[] poem) для работы со стихотворениями.
Метод должен удалять пустые строки (или строки из пробельных символов) и лишние пробелы с начала и конца. Стихотворение доступно по вызову метода readPoem() в виде списка строк.
К примеру, если на входе у нас такой набор строк:

" Я помню чудное мгновенье:",
"   Передо мной явилась ты,   ",
"",
"   ",
" Как мимолётное виденье,",
" ",
"Как гений чистой красоты.",
""
То после обработки он должен выглядеть так:

"Я помню чудное мгновенье:",
"Передо мной явилась ты,",
"Как мимолётное виденье,",
"Как гений чистой красоты."
*/
public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        // допишите код
        StringBuilder builder = new StringBuilder();
        for (String text : poem) {
            if (!text.isBlank()) {
                builder.append(text.trim()).append("\n");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}