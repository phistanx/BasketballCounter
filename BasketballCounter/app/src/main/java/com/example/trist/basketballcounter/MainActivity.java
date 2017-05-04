package com.example.trist.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_counter_team_A);
        scoreView.setText(String.valueOf(score));
    }

    int scoreA = 0;
    public void threePointsA(View view){
        scoreA = scoreA + 3;
        displayTeamA(scoreA);
    }

    public void twoPointsA(View view){
        scoreA = scoreA + 2;
        displayTeamA(scoreA);
    }

    public void freeThrowA(View view){
        scoreA = ++scoreA;
        displayTeamA(scoreA);
    }

    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_counter_team_B);
        scoreView.setText(String.valueOf(score));
    }

    int scoreB = 0;
    public void threePointsB(View view){
        scoreB = scoreB + 3;
        displayTeamB(scoreB);
    }

    public void twoPointsB(View view){
        scoreB = scoreB + 2;
        displayTeamB(scoreB);
    }

    public void freeThrowB(View view){
        scoreB = ++scoreB;
        displayTeamB(scoreB);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayTeamA(scoreA);
        displayTeamB(scoreB);
    }
}
