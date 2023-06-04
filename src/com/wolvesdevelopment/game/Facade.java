package com.wolvesdevelopment.game;

public class Facade
{
    private Game game;

    public Facade()
    {
        game = new Game();
    }

    public void startGame()
    {
        game.startGame();
    }

    public String getQuestion()
    {
        return game.getQuestion();
    }

    public String[] getAnswers()
    {
        return game.getAnswers();
    }

    public int isAnswerCorrect(int answer)
    {
        /*
        * 0 - game over,
        * 1 - game continues,
        * 2 - you won
        * */
        return game.isAnswerCorrect(answer);
    }

    public int getCurrentQuestionNumber()
    {
        return game.getCurrentQuestionIndex();
    }

    public int[] getAnswersToHide()
    {
        /* after using lifebelt, client can run this function and
        * get 2 wrong answer indexes to be hidden */
        return game.getAnswersToHide();
    }

    public boolean isLifebeltAvailable()
    {
        return game.isLifebeltAvailable();
    }

    public void useLifebelt()
    {
        game.useLifebelt();
    }

    public int[] getMoney()
    {
        /* [0] - nagroda gwarantowana */
        /* [0] - ile dostajesz jesli zrezygnujesz */
        /* [0] - o ile grasz */
        return game.getMoney();
    }
}
