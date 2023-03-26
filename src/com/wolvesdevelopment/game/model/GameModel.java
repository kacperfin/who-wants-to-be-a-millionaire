package com.wolvesdevelopment.game.model;

import java.util.ArrayList;

public class GameModel
{
    private int score;
    private ArrayList<Question> questions;
    private int currentQuestionIndex;
    private int numberOfQuestions;

    public GameModel(ArrayList<Question> questions)
    {
        this.score = 0;
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.numberOfQuestions = questions.size();
    }

    public boolean isGameOver()
    {
        return currentQuestionIndex==numberOfQuestions;
    }

    public void nextQuestion()
    {
        currentQuestionIndex++;
    }

    public void runGame()
    {
        while(!isGameOver())
        {
            questions.get(currentQuestionIndex).printQuestionText();
            currentQuestionIndex++;
        }
        System.out.println("Game over! Your score is: "+score);
        System.out.println("Thank you for playing!");
    }

}
