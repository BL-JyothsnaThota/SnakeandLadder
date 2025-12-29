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
	
	public static void main(String[] args) {
		
	}
	
}
