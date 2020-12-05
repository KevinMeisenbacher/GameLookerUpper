package Models;

import com.google.gson.annotations.SerializedName;

public class BoxArt {
    @SerializedName("original_url")
    private String image;

    public BoxArt(String boxArt) {
        setImage(boxArt);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
