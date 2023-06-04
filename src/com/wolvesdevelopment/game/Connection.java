package com.wolvesdevelopment.game;

import java.util.ArrayList;

public class Connection {
    //Tu Kuba stworzy obiekt bazy danych
    
    ArrayList<Question> questions;
    
    public Connection()
    {
        questions = new ArrayList<>();

//        questions.add(new Question("Pytanie 1", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 2", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 3", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 4", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 5", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 6", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 7", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 8", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 9", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 10", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 11", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));
//        questions.add(new Question("Pytanie 12", "Odp 0", "Odp 1", "Odp 2", "Odp 3", 1));

    questions.add(new Question("Która planeta jest najbliższa Słońcu?", "Merkury", "Wenus", "Mars", "Jowisz", 0));
    questions.add(new Question("Kto namalował obraz Mona Lisa?", "Michelangelo", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", 1));
    questions.add(new Question("Który kraj jest znany z tańca flamenco?", "Hiszpania", "Włochy", "Francja", "Grecja", 0));
    questions.add(new Question("Który kolor jest mieszanką kolorów czerwonego i niebieskiego?", "Fioletowy", "Zielony", "Pomarańczowy", "Różowy", 0));
    questions.add(new Question("Które zwierzę jest największe na świecie?", "Słoń", "Rekin", "Błękitny wieloryb", "Gepard", 2));
    questions.add(new Question("Który zespół muzyczny nagrał utwór \"Bohemian Rhapsody\"?", "The Beatles", "Queen", "Led Zeppelin", "The Rolling Stones", 1));
    questions.add(new Question("Które miasto jest stolicą Francji?", "Paryż", "Rzym", "Madryt", "Berlin", 0));
    questions.add(new Question("Które państwo jest największym producentem kawy na świecie?", "Brazylia", "Włochy", "Kolumbia", "Etiopia", 0));
    questions.add(new Question("Które morze jest największe na Ziemi?", "Morze Śródziemne", "Morze Czerwone", "Morze Bałtyckie", "Morze Południowochińskie", 3));
    questions.add(new Question("Której postaci literackiej towarzyszy królik zegarowy?", "Hobbitowi", "Dorotce", "Alicji", "Harry'emu Potterowi", 2));
    questions.add(new Question("Która wojna była pierwszą wojną światową?", "Wojna secesyjna", "Wojna trzydziestoletnia", "Wojna krymska", "I wojna światowa", 3));
    questions.add(new Question("Które miasto jest uważane za kolebkę Renesansu?", "Florencja", "Wenecja", "Rzym", "Mediolan", 0));


    }

    public ArrayList<Question> getQuestions()
    {
        return questions;
    }

}
