package com.wolvesdevelopment.game.model;

public class Question
{
    private String questionText;
    private int correctAnswerNumber;

    public Question(String questionText, int correctAnswerNumber)
    {
        this.setQuestionText(questionText);
        this.setCorrectAnswerNumber(correctAnswerNumber);
    }

    public String getQuestionText()
    {
        return questionText;
    }

    public int getCorrectAnswerNumber()
    {
        return correctAnswerNumber;
    }

    public boolean isCorrect(int answerNumber)
    {
        return answerNumber == correctAnswerNumber;
    }

    public void setQuestionText(String questionText)
    {
        this.questionText = questionText;
    }

    public void setCorrectAnswerNumber(int correctAnswerNumber)
    {
        this.correctAnswerNumber = correctAnswerNumber;
    }
}
