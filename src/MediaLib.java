public class MediaLib {
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library.");

        Song song1 = new Song();
        Books book1 = new Books();
        Movies movie1 = new Movies();

        song1.setTitle("Bruh Sound Effect #2");
        System.out.println(song1.getTitle());

        book1.setTitle("Minecraft Survival Handbook");
        System.out.println(book1.getTitle());

        movie1.setTitle("Tropic Thunder");
        System.out.println(movie1.getTitle());
    }
}