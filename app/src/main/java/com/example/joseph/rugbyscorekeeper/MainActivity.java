package com.example.joseph.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void showTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void tryA(View view) {
        teamAPoints = teamAPoints + 5;
        showTeamAScore(teamAPoints);
    }

    public void penaltyA(View view) {
        teamAPoints = teamAPoints + 3;
        showTeamAScore(teamAPoints);
    }

    public void convA(View view) {
        teamAPoints = teamAPoints + 2;
        showTeamAScore(teamAPoints);
    }

    public void tryB(View view) {
        teamBPoints = teamBPoints + 5;
        showTeamBScore(teamBPoints);
    }

    public void penaltyB(View view) {
        teamBPoints = teamBPoints + 3;
        showTeamBScore(teamBPoints);
    }

    public void convB(View view) {
        teamBPoints = teamBPoints + 2;
        showTeamBScore(teamBPoints);
    }

    public void resetScore(View view) {
        teamAPoints = 0;
        teamBPoints = 0;
        showTeamAScore(teamAPoints);
        showTeamBScore(teamBPoints);
    }
}
