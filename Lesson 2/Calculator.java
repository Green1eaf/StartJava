class Calculator {
    double firstNumber;
    char sign;
    double secondNumber;
    double result;

    public Calculator(double firstNumber, char sign, double secondNumber) {
        this.firstNumber = firstNumber;
        this.sign = sign;
        this.secondNumber = secondNumber;

        switch(sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result  = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
        }
    }

    public double getResult() {
        return result;
    }
}