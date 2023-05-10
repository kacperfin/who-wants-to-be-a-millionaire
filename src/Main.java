import com.wolvesdevelopment.game.Facade;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
            Facade facade = new Facade();
            facade.startGame();
            Scanner scanner = new Scanner(System.in);
            int answer;

            do {
                System.out.println(facade.getQuestion());
                System.out.println(Arrays.toString(facade.getAnswers()));
                System.out.println(Arrays.toString(facade.getMoney()));

                answer = scanner.nextInt();

            } while (facade.isAnswerCorrect(answer) == 1);
    }
}
