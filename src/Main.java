import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задание 1_______");
        int [] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        float [] arrFlo = {1.57F, 7.654F, 9.986F};
        boolean [] arrBool = new boolean[3];
        Random random = new Random();
        for (int i = 0; i < arrBool.length; i++) {
            arrBool[i] = random.nextBoolean();
        }

        System.out.println("_______Задание 2_______");

        System.out.print("arrInt = " + arrInt[0] + ", " + arrInt[1] + ", "+ arrInt[2]);
        System.out.println();
        System.out.print("arrFlo = " + arrFlo[0] + ", " + arrFlo[1] + ", "+ arrFlo[2]);
        System.out.println();
        System.out.print("arrBool = " + arrBool[0] + ", " + arrBool[1] + ", "+ arrBool[2]);
        System.out.println();

        System.out.println("_______Задание 3_______");

        System.out.print("arrInt = " + arrInt[2] + ", " + arrInt[1] + ", "+ arrInt[0]);
        System.out.println();
        System.out.print("arrFlo = " + arrFlo[2] + ", " + arrFlo[1] + ", "+ arrFlo[0]);
        System.out.println();
        System.out.print("arrBool = " + arrBool[2] + ", " + arrBool[1] + ", "+ arrBool[0]);
        System.out.println();

        System.out.println("_______Задание 4_______");

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0 ) {
                arrInt[i] += 1;
            }
            System.out.print(arrInt[i]+", ");
        }
    }
}