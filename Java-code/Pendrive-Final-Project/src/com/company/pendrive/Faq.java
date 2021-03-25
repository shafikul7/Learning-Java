package com.company.pendrive;

import java.util.UUID;

public class Faq {
    private final String id;
    public int Length;
    private  String question;
    private  String answer;

    public Faq(String question, String answer) {
        this.id = UUID.randomUUID().toString();
        this.question = question;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Faq{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
