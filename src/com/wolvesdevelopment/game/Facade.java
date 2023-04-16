package com.wolvesdevelopment.game;

public class Facade
{
    private Game game = new Game();

    public Facade()
    {
        ;
    }

    public String getQuestion()
    {
        return "Question";
    }

    public String[] getAnswers()
    {
        String[] answers = {"1", "2", "3", "4"};
        return answers;
    }

    public int isAnswerCorrect(int answer)
    {
        /*
        * 0 - game over,
        * 1 - game continues,
        * 2 - you won
        * */
        return 1;
    }

    public int getCurrentQuestionNumber()
    {
        return 11;
    }

    public int[] getAnswersToHide()
    {
        int answersToHide[] = {1, 3};
        if(isLifebeltAvailable())
            return answersToHide;
        else return null;
    }

    public boolean isLifebeltAvailable()
    {
        return true;
    }

    public int[] getMoney()
    {
        /*
        * money[0] - guaranteed prize
        * money[1] - current prize if you leave
        * money[2] - prize if you get the next question right
        * */
        int[] money = {40000, 250000, 500000};
        return money;
    }

}
