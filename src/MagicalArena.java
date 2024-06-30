package src;

public class MagicalArena {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Match match = new Match(playerA, playerB);
        Player winner = match.fight();

        System.out.println("Winner: " + (winner == playerA ? "Player A" : "Player B"));
        System.out.println("Player A Health: " + playerA.getHealth());
        System.out.println("Player B Health: " + playerB.getHealth());
    }
}

