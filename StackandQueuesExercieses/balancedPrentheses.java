package JavaAdvanced.DefiningClasesExercises.StackandQueuesExercieses;

import java.util.ArrayDeque;
import java.util.Scanner;

public class balancedPrentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> brackets = new ArrayDeque<>();
        boolean isBalanced = false;

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if(currentChar == '(' || currentChar == '[' || currentChar == '{') {
                brackets.push(currentChar);
            } else if( currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if(brackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char currentBrackets = brackets.pop();

                if(currentBrackets == '(' && currentChar == ')' ) {
                    isBalanced = true;
                } else if( currentBrackets == '{' && currentChar == '}'){
                    isBalanced = true;
                } else if(currentBrackets == '[' && currentChar == ']') {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if(isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
