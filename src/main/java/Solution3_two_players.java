import java.util.Scanner;

public class Solution3_two_players {
    private static final int numberOfAttempts = 3;

    public static void generateNumber(){
        int number = (int)(Math.random() * 9);
        game(number);
    }

    public static String nameStartedGamers(String name1, String name2){

        int randomName = (int)(Math.random() * 2);
        if (randomName == 0){
            return name1;
        }
        else return name2;
    }

    public static void game(int valuePC){

        System.out.println(valuePC);
        System.out.println("Введите имена игроков: ");
        Scanner inName = new Scanner(System.in);
        String nameGamer1 = inName.next();
        String nameGamer2 = inName.next();
        System.out.println(nameGamer1 + " vs " + nameGamer2);
        String winner = nameStartedGamers(nameGamer1, nameGamer2);

        int count = 3;
        System.out.println("Угадайте число от 0 до 9\nУ вас попыток " + count);
        for (int i = 0; i < numberOfAttempts; i++) {

            System.out.println("Ходит игрок " + winner);

            Scanner in = new Scanner(System.in);
            int valueGamer = in.nextInt();

             if(count == 0){
                break;
            }
             else if (valuePC == valueGamer){
                 System.out.println("Вы угадали!!!\nПобедил игрок " + winner);
                 break;
             }
            else if (valuePC > valueGamer) {
                System.out.println("Вы ввели слишком маленькое значение\nПопробуйте снова)\nУ вас осталось попыток " + --count);
            }

            else if (valuePC < valueGamer) {
                System.out.println("Вы ввели слишком большое значение\nПопробуйте снова)\nУ вас осталось попыток " + --count);
            }

            if (winner == nameGamer1)
                winner = nameGamer2;
            else winner = nameGamer1;
        }
        System.out.println("Правильный ответ " + valuePC);
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
