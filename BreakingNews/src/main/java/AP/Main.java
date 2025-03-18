package AP;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Infrastructure infras = new Infrastructure("7aacfe279e6d4be7bf4abad8154a690c");
        infras.displayNewsList();
        ArrayList<News> breakingNews = infras.getNewsList();

        Scanner input = new Scanner(System.in);
        int n;
        boolean validInput = false;

        while (!validInput) {
            try {

                System.out.print("Enter a number (1 to " + breakingNews.size() + "): ");
                n = input.nextInt();

                if (n < 1 || n > breakingNews.size()) {
                    System.out.println("Invalid input. Please enter a number between 1 and " + breakingNews.size());
                } else {
                    validInput = true;
                    breakingNews.get(n - 1).DisplayNews();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Clear invalid input
            }
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
