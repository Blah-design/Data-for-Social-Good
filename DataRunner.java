import java.util.Scanner;

public class DataRunner {
    public static void main(String[] args) {
        String[] names = FileReader.toStringArray("names.txt");
        String[] genres = FileReader.toStringArray("genres.txt");
        UserStory story = new UserStory(names, genres);

       System.out.println(story);
        System.out.println();

        // Ask the user which genre they want
        Scanner input = new Scanner(System.in);
System.out.print("Enter a genre (Role-Playing, Action-Adventure, First-Person Shooter, Platformer, Sports): ");
        String choice = input.nextLine();

        String[] results = story.getGamesInGenre(choice);

        if (results.length == 0) {
            System.out.println("No games found for that genre.");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println("- " + results[i]);
            }
        }
    }
}