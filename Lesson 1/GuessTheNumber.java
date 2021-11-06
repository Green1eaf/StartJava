public class GuessTheNumber {

    public static void main(String[] args) {
        System.out.println("Угадай число!");
        int number = (int) (Math.random() * 101);
        int playersNumber = 50;
        int leftBound = 0;
        int rightBound = 100;

        while(number != playersNumber) {
            System.out.println(playersNumber);
            if (number < playersNumber) {
                rightBound = playersNumber;
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                leftBound = playersNumber;
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            playersNumber = leftBound + (rightBound - leftBound) / 2;
        }
        System.out.println(number + "\nПоздравляю, число угадано!");
    }
}