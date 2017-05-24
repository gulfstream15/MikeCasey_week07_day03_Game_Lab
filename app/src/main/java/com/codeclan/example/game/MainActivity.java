package com.codeclan.example.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textInstruction;
    TextView textComputerHand;
    TextView textWinner;
    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInstruction = (TextView)findViewById(R.id.makeChoice);
        textComputerHand = (TextView) findViewById(R.id.computerChoice);
        textWinner = (TextView) findViewById(R.id.winner);

        buttonRock = (Button) findViewById(R.id.buttonRock);
        buttonPaper = (Button) findViewById(R.id.buttonPaper);
        buttonScissors = (Button) findViewById(R.id.buttonScissors);

    }

    public void onUserRockButtonClick(View view) {
        Game game = new Game("rock");
        String userChoice = game.getUserHand();
        String computerChoice = game.getComputerHand();
        String winner = game.compareHands(computerChoice, userChoice);
        textComputerHand.setText("Computer choice: " + computerChoice);
        textWinner.setText(winner);
    }

    public void onUserPaperButtonClick(View view) {
        Game game = new Game("paper");
        String userChoice = game.getUserHand();
        String computerChoice = game.getComputerHand();
        String winner = game.compareHands(computerChoice, userChoice);
        textComputerHand.setText("Computer choice: " + computerChoice);
        textWinner.setText(winner);
    }

    public void onUserScissorsButtonClick(View view) {
        Game game = new Game("scissors");
        String userChoice = game.getUserHand();
        String computerChoice = game.getComputerHand();
        String winner = game.compareHands(computerChoice, userChoice);
        textComputerHand.setText("Computer choice: " + computerChoice);
        textWinner.setText(winner);
    }


}
