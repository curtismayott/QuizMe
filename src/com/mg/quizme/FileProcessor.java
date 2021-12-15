package com.mg.quizme;

import com.mg.quizme.classes.Question;
import com.mg.quizme.classes.Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

    public Quiz processFile(String fileName) throws FileNotFoundException {
        Quiz quiz = new Quiz();
        Scanner scanner = new Scanner(new File(fileName));
        if(scanner != null) {
            while (scanner.hasNextLine()) {
                quiz.addQuestion(parseQuestion(scanner.nextLine()));
            }
        }
        return quiz;
    }

    public Question parseQuestion(String line){
        Question q = new Question();
        q.setQuestion(line.split(",")[0]);
        q.setAnswer(line.split(",")[1]);
        return q;
    }
}
