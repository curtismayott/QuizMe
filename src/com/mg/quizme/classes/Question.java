package com.mg.quizme.classes;

public class Question {
    String question;
    String answer;
    boolean correctAnswer;

    public Question(){
        this.question = "";
        this.answer = "";
        this.correctAnswer = false;
    }
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.correctAnswer = false;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }
}
