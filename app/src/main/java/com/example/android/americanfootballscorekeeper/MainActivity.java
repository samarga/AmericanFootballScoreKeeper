package com.example.android.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Set initial scores for both teams to 0
    private int scoreAwayTeam = 0;
    private int scoreHomeTeam = 0;
    private int score = 0;

    // CONSTANTS Set point values for different ways to score in American Football
    private static final int FIELD_GOAL_PTS = 3;
    private static final int TOUCHDOWN_PTS = 6;
    private static final int EXTRA_POINT_ATTEMPT_PT = 1;
    private static final int TWO_POINT_CONVERSION_PTS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Displays the given score for a specified team.

    public void displayScore(View view, int score) {

        TextView scoreView = null;

        if (getResources().getResourceName(view.getId()).contains("away")) {
            scoreView = (TextView) findViewById(R.id.textview_awayTeamScore); // Display score for away team
        }

         else if (getResources().getResourceName(view.getId()).contains("home")) {
               scoreView = (TextView) findViewById(R.id.textview_homeTeamScore); // Display score for home team
        }

        scoreView.setText(String.valueOf(score));

    }



    // This method is called when the Touchdown buttons are clicked. Touchdowns are 6 points.

    public void touchdown(View view) {
        switch(view.getId()) {
            case R.id.button_awayTeamTouchdown:
                scoreAwayTeam += TOUCHDOWN_PTS; // New score for away team
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamTouchdown:
                scoreHomeTeam += TOUCHDOWN_PTS; // New score for home team
                score = scoreHomeTeam;
                break;

            default:
                System.out.println("Touchdown Error");

        }
        displayScore(view, score);
    }


    // This method is called when the Field Goal buttons are clicked. Field goals are 3 points.

    public void fieldGoal(View view) {
        switch(view.getId()) {
            case R.id.button_awayTeamFieldGoal:
                scoreAwayTeam += FIELD_GOAL_PTS; // New score for away team
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamFieldGoal:
                scoreHomeTeam += FIELD_GOAL_PTS; // New score for home team
                score = scoreHomeTeam;
                break;

            default:
                System.out.println("Field Goal Error");

        }
        displayScore(view, score);

    }

    // This method is called when the Extra Point Attempt buttons are clicked. Extra Point Attempt is 1 point.
    public void extraPointAttempt(View view) {
        switch(view.getId()) {
            case R.id.button_awayTeamExtraPointAttempt:
                scoreAwayTeam += EXTRA_POINT_ATTEMPT_PT; // New score for away team
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamExtraPointAttempt:
                scoreHomeTeam += EXTRA_POINT_ATTEMPT_PT; // New score for home team
                score = scoreHomeTeam;
                break;

            default:
                System.out.println("Extra Point Attempt Error");

        }
        displayScore(view, score);
    }

    //This method is called when the 2 Point Conversion buttons are clicked. 2 Point Conversion is 2 points.
    public void twoPointConversion(View view) {
        switch(view.getId()) {
            case R.id.button_awayTeamTwoPointConversion:
                scoreAwayTeam += TWO_POINT_CONVERSION_PTS; // New score for away team
                score = scoreAwayTeam;
                break;

            case R.id.button_homeTeamTwoPointConversion:
                scoreHomeTeam += TWO_POINT_CONVERSION_PTS; // New score for home team
                score = scoreHomeTeam;
                break;

            default:
                System.out.println("2 Point Conversion Error");

        }
        displayScore(view, score);
    }


    //This method is called when the Reset Score button are clicked. Resets all scores to 0 for all teams.
    public void resetScore(View view) {
        scoreAwayTeam = 0;
        scoreHomeTeam = 0;

        TextView scoreView = (TextView) findViewById(R.id.textview_awayTeamScore);
        scoreView.setText(String.valueOf(scoreAwayTeam)); // Display score for away team

        scoreView = (TextView) findViewById(R.id.textview_homeTeamScore);
        scoreView.setText(String.valueOf(scoreHomeTeam)); // Display score for home team

    }
}
