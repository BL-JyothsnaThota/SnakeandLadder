package game;
import java.util.Random;
public class Snake_Ladder {

	static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int WIN_POSITION = 100;

    static Random random = new Random();

    
    static int rollDie() {
        return random.nextInt(6) + 1;
    }
    
    static int getOption() {
        return random.nextInt(3);
    }
    
    static int movePlayer(int position, int dieValue, int option) {

        switch (option) {
            case NO_PLAY:
                break;

            case LADDER:
                position += dieValue;
                break;

            case SNAKE:
                position -= dieValue;
                break;
        }

        // Player should not go below 0
        if (position < 0) {
            position = 0;
        }

        // Player must reach exact 100
        if (position > WIN_POSITION) {
            position -= dieValue;
        }

        return position;
    }
	
    static void playSinglePlayerGame() {

        int position = 0;
        int diceCount = 0;

        System.out.println("🎯 Single Player Game Started");

        while (position < WIN_POSITION) {

            int dieValue = rollDie();
            int option = getOption();
            diceCount++;

            int prevPos = position;
            position = movePlayer(position, dieValue, option);

            System.out.println("Rolled: " + dieValue +
                    " | Position: " + prevPos + " -> " + position);
        }

        System.out.println("\n🏆 Player Wins!");
        System.out.println("🎲 Total Dice Rolls: " + diceCount);
    }
    
	public static void main(String[] args) {
		
		playSinglePlayerGame();
	}
	
}
