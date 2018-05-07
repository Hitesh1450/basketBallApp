package com.example.gandhi.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View view){

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void addFreeThrowForTeamA(View view){

        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View view){
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }
    public void addFreeThrowForTeamB(View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }
    /*
    Reset the score to zero
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /*
    Tell the user who wins
     */
    public void gameOver(View view){
        if (scoreTeamA>scoreTeamB){
            Toast.makeText(this, "Team A wins the match and score is " +scoreTeamA+ " points", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Team B wins the match and score is " +scoreTeamB+ "points",Toast.LENGTH_LONG).show();
        }
    }
}
