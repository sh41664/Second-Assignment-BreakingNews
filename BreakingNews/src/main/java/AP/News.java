package AP;

public class News
{
    private String title;
    private String description;
    private String sourceName;
    private String author;
    private String url;
    private String publishedAt;

    public News(String title, String description, String sourceName, String author, String url, String publishedAt)
    {}

    public News() {

    }


    public void displayNews()
    {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Source: " + sourceName);
        System.out.println("Author: " + author);
        System.out.println("URL: " + url);
        System.out.println("Published At: " + publishedAt);
        System.out.println();
    }
    public String showTitle()
    {
        return title;
    }
}





