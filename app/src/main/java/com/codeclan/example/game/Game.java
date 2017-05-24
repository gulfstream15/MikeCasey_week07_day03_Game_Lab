package com.codeclan.example.game;

import java.util.Random;

/**
 * Created by user on 24/05/2017.
 */


class Game {

    private String userHand;
    private String computerHand;

    private Random randomGenerator = new Random();

    private String[] allChoices = {"rock", "paper", "scissors"};

    public Game() {

    }

    public Game(String userHand) {
        this.userHand = userHand;
        this.computerHand = computerHand;
    }

    public String getUserHand() {
        return this.userHand;
    }

    public String getComputerHand() {
        int index = randomGenerator.nextInt(allChoices.length);
        computerHand = allChoices[index];
        return computerHand;
    }

    public String compareHands(String computerHand, String userHand) {

        if (computerHand == userHand) {
            return "Draw";
        }
        if (computerHand == "rock" && userHand == "scissors") {
            return "Rock wins!";
        } else if (computerHand == "rock" && userHand == "paper") {
            return "Paper wins!";
        } else if (computerHand == "paper" && userHand == "scissors") {
            return "Scissors wins!";
        } else if (computerHand == "paper" && userHand == "rock") {
            return "Paper wins!";
        } else if (computerHand == "scissors" && userHand == "paper") {
            return "Scissors wins!";
        } else if (computerHand == "scissors" && userHand == "rock") {
            return "Rock wins!";
        }
        return null;
    }

}
