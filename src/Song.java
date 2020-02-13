public class Song {

    private String title;
    private int rating;
    private double price;
    private boolean favorite;
    private static int numSongs;


    public Song() {
        title = " ";
        rating = 0;
        price = 0.0;
    }
    public Song(String t, double p) {
        this.title = t;
        this.price = p;
    }
    public Song(String t, double p, int r) {
        this.title = t;
        this.price = p;
        this.rating = r;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t, double p, int r) {
        title = t;
        price = p;
        rating = r;
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
