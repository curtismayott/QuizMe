package com.mg.quizme.classes;

import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> questions;

    public Quiz(){
        questions = new ArrayList<Question>();
    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public Question getQuestion(int index){
        return this.questions.get(index);
    }

    public ArrayList<Question> getQuestions(){
        return this.questions;
    }

    public int getCorrectAnswerCount(){
        int correctAnswerCount = 0;
        for(int i = 0; i < questions.size(); i++){
            if(questions.get(i).isCorrectAnswer()){
                correctAnswerCount++;
            }
        }
        return correctAnswerCount;
    }
}
