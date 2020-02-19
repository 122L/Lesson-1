package sciFi;

import java.util.Scanner;

public class PetGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pet Name Generator");

        System.out.println("Please enter your pet's name >>> ");
        String petName1 = input.nextLine();

        System.out.println("Please enter your other pet's name >>> ");
        String petName2 = input.nextLine();

        int r = (int) (Math.random() * petName1.length()) + 1;
    }
}
