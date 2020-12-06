package Models;

import Models.PlatformInfo;
import Models.ResultsInfo;
import com.google.gson.annotations.SerializedName;

public class GameJSONResponse {

    @SerializedName("results")
    private ResultsInfo[] results;
    
    @SerializedName("number_of_total_results")
    private String numOfResults;

    public GameJSONResponse() {
    }

    public GameJSONResponse(ResultsInfo[] results, String numOfResults) {
        setResults(results);
        setNumOfResults(numOfResults);
    }

    public ResultsInfo[] getResults() {
        return results;
    }

    public void setResults(ResultsInfo[] results) {
        this.results = results;
    }

    public String getNumOfResults() {
        return numOfResults;
    }

    public void setNumOfResults(String numOfResults) {
        this.numOfResults = numOfResults;
    }

    public String toString() {
        return String.format("%s", results);
    }
}
