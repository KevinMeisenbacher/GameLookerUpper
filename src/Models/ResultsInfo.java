package Models;

import com.google.gson.annotations.SerializedName;

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

    public ResultsInfo(String deck, String name, PlatformInfo[] platforms, BoxArt boxArt,
                       int numOfReviews, String releaseDate) {
        setDeck(deck);
        setName(name);
        setPlatforms(platforms);
        setBoxArt(boxArt);
        setNumOfReviews(numOfReviews);
        setReleaseDate(releaseDate);
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlatformInfo[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(PlatformInfo[] platforms) {
        this.platforms = platforms;
    }

    public BoxArt getBoxArt() {
        return boxArt;
    }

    public void setBoxArt(BoxArt boxArt) {
        this.boxArt = boxArt;
    }

    public int getNumOfReviews() {
        return numOfReviews;
    }

    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return String.format("%s - %s %s", name, deck, platforms);
    }
}
