package Utilities;

import Models.GameJSONResponse;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;

public class GameJSONReader {
    public static GameJSONResponse getGameJSON(File jsonFile) {
        GameJSONResponse gameResponse = null;
        try (
            FileReader fileReader = new FileReader("./src/Data/games.json");
            JsonReader jsonReader = new JsonReader(fileReader);
         )
             {
             Gson gson = new Gson();
                 gameResponse = gson.fromJson(jsonReader, GameJSONResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gameResponse;
    }

//    public static void main(String[] args) {
//        GameJSONResponse gameResponse = getGameJSON();
//        System.out.println(gameResponse);
//    }
}
