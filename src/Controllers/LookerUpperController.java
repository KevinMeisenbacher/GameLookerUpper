package Controllers;

import Models.GameJSONResponse;
import Models.ResultsInfo;
import Utilities.APIUtility;
import Utilities.GameJSONReader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LookerUpperController implements Initializable {

    @FXML
    private TextField searchBox;

    @FXML
    private ListView<ResultsInfo> listView;

    @FXML
    private ImageView imageView;

    @FXML
    private Label totalResultsLabel;

    @FXML
    private Label matchingGamesLabel;

    private GameJSONResponse response;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldValue, selectedGame) -> {
            imageView.setImage(new Image(selectedGame.getBoxArt().getImage()));
        }
        );
    }

    @FXML
    public void search() {
        APIUtility.getSearchEntry(searchBox.getText().replace(" ", "%20"));
        File jsonFile = new File("src/Data/games.json");
        response = GameJSONReader.getGameJSON(jsonFile);
        updateScene();
    }

    @FXML
    public void updateScene() {
        listView.getItems().clear();
        matchingGamesLabel.setText("Total results: "+response.getNumOfResults());
        listView.getItems().addAll(response.getResults());
        totalResultsLabel.setText("Matching games: "+listView.getItems().size());
    }
}
