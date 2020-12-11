package Models;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class ResultsInfo {
    @SerializedName("deck")
    private String deck;

    @SerializedName("name")
    private String name;

    @SerializedName("platforms")
    private PlatformInfo[] platforms;

    @SerializedName("image")
    private BoxArt boxArt;

    @SerializedName("number_of_user_reviews")
    private int numOfReviews;

    @SerializedName("original_release_date")
    private String releaseDate;

    @SerializedName("original_game_rating")
    private RatingsInfo[] ratings;

    /**
     * Initialize the results object
     * @param deck
     * @param name
     * @param platforms
     * @param boxArt
     * @param numOfReviews
     * @param releaseDate
     * @param ratings
     */
    public ResultsInfo(String deck, String name, PlatformInfo[] platforms, BoxArt boxArt,
                       int numOfReviews, String releaseDate, RatingsInfo[] ratings) {
        setDeck(deck);
        setName(name);
        setPlatforms(platforms);
        setBoxArt(boxArt);
        setNumOfReviews(numOfReviews);
        setReleaseDate(releaseDate);
        setRatings(ratings);
    }

    /**
     * Return the game's short description
     * @return
     */
    public String getDeck() {
        return deck;
    }

    /**
     * Initialize the game's short description
     * @param deck
     */
    public void setDeck(String deck) {
        this.deck = deck;
    }

    /**
     * Return the name of the game
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Initialize the name of the game
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the game's available platforms
     * @return
     */
    public PlatformInfo[] getPlatforms() {
        return platforms;
    }

    /**
     * Initialize the game's available platforms
     * @param platforms
     */
    public void setPlatforms(PlatformInfo[] platforms) {
        this.platforms = platforms;
    }

    /**
     * Return the game's box art
     * @return
     */
    public BoxArt getBoxArt() {
        return boxArt;
    }

    /**
     * Initialize the game's box art
     * @param boxArt
     */
    public void setBoxArt(BoxArt boxArt) {
        this.boxArt = boxArt;
    }

    /**
     * Return the number of reviews
     * @return
     */
    public int getNumOfReviews() {
        return numOfReviews;
    }

    /**
     * Initialize the number of reviews
     * @param numOfReviews
     */
    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

    /**
     * Return the release date for the game
     * @return
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Initialize the release date for the game. Date can be past, present, or for upcoming games, future
     * @param releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Return the game's ratings
     * @return
     */
    public RatingsInfo[] getRatings() {
        return ratings;
    }

    /**
     * Initialize the game's ratings
     * @param ratings
     */
    public void setRatings(RatingsInfo[] ratings) {
        this.ratings = ratings;
    }

    /**
     * Make words human-readable
     * @return
     */
    public String toString() {
        PlatformInfo[] platforms = getPlatforms();
        return String.format("%s - %s", name, Arrays.toString(platforms));
    }
}
