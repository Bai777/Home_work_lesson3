import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void generateWords(String[] arrayWords){
        int generate = (int)(Math.random() * arrayWords.length);
        startGame(words[generate]);
    }


    public static void startGame(String word){
        int symbolNumber = 0;
        char[] arr = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
        int count = word.length();
        count--;
        System.out.println("Введите свой ответ: " + word);

        while (true) {

            Scanner in = new Scanner(System.in);
            String answerUser = in.next().toLowerCase();


            if (answerUser.equals(word)) {
                System.out.println("Вы угадали!!!\nGAME OVER;)");
                break;
            } else if(count != 0){
                System.out.println("Ответ не верный! Попробуйте снова.");
                arr[symbolNumber] = word.charAt(symbolNumber);
                System.out.println("Подсказка: " + Arrays.toString(arr));
            }
            if (count == 0) {
                System.out.println("GAME OVER!!! YOU LOOS)");
                System.out.println("Правильный ответ: " + word);
                break;
            }
            count--;
            symbolNumber++;
        }
    }



    public static void main(String[] args) {
        System.out.println("Кампутер загадывает слово)");
        generateWords(words);
    }
}
