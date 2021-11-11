public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    int targetNumber;

    public GuessNumber(String firstPlayerName, String secondPlayerName) {
        firstPlayer = new Player(firstPlayerName);
        secondPlayer = new Player(secondPlayerName);
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void setTargetNumber() {
        targetNumber = (int) (Math.random() * 101);
    }

    public boolean isWin(int number) {
        if (targetNumber < number) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (targetNumber > number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (targetNumber == number) {
            return true;
        }
        return false;
    }
}