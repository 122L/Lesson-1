public class MediaLib {
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library.");

        Song song1 = new Song();

        System.out.println(song1);

        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
    }
}