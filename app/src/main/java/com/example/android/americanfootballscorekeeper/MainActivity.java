package com.example.android.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Set initial scores for both teams to 0
    int scoreAwayTeam = 0;
    int scoreHomeTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScore(View view, int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Field Goal buttons are clicked.
     */
    public void fieldGoal(View view) {
    // Field goals are 3 points.
        int fieldGoalPts = 3;
        int score;

        switch(view.getId())
        {
            case R.id.button_awayTeamFieldGoal:
                // New score for away team
                scoreAwayTeam = scoreAwayTeam + fieldGoalPts;
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamFieldGoal:
                // New score for home team
                scoreHomeTeam = scoreHomeTeam + fieldGoalPts;
                score = scoreHomeTeam;
                break;

        }
        displayScore(view, score);

    }
}
