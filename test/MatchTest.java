package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatchTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(100, 10, 5);
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
    }

    @Test
    public void testPlayerHealthReduction() {
        Player player = new Player(100, 10, 5);
        player.reduceHealth(30);
        assertEquals(70, player.getHealth());
        player.reduceHealth(80);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testMatchOutcome() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Match match = new Match(playerA, playerB);
        Player winner = match.fight();

        assertTrue(winner.isAlive());
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}

