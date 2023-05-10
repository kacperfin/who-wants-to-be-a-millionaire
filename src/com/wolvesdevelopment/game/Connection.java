package com.wolvesdevelopment.game;

import java.util.ArrayList;

public class Connection {
    //Tu Kuba stworzy obiekt bazy danych
    
    ArrayList<Question> questions;
    
    public Connection()
    {
        questions = new ArrayList<>();

        questions.add(new Question("Pytanie 1", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 2", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 3", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 4", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 5", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 6", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 7", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 8", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 9", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 10", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 11", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
        questions.add(new Question("Pytanie 12", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
    }

    public ArrayList<Question> getQuestions()
    {
        return questions;
    }

}
