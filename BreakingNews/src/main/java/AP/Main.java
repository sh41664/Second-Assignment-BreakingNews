package AP;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Infrastructure infras = new Infrastructure("7aacfe279e6d4be7bf4abad8154a690c");
        int n;
        infras.displayNewsList();
        ArrayList<News> breakingNews = infras.getNewsList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();
        breakingNews.get(n - 1).displayNews();


    }
}