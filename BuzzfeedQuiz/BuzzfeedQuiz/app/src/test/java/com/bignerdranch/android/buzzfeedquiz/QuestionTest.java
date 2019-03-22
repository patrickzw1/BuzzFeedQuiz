package com.bignerdranch.android.buzzfeedquiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    private Question question = new Question(0);

    @Test
    public void getTextResId() {
        question.setTextResId(1);
        assertEquals(1, question.getTextResId());
    }

    @Test
    public void setTextResId() {
        question.setTextResId(12);
        assertEquals(12, question.getTextResId());
    }

    @Test
    public void setChoices() {
        question.setChoices(1, 0, 1, 0);
        assertEquals(1, question.getChoicesA());
        assertEquals(0, question.getChoicesB());
        assertEquals(1, question.getChoicesC());
        assertEquals(0, question.getChoicesD());
    }

    @Test
    public void getChoicesA() {
        question.setChoices(0, 0, 1, 0);
        assertEquals(0, question.getChoicesA());
    }

    @Test
    public void getChoicesB() {
        question.setChoices(1, 1, 1, 0);
        assertEquals(1, question.getChoicesB());
    }

    @Test
    public void getChoicesC() {
        question.setChoices(1, 0, 0, 0);
        assertEquals(0, question.getChoicesC());
    }

    @Test
    public void getChoicesD() {
        question.setChoices(1, 0, 1, 1);
        assertEquals(1, question.getChoicesD());
    }
}