package com.bignerdranch.android.buzzfeedquiz;

public class Question {
    private int mTextResId;
    private int mChoicesA;
    private int mChoicesB;
    private int mChoicesC;
    private int mChoicesD;

    public Question(int testResId) {
        mTextResId = testResId;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setChoices(int choicesA, int choicesB, int choicesC, int choicesD) {
        mChoicesA = choicesA;
        mChoicesB = choicesB;
        mChoicesC = choicesC;
        mChoicesD = choicesD;
    }

    public int getChoicesA() {
        return mChoicesA;
    }

    public int getChoicesB() {
        return mChoicesB;
    }

    public int getChoicesC() {
        return mChoicesC;
    }

    public int getChoicesD() {
        return mChoicesD;
    }
}
