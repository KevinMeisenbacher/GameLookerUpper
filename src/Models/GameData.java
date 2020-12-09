package Models;

import javafx.scene.image.Image;

public class GameData {
    private String title;

    public GameData(String title) {
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
