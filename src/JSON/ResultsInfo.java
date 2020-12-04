package JSON;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ResultsInfo {
    @SerializedName("deck")
    private String deck;

    @SerializedName("name")
    private String name;

    /* For some reason, this breaks the program when I instantiate it as a String or a String Array
    * I think it's because of the id int in the platform array, so I'm using a generic array
    * for platforms as a placeholder because I couldn't figure out the fix for this
    *
    * Also tried nesting PlatformInfo in my ResultsInfo, but that broke the program as well */
    @SerializedName("platforms")
    private Array[] platforms;
}
