
import java.util.Scanner;
import java.util.Stack;

/*
Description: Checks whether delimiters are properly matched using a stack.

Programmed by: Your Name [BSIT] [Your CN] [Your Subject]
Last Modified: October 26, 2026

Version: 1.1

Acknowledgements:
OpenAI ChatGPT assisted with code drafting and explanations.
Prompt: Help me complete the Stack - Matching Delimiters activity.
*/

public class delimitercheckertrace {

    // Checks whether a character is an opening delimiter
    static boolean isOpening(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    // Checks whether a character is a closing delimiter
    static boolean isClosing(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    // Checks whether the opening and closing delimiters match
    static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    // Displays the current contents of the stack
    static String show(Stack<Character> s) {
        if (s.isEmpty()) {
            return "empty";
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sequence: ");
        String input = sc.nextLine();

        System.out.println("\n--- STACK EXECUTION TRACE ---");

        Stack<Character> stack = new Stack<Character>();

        boolean valid = true;
        String reason = "";

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            // Process opening delimiters
            if (isOpening(c)) {

                stack.push(c);

                System.out.println("\nRead: " + c);
                System.out.println("Operation: PUSH " + c);
                System.out.println("Stack: " + show(stack));
            }

            // Process closing delimiters
            else if (isClosing(c)) {

                System.out.println("\nRead: " + c);

                if (stack.isEmpty()) {

                    valid = false;
                    reason =
                        "Closing delimiter has no matching opening delimiter: "
                        + c;

                    System.out.println("Operation: isEmpty = true");
                    System.out.println("Invalid: " + reason);
                    System.out.println("Stack: " + show(stack));

                    break;
                }

                char top = stack.peek();

                System.out.println("Operation: PEEK " + top);

                if (!matches(top, c)) {

                    valid = false;
                    reason = "Mismatched delimiters: "
                            + top + " does not match " + c;

                    System.out.println("Invalid: " + reason);
                    System.out.println("Stack: " + show(stack));

                    break;
                }

                stack.pop();

                System.out.println("Operation: POP " + top);
                System.out.println("Stack: " + show(stack));
            }
        }

        // Check whether unmatched opening delimiters remain
        if (valid && !stack.isEmpty()) {

            valid = false;
            reason = "Unmatched opening delimiter remains: "
                    + show(stack);
        }

        // Display the final result
        System.out.println("\n--- FINAL RESULT ---");

        if (valid) {
            System.out.println("Valid: stack is empty after processing.");
        } else {
            System.out.println("Invalid: " + reason);
        }

        sc.close();
    }
}
