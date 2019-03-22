package com.bignerdranch.android.buzzfeedquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private TextView mQuestionTextView;
    private Button mButtonChoiceA;
    private Button mButtonChoiceB;
    private Button mButtonChoiceC;
    private Button mButtonChoiceD;
    private int score = 0;
    private int mQuestionNumber = 0;
    private String mAnswerA;
    private String mAnswerB;
    private String mAnswerC;
    private String mAnswerD;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
        mButtonChoiceA = (Button) findViewById(R.id.choiceA);
        mButtonChoiceB = (Button) findViewById(R.id.choiceB);
        mButtonChoiceC = (Button) findViewById(R.id.choiceC);
        mButtonChoiceD = (Button) findViewById(R.id.choiceD);

        setupQuestionChoices();
        updateQuestion();

        mButtonChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score + 1;
                mQuestionNumber = (mQuestionNumber + 1) % mQuestionBank.length;
                updateQuestion();
                count++;
                setupAnswerActivity();
            }
        });

        mButtonChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score + 2;
                mQuestionNumber = (mQuestionNumber + 1) % mQuestionBank.length;
                updateQuestion();
                count++;
                setupAnswerActivity();
            }
        });

        mButtonChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score + 3;
                mQuestionNumber = (mQuestionNumber + 1) % mQuestionBank.length;
                updateQuestion();
                count++;
                setupAnswerActivity();
            }
        });

        mButtonChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score + 4;
                mQuestionNumber = (mQuestionNumber + 1) % mQuestionBank.length;
                updateQuestion();
                count++;
                setupAnswerActivity();
            }
        });
    }

    private void setupAnswerActivity ()
    {
        if (count == 5)
        {
            Intent intent = AnswerActivity.makeIntent (QuizActivity.this, score);
            startActivity(intent);
            score = 0;
            count = 0;
        }
    }

    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_one),
            new Question(R.string.question_two),
            new Question(R.string.question_three),
            new Question(R.string.question_four),
            new Question(R.string.question_five),
    };

    private void setupQuestionChoices()
    {
        mQuestionBank[0].setChoices(R.string.choice1A, R.string.choice1B, R.string.choice1C, R.string.choice1D);
        mQuestionBank[1].setChoices(R.string.choice2A, R.string.choice2B, R.string.choice2C, R.string.choice2D);
        mQuestionBank[2].setChoices(R.string.choice3A, R.string.choice3B, R.string.choice3C, R.string.choice3D);
        mQuestionBank[3].setChoices(R.string.choice4A, R.string.choice4B, R.string.choice4C, R.string.choice4D);
        mQuestionBank[4].setChoices(R.string.choice5A, R.string.choice5B, R.string.choice5C, R.string.choice5D);
    }

    private void updateQuestion()
    {
        mQuestionTextView.setText(mQuestionBank[mQuestionNumber].getTextResId());
        mButtonChoiceA.setText(mQuestionBank[mQuestionNumber].getChoicesA());
        mButtonChoiceB.setText(mQuestionBank[mQuestionNumber].getChoicesB());
        mButtonChoiceC.setText(mQuestionBank[mQuestionNumber].getChoicesC());
        mButtonChoiceD.setText(mQuestionBank[mQuestionNumber].getChoicesD());
    }
}

