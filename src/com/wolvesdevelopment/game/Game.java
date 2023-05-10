package com.wolvesdevelopment.game;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    List<Question> questions;
    int currentQuestionIndex;
    Connection connection = new Connection();
    int[] prizes = {500, 1000, 2000, 5000, 10000, 20000, 40000, 75000, 125000, 250000, 500000, 1000000};
    int guaranteedPrize;
    boolean isLifebeltAvailable;

    public void startGame()
    {
        this.questions = connection.getQuestions();
        this.currentQuestionIndex = 0;
        this.guaranteedPrize = 0;
        this.isLifebeltAvailable = true;
    }

    public String getQuestion()
    {
        return questions.get(currentQuestionIndex).getQuestion();
    }

    public String[] getAnswers()
    {
        return new String[]{questions.get(currentQuestionIndex).getAnswer0(),
                            questions.get(currentQuestionIndex).getAnswer1(),
                            questions.get(currentQuestionIndex).getAnswer2(),
                            questions.get(currentQuestionIndex).getAnswer3()};
    }

    public int[] getMoney()
    {
        int[] money;

        if (currentQuestionIndex == 0) {
            money = new int[]{0, 0, prizes[currentQuestionIndex]};
        } else {
            money = new int[]{guaranteedPrize, prizes[currentQuestionIndex - 1], prizes[currentQuestionIndex]};
        }
        return money;
    }

    public boolean isLifebeltAvailable()
    {
        return isLifebeltAvailable;
    }

    public void useLifebelt()
    {
        if(isLifebeltAvailable())
        {
            isLifebeltAvailable = false;
        }
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    public int[] getAnswersToHide() {
        if(isLifebeltAvailable())
        {
            int randomNum;
            int[] answersToReturn = new int[2];
            List<Integer> answersToHide = new ArrayList<>();

            while ((randomNum = ThreadLocalRandom.current().nextInt(0, 4)) !=
                    questions.get(currentQuestionIndex).getCorrectAnswerIndex() &&
                    answersToHide.size() < 2)
            {
                answersToHide.add(randomNum);
            }

            for (int i = 0; i < 2; i++)
                answersToReturn[i] = answersToHide.get(i);


            return answersToReturn;
        }
        else
        {
            return null;
        }
    }

    public int isAnswerCorrect(int answer)
    {
        if(answer==questions.get(currentQuestionIndex).getCorrectAnswerIndex())
        {
            if (    currentQuestionIndex == 1 ||
                    currentQuestionIndex == 6 ||
                    currentQuestionIndex == 12)
            {
                guaranteedPrize = prizes[currentQuestionIndex];
            }

            currentQuestionIndex++;

            if(currentQuestionIndex==12)
            {
                return 2; //you won
            }
            else return 1; //game continues
        }
        else return 0; //game over
    }
}
