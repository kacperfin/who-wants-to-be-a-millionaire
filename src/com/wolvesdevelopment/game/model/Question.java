package com.wolvesdevelopment.game.model;

import java.util.ArrayList;

public class Question
{
    private String questionText;
    private int correctAnswerIndex;
    private ArrayList<String> answers;

    public Question(String questionText, int correctAnswerIndex, ArrayList <String> answers)
    {
        this.setQuestionText(questionText);
        this.setCorrectAnswerIndex(correctAnswerIndex);
        this.answers = answers;
    }

    public String getQuestionText()
    {
        return questionText;
    }

    public int getCorrectAnswerIndex()
    {
        return correctAnswerIndex;
    }

    public boolean isCorrect(int answerNumber)
    {
        return answerNumber == correctAnswerIndex;
    }

    public void setQuestionText(String questionText)
    {
        this.questionText = questionText;
    }

    public void setCorrectAnswerIndex(int CorrectAnswerIndex)
    {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public void setAnswerTextOfIndex(int index, String text)
    {
        answers.set(index, text);
    }

    public void printQuestionText()
    {
        System.out.println(questionText);
    }

    public void printCorrectAnswerIndex()
    {
        System.out.print(correctAnswerIndex);
    }

    public void printCorrectAnswerText()
    {
        System.out.println(answers.get(correctAnswerIndex));
    }

    public void printAnswerTextOfIndex(int index)
    {
        System.out.println(answers.get(index));
    }

    public void printAllAnswers()
    {
        for(int i=0; i<answers.size(); i++)
        {
            printAnswerTextOfIndex(i);
        }
    }
}
