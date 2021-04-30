import java.util.Arrays;

public class Solution3 {
        private static int temp;
    public static void offsetOfElementsInTheArray(int[] arr, int value){

        if (value > 0){

            for (int i = 0; i < value; i++) {
                temp = arr[0];
                arr[0] = arr[arr.length - 1];

                for (int j = 1; j < arr.length - 1; j++) {
                    arr[arr.length - j] = arr[arr.length -j - 1];
                }

                arr[1] = temp;
            }

        }
        if (value < 0) {
            for (int i = 0; i < value; i++) {

                temp = arr[arr.length - 1];
                arr[arr.length - 1] = arr[0];

                for (int j = 1; j < arr.length - 1; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 2] = temp;

            }
        }
        else if (value == 0)
            System.out.println("Cдвиг на ноль не предусмотрен!!!");
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int value = 4;
        offsetOfElementsInTheArray(arr, value);
    }
}
