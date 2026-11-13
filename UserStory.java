import java.util.Scanner;

public class UserStory {
    private Game[] games;

    // The five genres used in genres.txt
private String[] genreList = {"Role-Playing", "Action-Adventure", "First-Person Shooter", "Platformer", "Sports"};

    /*
     * Builds a Game object for each game in the data files.
     * names and genres text files describe the same game, so they are paired by index.
     */
    public UserStory(String[] names, String[] genres) {
        games = new Game[names.length];

        for (int i = 0; i < names.length; i++) {
            games[i] = new Game(names[i], genres[i]);
        }
    }

    /*
     * Returns how many games have the given genre.
     */
    public int countGenre(String genre) {
        int count = 0;

        for (int i = 0; i < games.length; i++) {
            // Use .equals() to compare the text of two Strings
            if (games[i].getGenre().equals(genre)) {
                count++;
            }
        }
        return count;
    }

    /*
     * Returns a new array with the names of all games in the given genre.
     * The countGenre method tells us how big the new array needs to be.
     */
    public String[] getGamesInGenre(String genre) {
        String[] result = new String[countGenre(genre)];
        int index = 0; // next open spot in result

        for (int i = 0; i < games.length; i++) {
            if (games[i].getGenre().equals(genre)) {
                result[index] = games[i].getName();
                index++;
            }
        }
        return result;
    }

    /*
     * Returns the genre that has the most games.
     * If two genres tie, the one listed first in genreList wins.
     */
    public String getMostCommonGenre() {
        String best = genreList[0];
        int bestCount = countGenre(best);

        for (int i = 1; i < genreList.length; i++) {
            int count = countGenre(genreList[i]);
            if (count > bestCount) {
                best = genreList[i];
                bestCount = count;
            }
        }
        return best;
    }

    /*
     * Returns a summary of the game library: the total number of games,
     * how many games are in each genre, and the most common genre.
     */
    public String toString() {
        String result = "Game Library: " + games.length + " games\n";

        for (int i = 0; i < genreList.length; i++) {
            result += genreList[i] + ": " + countGenre(genreList[i]) + " games\n";
        }

        result += "Most common genre: " + getMostCommonGenre();
        return result;
    }
}