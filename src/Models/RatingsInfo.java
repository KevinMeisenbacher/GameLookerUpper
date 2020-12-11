package Models;

import com.google.gson.annotations.SerializedName;

public class RatingsInfo {

    @SerializedName("name")
    private String ratingName;

    public RatingsInfo(String ratingName) {
        setRatingName(ratingName);
    }

    /**
     * Return names of game ratings
     * @return
     */
    public String getRatingName() {
        return ratingName;
    }

    /**
     * Initialize names of game ratings
     * @param ratingName
     */
    public void setRatingName(String ratingName) {
        if (ratingName.length() > 0) this.ratingName = ratingName;
    }

    /**
     * Make game ratings human-readable
     * @return
     */
    public String toString() {
        return String.format("%s", ratingName);
    }
}
