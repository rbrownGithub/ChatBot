package org.example;
import java.util.Scanner;

public class ChatBot {
    private static Scanner scanner = new Scanner(System.in);
    private static String userName;
    private static int userAge;

    public static void main(String[] args) {
        greetUser();
        askAndRepeatName();
        guessAge();
        countToNumber();
        testProgrammingKnowledge();
        tellUserStory();
    }

    public static void greetUser() {
        System.out.println("Hello! I'm your friendly chat bot. Nice to meet you!");
    }

    public static void askAndRepeatName() {
        System.out.print("What's your name? ");
        userName = scanner.nextLine();
        System.out.println("Nice to meet you, " + userName + "!");
    }

    public static void guessAge() {
        System.out.print("What year were you born? ");
        int birthYear = scanner.nextInt();
        userAge = 2024 - birthYear;
        System.out.println("Based on that, I guess you're " + userAge + " years old!");
    }

    public static void countToNumber() {
        System.out.print("Give me a number, and I'll count to it: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void testProgrammingKnowledge() {
        String question = "What is the correct way to declare a variable in Java?";
        String[] options = {
                "1. variable x = 5;",
                "2. int x = 5;",
                "3. x = 5;",
                "4. declare x = 5;"
        };
        int correctAnswer = 2;

        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }

        int userAnswer;
        do {
            System.out.print("Enter your answer (1-4): ");
            userAnswer = scanner.nextInt();
            if (userAnswer != correctAnswer) {
                System.out.println("That's not correct. Try again!");
            }
        } while (userAnswer != correctAnswer);

        System.out.println("Correct! Well done.");
    }

    public static void tellUserStory() {
        System.out.println("Based on what I know about you, " + userName + ", here's a little story:");
        System.out.println("Once upon a time, there was a " + userAge + "-year-old programmer named " + userName + ".");
        System.out.println("He was known for excellent coding skills and the ability to count to any number.");
        System.out.println("One day, " + userName + " answered a tricky Java question correctly, impressing all fellow programmers.");
        System.out.println("From that day on, " + userName + " was known as the Java Master in the community.");
    }
}
