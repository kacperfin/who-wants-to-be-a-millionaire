package com.wolvesdevelopment.game;

import java.util.List;

public class Question {

    private String question;
    private String answer0;
    private String answer1;
    private String answer2;
    private String answer3;
    private int correctAnswerIndex;

    public Question(String question, String answer0, String answer1, String answer2, String answer3, int correctAnswerIndex) {
        this.question = question;
        this.answer0 = answer0;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer0() {
        return answer0;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
