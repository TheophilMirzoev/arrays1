public class Main {
    public static void main(String[] args) {

        int[] number1 = new int[3];             // 1 задача
        number1 [0] = 1;
        number1 [1] = 2;
        number1 [2] = 3;

        float[] number2 = {1.57f, 7.654f, 9.986f};

        int[] number3 = {32, 34, 45, 56, 12, 89};

        for (int i = 0; i < 3; i++) {             // 2 задача
            System.out.print(number1[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(number2[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(number3[i] + ", ");
        }

        System.out.println();
        for (int i = 2; i >= 0; --i) {            // 3 задача
            System.out.print(number1[i] + ", ");
        }

        System.out.println();

        for (int i = 2; i >= 0; --i) {
            System.out.print(number2[i] + ", ");
        }

        System.out.println();

        for (int i = 5; i >= 0; --i) {
            System.out.print(number3[i] + ", ");
        }

        System.out.println();

        for(int i= 0; i < number1.length; i++){         // Задача 4 Все нечетные числа в целочисленном массиве четные с помощью прибавления 1
            if(number1[i] % 2 != 0) {
                number1[i]++;
            }
            System.out.print(number1[i] + " ,");
        }

    }


















}