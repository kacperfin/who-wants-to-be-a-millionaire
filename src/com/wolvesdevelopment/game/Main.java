package com.wolvesdevelopment.game;
import com.wolvesdevelopment.game.model.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //The code below will be replaced by code for reading questions from a database
        int numberOfQuestions=1;
        ArrayList<Question> questions = new ArrayList<Question>();
        for(int i=0; i<numberOfQuestions; i++)
        {
            ArrayList<String> listOfAnswers = new ArrayList<String>();
            listOfAnswers.add("Abraham Lincoln");
            listOfAnswers.add("George Washington");
            listOfAnswers.add("John F. Kennedy");
            listOfAnswers.add("Donald Trump");
            Question question = new Question("What is the name of the 1st president of the USA?", 1, listOfAnswers);
            questions.add(question);
        }

        GameModel gameModel = new GameModel(questions);
        gameModel.runGame();
    }
}