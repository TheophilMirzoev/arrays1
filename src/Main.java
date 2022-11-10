public class Main {
    public static void main(String[] args) {

        int[] number1 = new int[3];
        number1 [0] = 1;
        number1 [1] = 2;
        number1 [2] = 3;

        float[] number2 = {1.57f, 7.654f, 9.986f};

        int[] number3 = {32, 34, 45, 56, 12, 89};

        System.out.print(number1[0] + ", " + number1[1] +  ", " + number1[2]);
        System.out.println();

        System.out.print(number2[0] + ", " + number2[1] +  ", " + number2[2]);
        System.out.println();

        System.out.print(number3[0] + ", " + number3[1] +  ", " + number3[2]);
        System.out.println();

        System.out.print(number1[2] + ", " + number1[1] +  ", " + number1[0]);
        System.out.println();

        System.out.print(number2[2] + ", " + number2[1] +  ", " + number2[0]);
        System.out.println();

        System.out.print(number3[5] +  ", " + number3[4] + ", " + number3[3] + ", " + number3[2] +  ", " + number3[1] + ", " + number3[0]);
        System.out.println();

        for(int i= 0; i < 1; i++){
            number1 [0]++;
            number1 [2]++;
            System.out.print(number1[0] + ", " + number1[1] +  ", " + number1[2]);
        }















    }

















}