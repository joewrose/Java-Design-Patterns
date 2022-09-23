
public class SportsChannel implements Channel {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
    } 
}
