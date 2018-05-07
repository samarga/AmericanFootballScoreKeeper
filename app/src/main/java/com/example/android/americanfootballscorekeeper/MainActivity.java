package com.example.android.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Set initial scores for both teams to 0
    int scoreAwayTeam = 0;
    int scoreHomeTeam = 0;

    // Set point values for different ways to score in American Football
    int fieldGoalPts = 3;
    int touchdownPts = 6;
    int extraPointAttemptPts = 1;
    int twoPointConversionPt = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for a specified team.
     */
    public void displayScore(View view, int score) {

        TextView scoreView = null;

        if (getResources().getResourceName(view.getId()).contains("away"))
        {
            // Display score for away team
            scoreView = (TextView) findViewById(R.id.textview_awayTeamScore);
        }

         else if (getResources().getResourceName(view.getId()).contains("home")) {
                // Display score for home team
               scoreView = (TextView) findViewById(R.id.textview_homeTeamScore);
        }

        scoreView.setText(String.valueOf(score));

    }



    // This method is called when the Touchdown buttons are clicked.

    public void touchdown(View view) {

        // Touchdowns are 6 points.
        int score = 0;

        switch(view.getId())
        {
            case R.id.button_awayTeamTouchdown:
                // New score for away team
                scoreAwayTeam = scoreAwayTeam + touchdownPts;
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamTouchdown:
                // New score for home team
                scoreHomeTeam = scoreHomeTeam + touchdownPts;
                score = scoreHomeTeam;
                break;

            default:
                System.out.println("Touchdown Error");

        }
        displayScore(view, score);
    }

    /**
     * This method is called when the Field Goal buttons are clicked.
     */
    public void fieldGoal(View view) {
        // Field goals are 3 points.
        int score = 0;

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

            default:
                System.out.println("Field Goal Error");

        }
        displayScore(view, score);

    }

    /**
     * This method is called when the Extra Point Attempt buttons are clicked.
     */
    public void extraPointAttempt(View view) {

        // Extra Point Attempt is 1 point.
        int score = 0;

        switch(view.getId())
        {
            case R.id.button_awayTeamExtraPointAttempt:
                // New score for away team
                scoreAwayTeam = scoreAwayTeam + extraPointAttemptPts;
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamExtraPointAttempt:
                // New score for home team
                scoreHomeTeam = scoreHomeTeam + extraPointAttemptPts;
                score = scoreHomeTeam;
                break;

            default:
                System.out.println("Extra Point Attempt Error");

        }
        displayScore(view, score);
    }

    /**
     * This method is called when the 2 Point Conversion buttons are clicked.
     */
    public void twoPointConversion(View view) {

        // 2 Point Conversion is 2 points.
        int score = 0;

        switch(view.getId())
        {
            case R.id.button_awayTeamTwoPointConversion:
                // New score for away team
                scoreAwayTeam = scoreAwayTeam + twoPointConversionPt;
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamTwoPointConversion:
                // New score for home team
                scoreHomeTeam = scoreHomeTeam + twoPointConversionPt;
                score = scoreHomeTeam;
                break;

            default:
                System.out.println("2 Point Conversion Error");

        }
        displayScore(view, score);
    }



    /**
     * This method is called when the Reset Score button are clicked.
     * Resets all scores to 0 for all teams.
     */
    public void resetScore(View view) {

        scoreAwayTeam = 0;
        scoreHomeTeam = 0;


        // Display score for away team
        TextView scoreView = (TextView) findViewById(R.id.textview_awayTeamScore);
        scoreView.setText(String.valueOf(scoreAwayTeam));

        // Display score for home team
        scoreView = (TextView) findViewById(R.id.textview_homeTeamScore);
        scoreView.setText(String.valueOf(scoreHomeTeam));

    }
}
