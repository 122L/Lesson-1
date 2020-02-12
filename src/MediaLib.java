public class MediaLib {
    public static void main(String[] args) {

        double totalCost;
        int numberOfSongs = 0;

        System.out.println("Welcome to your Media Library.");

        Song song1 = new Song("Fellas in Paris", 5);
        Song song2 = new Song("Ok and? Didn't ask", 5);
        Song song3 = new Song("Metallica didn't play trapped under ice at the Freeze 'Em All concert", 5);
        Song song4 = new Song("Billie Jean but the main melody never starts", 5);
        Song song5 = new Song("The Fortnite Theme", 5);
        Song song6 = new Song("Music that plays when unfortunate events happen", 5);
        Song song7 = new Song("The Burger King", 5);

        Books book1 = new Books();
        Movies movie1 = new Movies();

        song1.setTitle("Bruh Sound Effect #2");
        song1.setRating(5);
        song1.setPrice(0.00);
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        System.out.println(song1.getPrice());

        book1.setTitle("Minecraft Survival Handbook");
        book1.setRating(5);
        book1.setPrice(6.00);
        System.out.println(book1.getTitle());
        System.out.println(book1.getRating());
        System.out.println(book1.getPrice());

        movie1.setTitle("Tropic Thunder");
        movie1.setRating(5);
        movie1.setPrice(3.00);
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getRating());
        System.out.println(movie1.getPrice());
    }
}