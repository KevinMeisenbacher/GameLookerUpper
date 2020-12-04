package JSON;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GameJSONResponse {

    @SerializedName("results")
    private ResultsInfo[] results;

//    public GameInfo(String gameName, String shortDescription, PlatformInfo[] platforms) {
//        setGameName(gameName);
//        setShortDescription(shortDescription);
//        setPlatforms(platforms);
//    }
}
