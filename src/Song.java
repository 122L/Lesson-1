public class Song {

    private String title;
    private int rating;
    private double price;
    private boolean favorite;
    private int totalCost;
    
    public Song(String title, int rating, double price) {
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
