package com.techelevator.dao;

import com.techelevator.model.Question;

import java.util.List;

public interface QuestionDAO {
    List<Question> getAllQuestions();
    Question getRandomQuestion();
    boolean updateQuestion(Question q, int id);
    boolean deleteQuestion(int id);
    Question createQuestion(Question question);

    List<Question> filter(String title, String question);
}
