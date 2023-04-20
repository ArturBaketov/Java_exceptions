package task2;

/*
Задание 2:
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */

public class Main {
    public static void main(String[] args) {

        String[][] x = {
                { "1", "2", "9", "8", "0" },
                { "3", "4", "5", "6", "7" }
        };

        System.out.println(Method.sum2d(x));

    }

}
