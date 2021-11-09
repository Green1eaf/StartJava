class Calculator {
    private double firstNumber;
    private char sign;
    private double secondNumber;

    public Calculator(double firstNumber, char sign, double secondNumber) {
        this.firstNumber = firstNumber;
        this.sign = sign;
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double result = 0;
        switch(sign) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
        }
        return result;
    }
}