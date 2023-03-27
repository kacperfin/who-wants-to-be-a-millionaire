package com.wolvesdevelopment.game;

import com.wolvesdevelopment.game.model.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Question> questions = new ArrayList<Question>();
        int answerIndex;
        Scanner scanner = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/milionerzy";
        String username = "root";
        String password = "";

        Database db = new Database(url, username, password);
        db.connect();
        db.query("SELECT * FROM questions ORDER BY RAND() LIMIT 4");


        ResultSet resultSet = db.getResultSet();
        GameModel gameModel = new GameModel(questions);
        gameModel.insertQuestionsFromDB(resultSet);
        db.close();


        while(!gameModel.isGameOver())
        {
            gameModel.askQuestion();
            gameModel.printCurrentQuestionIndex();
            answerIndex = scanner.nextInt();
            gameModel.getAnswer(answerIndex);
        }
    }
}