package src;

import java.util.Random;

public class Match {
    private Player player1;
    private Player player2;
    private Random random;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    private int rollDie() {
        return random.nextInt(6) + 1; // Returns a value between 1 and 6
    }

    public Player fight() {
        Player attacker, defender;
        
        // Determine who attacks first
        if (player1.getHealth() < player2.getHealth()) {
            attacker = player1;
            defender = player2;
        } else {
            attacker = player2;
            defender = player1;
        }

        // Fight until one player dies
        while (player1.isAlive() && player2.isAlive()) {
            executeTurn(attacker, defender);

            // Swap roles for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Return the winner
        return player1.isAlive() ? player1 : player2;
    }

    private void executeTurn(Player attacker, Player defender) {
        int attackRoll = rollDie();
        int defendRoll = rollDie();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;

        int damageDealt = Math.max(0, attackDamage - defendStrength);
        defender.reduceHealth(damageDealt);
    }
}

