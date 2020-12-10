package Models;

import com.google.gson.annotations.SerializedName;

public class RatingsInfo {
    @SerializedName("name")
    private String ratingName;

    public RatingsInfo(String ratingName) {
        setRatingName(ratingName);
    }

    public String getRatingName() {
        return ratingName;
    }

    public void setRatingName(String ratingName) {
        this.ratingName = ratingName;
    }

    public String toString() {
        return String.format("%s", ratingName);
    }
}
