
# Stack - Matching Delimiters

## Description
This project is a Java program that uses a stack to check whether delimiters are properly matched and nested.

## Objectives
- Understand the LIFO (Last-In, First-Out) principle.
- Learn stack operations such as push, peek, pop, and isEmpty.
- Check if parentheses, brackets, and braces are correctly matched.
- Identify valid and invalid delimiter sequences.
- Display the stack execution trace.

## Technologies Used
- Java
- JCreator
- Stack Data Structure

## Supported Delimiters
- Parentheses: ()
- Brackets: []
- Braces: {}

## Sample Test Cases

| Input | Expected Result |
|---|---|
| () | Valid |
| ()[]{} | Valid |
| {[()]} | Valid |
| ({[]}) | Valid |
| {[(])} | Invalid |
| ([)] | Invalid |
| {[()] | Invalid |
| {[()]}] | Invalid |
| Empty input | Valid |
| ((a+b)*[c-d]) | Valid |

## Stack Operations
- **Push:** Adds an opening delimiter to the stack.
- **Peek:** Checks the top element without removing it.
- **Pop:** Removes a matching opening delimiter.
- **isEmpty:** Checks whether the stack is empty.

## How to Run
1. Open DelimiterCheckerTrace.java in JCreator.
2. Compile the Java file.
3. Run the program.
4. Enter a sequence of characters.
5. Check the result displayed by the program.

## Project Files
- DelimiterCheckerTrace.java - Java source code.
- README.md - Project documentation.
- screenshots/ - Screenshots of the source code and program outputs.

## Author
Name: Kier Andrew R. Costumban
Course: BSIT
Subject: DSA

## Acknowledgement
ChatGPT by OpenAI assisted with code drafting and explanations. The student is responsible for reviewing, testing, and understanding the program.
