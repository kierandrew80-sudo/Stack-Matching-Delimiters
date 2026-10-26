import java.util.Scanner;
import java.util.Stack;

/*
Description: Checks whether delimiters are properly matched.

Programmed by: Kier Andrew R. Costumban, BSIT, 48079, DSA
Last Modified: October 26, 2026
Version: 1.0
Acknowledgements: OpenAI ChatGPT was used for code drafting
and explanation.
*/

public class matchingdelimiters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence: ");
        String sequence = input.nextLine();

        Stack<Character> stack = new Stack<Character>();
        boolean valid = true;
        String reason = "";

        for (int i = 0; i < sequence.length(); i++) {

            char current = sequence.charAt(i);

            // Push opening delimiters
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            }

            // Check closing delimiters
            else if (current == ')' || current == ']' || current == '}') {

                if (stack.isEmpty()) {
                    valid = false;
                    reason = "closing delimiter has no matching opening delimiter: "
                            + current;
                    break;
                }

                char top = stack.peek();

                boolean matches =
                        (current == ')' && top == '(') ||
                        (current == ']' && top == '[') ||
                        (current == '}' && top == '{');

                if (matches) {
                    stack.pop();
                } else {
                    valid = false;
                    reason = "mismatched delimiters: "
                            + top + " does not match " + current;
                    break;
                }
            }
        }

        // Check for unmatched opening delimiters
        if (valid && !stack.isEmpty()) {
            valid = false;
            reason = "unmatched opening delimiter remains: " + stack;
        }

        // Display the final result
        if (valid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid: " + reason);
        }

        input.close();
    }
}
