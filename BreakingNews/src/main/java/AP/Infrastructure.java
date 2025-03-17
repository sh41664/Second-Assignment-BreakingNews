package AP;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class Infrastructure {
    private final String URL;
    private final String APIKEY;
    private final String JSONRESULT;
    private final ArrayList<News> newsList = new ArrayList<>();

    public Infrastructure(String APIKEY) {
        this.APIKEY = APIKEY;
        this.URL = "https://newsapi.org/v2/everything?q=tesla&from=2025-02-05&sortBy=publishedAt&apiKey=";
        this.JSONRESULT = getInformation();
        parseInformation(); // Ensure parsing happens in the constructor
    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    // todo: fix this method to get information correctly
    private String getInformation() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL + APIKEY))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                throw new IOException("HTTP error code: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println("!!Exception : " + e.getMessage());
        }
        return null;
    }

    // todo: where is it used?
    private void parseInformation() {

        try {
            JSONObject jsonObject = new JSONObject(JSONRESULT);
            JSONArray articles = jsonObject.getJSONArray("articles");


            for (int i = 0; i < 20; i++) {
                JSONObject article = articles.getJSONObject(i);
                String title = article.getString("title");
                String description = article.optString("description");
                String sourceName = article.getJSONObject("source").getString("name");
                String author = article.optString("author", "Unknown");
                String url = article.getString("url");
                String publishedAt = article.getString("publishedAt");
                News news = new News();
            }
        } catch (Exception e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
        }
    }

    public void displayNewsList() {
        if (newsList.isEmpty()) {
            System.out.println("No news available.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("News Titles:");
            for (int i = 0; i < newsList.size(); i++) {
                System.out.println((i + 1) + ". " + newsList.get(i).showTitle());
            }
            System.out.println((newsList.size() + 1) + ". Exit");
            System.out.print("Choose an article to read more (1-" + (newsList.size() + 1) + "): ");
            int choice = scanner.nextInt();
            if (choice == newsList.size() + 1) {
                System.out.println("Exiting...");
                break;
            } else if (choice > 0 && choice <= newsList.size()) {
                newsList.get(choice - 1).displayNews();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
