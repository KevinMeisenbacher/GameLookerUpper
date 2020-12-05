package Models;

import Models.PlatformInfo;
import Models.ResultsInfo;
import com.google.gson.annotations.SerializedName;

public class GameJSONResponse {

    @SerializedName("results")
    private ResultsInfo[] results;

    public GameJSONResponse(String gameName, String shortDescription, PlatformInfo[] platforms) {
        setResults(results);
    }
    public ResultsInfo[] getResults() {
        return results;
    }

    public void setResults(ResultsInfo[] results) {
        this.results = results;
    }

    public String toString() {
        return String.format("%s", results);
    }
}
