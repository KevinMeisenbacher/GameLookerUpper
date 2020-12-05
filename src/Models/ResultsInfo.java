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

    public ResultsInfo(String deck, String name, PlatformInfo[] platforms, BoxArt boxArt) {
        setDeck(deck);
        setName(name);
        setPlatforms(platforms);
        setBoxArt(boxArt);
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

    public String toString() {
        return String.format("%s - %s %s", name, deck, platforms);
    }
}
