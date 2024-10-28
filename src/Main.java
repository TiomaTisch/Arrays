import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задание 1_______");

        Random random = new Random();
        int [] bookExpenses = new int[5];
        for (int i = 0; i < bookExpenses.length; i++) {
            bookExpenses[i] = random.nextInt(1000000);
            System.out.println(bookExpenses[i]);
        }
        int totalExpenses = 0;
        for (final int current: bookExpenses) {
            totalExpenses += current;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        System.out.println("_______Задание 2_______");

        int minExpenses = bookExpenses[0];
        int maxExpenses = bookExpenses[0];
        for (final int current: bookExpenses) {
            if (current > maxExpenses){
                maxExpenses = current;
            }
            if (current < minExpenses){
                minExpenses = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses +
                " рублей. Максимальная сумма трат за неделю составила " +maxExpenses+ " рублей");

        System.out.println("_______Задание 3_______");

        float averageExpenses = (float) totalExpenses /bookExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses +" рублей");

        System.out.println("_______Задание 4_______");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}