package Models;

import com.google.gson.annotations.SerializedName;

public class PlatformInfo {
    @SerializedName("api_detail_url")
    private String apiURL;

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String platformName;

    @SerializedName("site_detail_url")
    private String siteURL;

    @SerializedName("abbreviation")
    private String abbreviation;

    public PlatformInfo(String apiURL, int id, String platformName, String siteURL, String abbreviation) {
        setApiURL(apiURL);
        setId(id);
        setPlatformName(platformName);
        setSiteURL(siteURL);
        setAbbreviation(abbreviation);
    }

    public String getApiURL() {
        return apiURL;
    }

    public void setApiURL(String apiURL) {
        this.apiURL = apiURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getSiteURL() {
        return siteURL;
    }

    public void setSiteURL(String siteURL) {
        this.siteURL = siteURL;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String toString() {
        return String.format("%s", platformName);
    }
}
