package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int THREE_POINTS = 3;
    final int TWO_POINTS = 2;
    final int FREE_THROW = 1;
    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsForTeamA(View view) {
        scoreTeamA += THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsForTeamA(View view) {
        scoreTeamA += TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void addOnePointForTeamA(View view) {
        scoreTeamA += FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

}
