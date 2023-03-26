package com.wolvesdevelopment.game;
import com.wolvesdevelopment.game.model.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abraham Lincoln");
        list.add("George Washington");
        list.add("John F. Kennedy");
        list.add("Donald Trump");
        Question question = new Question("What is the name of the 1st president of the USA?", 1, list);
        question.printQuestionText();
        question.printAllAnswers();
    }
}