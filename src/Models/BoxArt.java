package Models;

import com.google.gson.annotations.SerializedName;

public class BoxArt {
    @SerializedName("original_url")
    private String image;

    @SerializedName("icon_url")
    private String icon;

    /**
     * Make boxart displayable
     * @param boxArt
     */
    public BoxArt(String boxArt) {
        setImage(boxArt);
    }

    /**
     * Return images that use this class
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     * Initialize game images
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }
}
