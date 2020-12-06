package Utilities;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {
    public static void getSearchEntry(String input) {

        String searchText = "https://www.giantbomb.com/api/search/?api_key=" +
                "32ddf959a1c6bab81b001e225b181ab7677e8c79&format=json&query="+input+"&resources=game";
        File file = new File ("src/Data/games.json");

        // Clear out any old files that exist
        if (file.exists()) file.delete();

        // Setup an HTTP request to parse user's search
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(searchText)).build();

        try {
            HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(
                    Paths.get("src/Data/games.json")
            ));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
