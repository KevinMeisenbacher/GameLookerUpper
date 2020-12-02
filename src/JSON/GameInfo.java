package JSON;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GameInfo {
    @SerializedName("name")
    private String gameName;

    @SerializedName("deck")
    private String shortDescription;

    @SerializedName("platforms")
    private PlatformInfo[] platforms;

    public GameInfo(String gameName, String shortDescription, PlatformInfo[] platforms) {
        setGameName(gameName);
        setShortDescription(shortDescription);
        setPlatforms(platforms);
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public PlatformInfo[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(PlatformInfo[] platforms) {
        this.platforms = platforms;
    }

    public String toString() {
        return String.format("Game: %s%n%nDescription: %s%n%nPlatforms: %s",
                gameName, shortDescription, platforms);
    }
}
