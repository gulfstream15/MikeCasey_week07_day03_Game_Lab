package com.codeclan.example.game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/05/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game("scissors");
    }

   @Test
   public void canGetUserHand() {
       game = new Game("scissors");
       assertEquals("scissors", game.getUserHand());
   }

   @Test
   public void canGetComputerHand() {
       game = new Game("scissors");
       assertEquals("rock", game.getComputerHand());
   }

   @Test
   public void canCompareHands() {
       game = new Game("scissors");
       String compHand = game.getComputerHand();
       assertEquals("Draw", game.compareHands(compHand, "scissors"));
   }
}
