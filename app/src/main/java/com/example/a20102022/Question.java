package com.example.a20102022;

import java.util.ArrayList;

public class Question {
    private String content;
    private int imageId;
    private ArrayList<String> answers;
    private int answer;
    private String help;

    public Question(String content, int imageId, ArrayList<String> answers, int answer, String help) {
        this.content = content;
        this.imageId = imageId;
        this.answers = answers;
        this.answer = answer;
        this.help = help;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }
}
