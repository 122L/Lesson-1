public class MediaLib {
    public static void main(String[] args) {

        double totalCost = 0;
        double averageRating = 0;

        System.out.println("Welcome to your Media Library.");

        Song getNumSongs = new Song();

        Song song1 = new Song("Fellas in Paris", 5.00, 5);

        System.out.println("Title:" + song1.getTitle() + " Price: " + song1.getPrice() + " Rating: " + song1.getRating());
        totalCost = song1.getPrice() + totalCost;
        averageRating = song1.getRating() + averageRating;

        Song song2 = new Song("Hello",1.50,7);
        System.out.println(song2.getTitle() + " " + song2.getPrice() + " " + song2.getRating());
        averageRating = (song2.getRating() + averageRating) / getNumSongs.getNumSongs();

        Books book1 = new Books();
        Movies movie1 = new Movies();
    }
}