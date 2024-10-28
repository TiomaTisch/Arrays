import java.util.Arrays;
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
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrFlo));
        System.out.println(Arrays.toString(arrBool));

        System.out.println("_______Задание 2_______");

        System.out.print("arrInt = " + arrInt[0] + ", " + arrInt[1] + ", "+ arrInt[2]);
        System.out.println();
        System.out.print("arrFlo = " + arrFlo[0] + ", " + arrFlo[1] + ", "+ arrFlo[2]);
        System.out.println();
        System.out.print("arrBool = " + arrBool[0] + ", " + arrBool[1] + ", "+ arrBool[2]);
        System.out.println();

        System.out.println("_______Задание 3_______");

        System.out.print("arrInt = ");
        for (int i = arrInt.length-1; i >=0; i--){
            if (i< arrInt.length-1){
                System.out.print(", ");
            }
            System.out.print(arrInt[i]);
        }
        System.out.println();
        System.out.print("arrFlo = ");
        for (int i = arrFlo.length-1; i >=0; i--){
            if (i< arrFlo.length-1){
                System.out.print(", ");
            }
            System.out.print(arrFlo[i]);
        }
        System.out.println();
        System.out.print("arrBool = ");
        for (int i = arrBool.length-1; i >=0; i--){
            if (i< arrBool.length-1){
                System.out.print(", ");
            }
            System.out.print(arrBool[i]);
        }
        System.out.println();

        System.out.println("_______Задание 4_______");

        boolean isIntArray = true;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 1 != 0) {
                isIntArray = false;
                break;
            }
        }
        if(isIntArray){
            for (int i = 0; i < arrInt.length; i++) {
                if(arrInt[i] % 2 != 0) {
                    arrInt[i] += 1;
                }
                System.out.print(arrInt[i] + ", ");
            }
        }
    }
}