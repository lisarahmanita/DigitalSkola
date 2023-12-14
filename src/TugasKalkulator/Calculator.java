package TugasKalkulator;

public class Calculator {
    private float number1, number2;
    private char operator;

    public Calculator(float number1, float number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public float calculate(){
        float result = 0;
        switch (operator){
            case '+' :
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' :
                result = number1 * number2;
                break;
            case '/' :
                result = number1 / number2;
                break;
            case '%' :
                result = number1 % number2;
                break;
            default:
                System.out.println("Invalid operator.\nPlease enter the correct operator !!");
                break;
        }
        return result;
    }
}
