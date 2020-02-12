public class Song {

    private String title;
    private int rating;
    private double price;
    private boolean favorite;

    public Song(String title, double price, int rating) {
        this.title = title;
        this.rating = rating;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }
    public void addToFavorites() {
        favorite = true;
    }
}
