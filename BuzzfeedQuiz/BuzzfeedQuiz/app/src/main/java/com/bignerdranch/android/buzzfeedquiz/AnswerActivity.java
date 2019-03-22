package com.bignerdranch.android.buzzfeedquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private static final String EXTRA_SCORE = "com.bignerdranch.android.quizactivity - the score";

    private int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        extractDataFromIntent();
        putAnswer();
        setupRestartButton();
    }

    private void putAnswer() {
        TextView mAnswerTextView = (TextView) findViewById(R.id.answer_text_view);
        mAnswerTextView.setText(mResultBank[score-5].getResult());
    }

    private void extractDataFromIntent() {
        Intent intent = getIntent();
        score = intent.getIntExtra(EXTRA_SCORE, 0);
    }

    private void setupRestartButton()
    {
        Button mRestart = (Button) findViewById(R.id.restart_button);
        mRestart.setText(R.string.restart_button);
        mRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public static Intent makeIntent (Context context, int score)
    {
        Intent intent = new Intent(context, AnswerActivity.class);
        intent.putExtra(EXTRA_SCORE, score);
        return intent;
    }

    private Result[] mResultBank = new Result[]{
            new Result(R.string.answer1),
            new Result(R.string.answer2),
            new Result(R.string.answer3),
            new Result(R.string.answer4),
            new Result(R.string.answer5),
            new Result(R.string.answer6),
            new Result(R.string.answer7),
            new Result(R.string.answer8),
            new Result(R.string.answer9),
            new Result(R.string.answer10),
            new Result(R.string.answer11),
            new Result(R.string.answer12),
            new Result(R.string.answer13),
            new Result(R.string.answer14),
            new Result(R.string.answer15),
            new Result(R.string.answer16),
    };
}
