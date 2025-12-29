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
	
	public static void main(String[] args) {
		
	}
	
}
