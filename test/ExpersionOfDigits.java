package test;
import java.util.Scanner;
public class ExpersionOfDigits {
    public static int evaluateExpression(String expression) {


        if (expression.isEmpty()) {
            return -1;
        }

        int result = 0;
        int currentNumber = 0;
        char currentOperand = '+';

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c==' ')
                continue;
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } else if(currentNumber!=0){
                System.out.println(currentNumber+" "+i);
                result = evaluate(result, currentNumber, currentOperand);
                if (result == -1) {
                    return -1;
                }
                currentNumber = 0;
                currentOperand = c;
            }
            else {
                return -1;
            }
        }
        result = evaluate(result, currentNumber, currentOperand);
        return result;
    }


    private static int evaluate(int result, int currentNumber, char currentOperand) {
        switch (currentOperand) {
            case '+':
                return result + currentNumber;
            case '-':
                return result - currentNumber;
            case '*':
                return result * currentNumber;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      String str= sc.nextLine();
        System.out.println(evaluateExpression(str));
    }
}