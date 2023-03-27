package com.wolvesdevelopment.game.model;

import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class GameModel
{
    private int score;
    private ArrayList<Question> questions;
    private int currentQuestionIndex;
    private int numberOfQuestions;
    ArrayList<String> listOfAnswers;

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

    public void printCurrentQuestionIndex()
    {
        System.out.println(currentQuestionIndex);
    }

    public void nextQuestion()
    {
        currentQuestionIndex++;
    }

    public void askQuestion()
    {
        questions.get(currentQuestionIndex).printQuestionText();
    }

    public void getAnswer(int answerIndex)
    {
        if((answerIndex==questions.get(currentQuestionIndex).getCorrectAnswerIndex())&&(currentQuestionIndex+1)==numberOfQuestions)
        {
            score = 100*(currentQuestionIndex+1);
            System.out.println("Congratulations, you won! Your score is "+score+".");
            currentQuestionIndex++;
        }
        else if(answerIndex==questions.get(currentQuestionIndex).getCorrectAnswerIndex())
        {
            score = 100*(currentQuestionIndex+1);
            System.out.println("That's right! Your score is now "+score+".");
            currentQuestionIndex++;
        }
        else
        {
            System.out.println("Game over! Your score is "+score+".");
            currentQuestionIndex = numberOfQuestions;
        }
    }

    public void insertQuestionsFromDB(ResultSet resultSet)
    {
        try
        {
            while (resultSet.next())
            {
                listOfAnswers = new ArrayList<String>();
                for (int i = 0; i < 4; i++)
                {
                    listOfAnswers.add(resultSet.getString("answer" + (i + 1)));
                }
                questions.add(new Question(resultSet.getString("contents"), resultSet.getInt("correct_answer"), listOfAnswers));
            }
        }
        catch (SQLException e)
        {
            Database.printSQLException(e);
        }

    }
}
