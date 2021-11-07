public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Угадай число!");
        int targetNumber = (int) (Math.random() * 101);
        int playerNumber = 50;
        int leftBound = 0;
        int rightBound = 100;

        while(targetNumber != playerNumber) {
            System.out.println(playerNumber);
            if (targetNumber < playerNumber) {
                rightBound = playerNumber;
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                leftBound = playerNumber;
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            playerNumber = leftBound + (rightBound - leftBound) / 2;
        }
        System.out.println(targetNumber + "\nПоздравляю, число угадано!");
    }
}