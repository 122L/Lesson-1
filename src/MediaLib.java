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

        Song song2 = new Song("Bruh Sound Effect #2",1.50,5);
        System.out.println("Title: " + song2.getTitle() + " Price: " + song2.getPrice() + " Rating: " + song2.getRating());
        ++numSongs;
        totalCost = song2.getPrice() + averageRating;
        averageRating = (song2.getRating() + averageRating) / numSongs;

        Song song3 = new Song("Metallica didn't play Trapped Under Ice at the Freeze 'Em All concert",100.00,5);
        System.out.println("Title: " + song3.getTitle() + " Price: " + song3.getPrice() + " Rating: " + song3.getRating());
        ++numSongs;
        totalCost = song3.getPrice() + averageRating;
        averageRating = (song3.getRating() + averageRating) / numSongs;

        Song song4 = new Song("Lil Uzi Vert screaming for a consecutive 5 minutes",6.00,5);
        System.out.println("Title: " + song4.getTitle() + " Price: " + song4.getPrice() + " Rating: " + song4.getRating());
        ++numSongs;
        totalCost = song4.getPrice() + averageRating;
        averageRating = (song4.getRating() + averageRating) / numSongs;

        Song song5 = new Song("Megalovania",1.00,5);
        System.out.println("Title: " + song5.getTitle() + " Price: " + song5.getPrice() + " Rating: " + song5.getRating());
        ++numSongs;
        totalCost = song5.getPrice() + averageRating;
        averageRating = (song5.getRating() + averageRating) / numSongs;

        Song song6 = new Song("New Crispy Pretzel Chicken Fries At Burger King",1.50,5);
        System.out.println("Title: " + song6.getTitle() + " Price: " + song6.getPrice() + " Rating: " + song6.getRating());
        ++numSongs;
        totalCost = song6.getPrice() + averageRating;
        averageRating = (song6.getRating() + averageRating) / numSongs;

        Song song7 = new Song("Soothing/Relaxing Vietnam War Sounds",0.00,5);
        System.out.println("Title: " + song7.getTitle() + " Price: " + song7.getPrice() + " Rating: " + song7.getRating());
        ++numSongs;
        totalCost = song7.getPrice() + averageRating;
        averageRating = (song7.getRating() + averageRating) / numSongs;

        System.out.println("Average Rating: " + averageRating);
        System.out.println("Total Cost: " + totalCost);

        Books book1 = new Books();
        Movies movie1 = new Movies();
    }
}