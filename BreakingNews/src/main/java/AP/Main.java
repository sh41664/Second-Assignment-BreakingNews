package AP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Infrastructure infras = new Infrastructure("7aacfe279e6d4be7bf4abad8154a690c");
        int n;
        infras.displayNewsList();
        ArrayList<News> breakingNews = infras.getNewsList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();
        // todo: you should handle if user input is not valid and ask for another one
        breakingNews.get(n - 1).displayNews();
    }
}