import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

    public static void generateArray(int number){
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = (int)(Math.random() * number);
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(arr));
        System.out.println(checkBalance(arr));
    }

    public static boolean checkBalance(int[] arr){
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0, j = 0; i < arr.length - j; i++) {
            leftSum += arr[i];
            if (leftSum > rightSum){
                rightSum += arr[arr.length -1 - j++];
            }
        }
        return leftSum == rightSum;
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите целое число для формирования массива: ");
            Scanner in = new Scanner(System.in);
            int inputNumber = in.nextInt();
            if (inputNumber >= 2){
                generateArray(in.nextInt());
            break;}
            else System.out.println("Вы ввели не корректное значение!!!");
        }


    }

}
