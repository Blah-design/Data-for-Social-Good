public class Game {
    private String name;
    private String genre;

    /*
     * Creates a Game with the given name and genre.
     */
    public Game(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    /*
     * Returns the name of the game.
     */
    public String getName() {
        return name;
    }

    /*
     * Returns the genre of the game.
     */
    public String getGenre() {
        return genre;
    }

    /*
     * Returns the game's name and genre, like "Minecraft (Sandbox)".
     */
    public String toString() {
        return name + " (" + genre + ")";
    }
}