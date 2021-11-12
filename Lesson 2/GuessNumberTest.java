public class GuessNumberTest {    
    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        do {
            game.setTargetNumber();
            game.play();
        } while(game.repeatGame());
    }
}