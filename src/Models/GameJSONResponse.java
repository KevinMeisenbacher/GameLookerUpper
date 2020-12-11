package Models;

import com.google.gson.annotations.SerializedName;

public class GameJSONResponse {

    @SerializedName("results")
    private ResultsInfo[] results;
    
    @SerializedName("number_of_total_results")
    private String totalResults;

    /**
     * Make it possible for rows to return
     * @param results
     * @param totalResults
     */
    public GameJSONResponse(ResultsInfo[] results, String totalResults) {
        setResults(results);
        setTotalResults(totalResults);
    }

    /**
     * Retun results
     * @return
     */
    public ResultsInfo[] getResults() {
        return results;
    }

    /**
     * Initialize results
     * @param results
     */
    public void setResults(ResultsInfo[] results) {
        this.results = results;
    }

    /**
     * Return total results
     * @return
     */
    public String getTotalResults() {
        return totalResults;
    }

    /**
     * Initialize total results
     * @param totalResults
     */
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * Make results human-readable
     * @return
     */
    public String toString() {
        return String.format("%s", results);
    }
}
