package Utilities;

import JSON.GameInfo;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import javafx.scene.Parent;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GameJSONReader {
    public static GameInfo getGameJSON() {
        GameInfo gameInfo = null;
        try (
                FileReader fileReader = new FileReader("./src/JSON/games.json");
                JsonReader jsonReader = new JsonReader(fileReader);
             )
             {
             Gson gson = new Gson();
            gameInfo = gson.fromJson(jsonReader, GameInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gameInfo;
    }

    public static void main(String[] args) {
        GameInfo gameInfo = getGameJSON();
        System.out.println(gameInfo);
    }
}
