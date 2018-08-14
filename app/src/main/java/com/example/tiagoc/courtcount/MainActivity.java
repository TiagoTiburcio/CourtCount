package com.example.tiagoc.courtcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scoreTeamA, scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = findViewById(R.id.score_a_text_view);
        scoreTeamB = findViewById(R.id.score_b_text_view);
    }

    private void sumScoreA(int points) {
        int scoreA = Integer.valueOf(scoreTeamA.getText().toString()) + points;
        scoreTeamA.setText(String.valueOf(scoreA));
    }

    public void sum3PointsA(View view) {
        this.sumScoreA(3);
    }

    public void sum2PointsA(View view) {
        this.sumScoreA(2);
    }

    public void sum1PointsA(View view) {
        this.sumScoreA(1);
    }

    private void sumScoreB(int points) {
        int scoreB = Integer.valueOf(scoreTeamB.getText().toString()) + points;
        scoreTeamB.setText(String.valueOf(scoreB));
    }

    public void sum3PointsB(View view) {
        this.sumScoreB(3);
    }

    public void sum2PointsB(View view) {
        this.sumScoreB(2);
    }

    public void sum1PointsB(View view) {
        this.sumScoreB(1);
    }

    public void resetScore(View view) {
        scoreTeamA.setText(String.valueOf(0));
        scoreTeamB.setText(String.valueOf(0));
    }
}
