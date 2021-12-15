package com.mg.quizme;

import com.mg.quizme.classes.Quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {
    public static Quiz quiz;
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        try {
            quiz = processor.processFile("C:\\Users\\Curtis MG\\IdeaProjects\\QuizMe\\src\\com\\mg\\quizme\\sourcefiles\\quiz.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String userAnswer = "";
            for(int i = 0; i < quiz.getQuestions().size(); i++) {
                System.out.print(quiz.getQuestion(i).getQuestion() + " ");
                userAnswer = br.readLine();
                if(userAnswer.toLowerCase().equals(quiz.getQuestion(i).getAnswer().toLowerCase())){
                    System.out.println("Correct!");
                    quiz.getQuestion(i).setCorrectAnswer(true);
                }else{
                    System.out.println("Incorrect..");
                    quiz.getQuestion(i).setCorrectAnswer(false);
                }
            }
            System.out.println("You got " + quiz.getCorrectAnswerCount() + " out of " + quiz.getQuestions().size());

            double correct = quiz.getCorrectAnswerCount();
            double total = quiz.getQuestions().size();
            int percentage = (int) (correct / total * 100);
            System.out.println("Which is " + percentage + "%");
        } catch (Exception e) {
            System.out.println("There was an error opening the file!");
            System.out.println(e.getMessage());
        }
    }
}
