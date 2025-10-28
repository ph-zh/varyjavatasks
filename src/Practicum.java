/*

 */

public class Practicum {

    public static void main(String[] args) {
        int[] array = new int[] {1, 5, 999, 2, 9, 10, 552, 3, 4, 14, 10};

        boolean duplicateFound = false;
        for (int i = 0; i < array.length && !duplicateFound; i++) {
            for (int j = 0; j < array.length; j++) {

                // пропускаем одинаковый индекс, чтобы не сравнить элемент с самим собой
                if (j == i) continue;
                if (array[i] == array[j]) {
                    duplicateFound = true;
                    break;
                }
            }
        }

        System.out.println("Дубликат найден: " + duplicateFound);
    }

}