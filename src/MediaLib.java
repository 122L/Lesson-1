public class MediaLib {
    public static void main(String[] args) {

        double totalCost = 0;
        double averageRating = 0;
        int numSongs = 0;

        System.out.println("Welcome to your Media Library.");

        Song getNumSongs = new Song();

        Song song1 = new Song("Fellas in Paris", 5.00, 5);

        System.out.println("Title: " + song1.getTitle() + " Price: " + song1.getPrice() + " Rating: " + song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice() + totalCost;
        averageRating = song1.getRating() + averageRating;

        Song song2 = new Song("Hello",1.50,5);
        System.out.println("Title: " + song2.getTitle() + " Price: " + song2.getPrice() + " Rating: " + song2.getRating());
        ++numSongs;
        averageRating = (song2.getRating() + averageRating) / numSongs;

        System.out.println("Average Rating: " + averageRating);

        Books book1 = new Books();
        Movies movie1 = new Movies();
    }
}