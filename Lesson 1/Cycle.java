public class Cycle {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int index = 6;
        while (index >= -6) {
            System.out.print(index + " ");
            index -= 2;
        }

        int sum = 0;
        int num = 10;
        do {
            if (num % 2 != 0) {
                sum += num;
            }
            num++;
        } while (num <= 20);
        System.out.println("\n" + sum);
    }
}