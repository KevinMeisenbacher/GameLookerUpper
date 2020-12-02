import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) throws IOException {
        // Setup connection
        URL url = new URL("https://www.giantbomb.com/api/games/?api_key=32ddf959a1c6bab81b001e225b181ab7677e8c79&format=json");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode = conn.getResponseCode();

        // Make sure response code is legit
        String jsonData = "";
        if (responseCode != 200) throw new RuntimeException("HttpResponseCode: "+responseCode);
        else {
            // Output, hopefully
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) jsonData += scanner.nextLine();
            System.out.println(jsonData);
            scanner.close();
        }
    }
}
