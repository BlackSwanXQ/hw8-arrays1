import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("task1");
        int[] arrInt = new int[]{1, 2, 3};

        double[] arrDouble = {1.57, 7.654, 9.986};

        char[] arrChar = {'a', 'b', 'c', 'd', 'e', 'f'};

//task2
        System.out.println("task2");
        for (int index = 0; index < arrInt.length; index++) {
            if (index == arrInt.length - 1) {
                System.out.print(arrInt[index]);
                break;
            }
            System.out.print(arrInt[index] + ", ");
        }

        System.out.println();
        for (int index = 0; index < arrDouble.length; index++) {
            if (index == arrDouble.length - 1) {
                System.out.print(arrDouble[index]);
                break;
            }
            System.out.print(arrDouble[index] + ", ");
        }

        System.out.println();
        for (int index = 0; index < arrChar.length; index++) {
            if (index == arrChar.length - 1) {
                System.out.print(arrChar[index]);
                break;
            }
            System.out.print(arrChar[index] + ", ");
        }

//task3
        System.out.println();
        System.out.println("task3");
        for (int index = arrInt.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arrInt[index]);
                break;
            }
            System.out.print(arrInt[index] + ", ");

        }

        System.out.println();
        for (int index = arrDouble.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arrDouble[index]);
                break;
            }
            System.out.print(arrDouble[index] + ", ");
        }

        System.out.println();
        for (int index = arrChar.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arrChar[index]);
                break;
            }
            System.out.print(arrChar[index] + ", ");
        }

//task4
        System.out.println();
        System.out.println("task4");

        for (int index = 0; index < arrInt.length; index++) {
            if (arrInt[index] % 2 != 0) {
                arrInt[index] += 1;
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }
}