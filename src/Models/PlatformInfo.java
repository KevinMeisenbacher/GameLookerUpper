package Models;

import com.google.gson.annotations.SerializedName;

public class PlatformInfo {

    @SerializedName("name")
    private String platformName;

    /**
     * Constructor for passing data
     * @param platformName
     */
    public PlatformInfo(String platformName) {
        setPlatformName(platformName);
    }

    /**
     * Return names of platforms
     * @return
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * Initialize names of platforms
     * @param platformName
     */
    public void setPlatformName(String platformName) {
        if (platformName.length() > 0) this.platformName = platformName;
    }
    public String toString() {
        return String.format("%s", platformName);
    }
}
