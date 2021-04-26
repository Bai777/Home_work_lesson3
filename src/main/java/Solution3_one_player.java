import java.util.Scanner;

public class Solution3_one_player {
    private static final int numberOfAttempts = 3;

    public static void generateNumber(){
        int number = (int)(Math.random() * 9);
        game(number);
    }

    public static void game(int valuePC){
        System.out.println(valuePC);

        int count = 3;
        System.out.println("Угадайте число от 0 до 9\nУ вас попыток " + count--);
        for (int i = 0; i < numberOfAttempts; i++) {

//            if(count == 0){
//                System.out.println("Вы не угадали. Правильный ответ " + valuePC);
//                break;
//            }

            Scanner in = new Scanner(System.in);
            int valueGamer = in.nextInt();

             if (valuePC == valueGamer){
                System.out.println("Вы угадали!!!");
                System.out.println("Правильный ответ " + valuePC);
                break;
            }

            else if (valuePC > valueGamer) {
                System.out.println("Вы ввели слишком маленькое значение\nПопробуйте снова)\nУ вас осталось попыток " + count--);
            }

            else if (valuePC < valueGamer) {
                System.out.println("Вы ввели слишком большое значение\nПопробуйте снова)\nУ вас осталось попыток " + count--);
            }


        }

        returnGame();
    }

    public static void returnGame() {

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        Scanner inValue = new Scanner(System.in);
        int gamerValue = inValue.nextInt();
        switch (gamerValue) {
            case (0):
                System.out.println("GAME OVER!!!");
                System.exit(0);
                break;
            case (1):
                generateNumber();
                break;
            default:
                System.out.println("Вы ввели не корректное значение!!!");
                System.exit(0);
        }
    }





    public static void main(String[] args) {
        generateNumber();
    }
}
