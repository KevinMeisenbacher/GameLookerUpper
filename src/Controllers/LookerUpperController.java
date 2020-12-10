package Controllers;

import Models.GameData;
import Models.GameJSONResponse;
import Models.ResultsInfo;
import Utilities.APIUtility;
import Utilities.GameJSONReader;
import Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
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
    private ResultsInfo resultsInfo;
    private GameData gameData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getData();
    }

    public void getData() {
        gameData = new GameData("");
        listView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldValue, selectedGame) -> {
                    imageView.setImage(new Image(selectedGame.getBoxArt().getImage()));
//                    resultsInfo.setName(selectedGame.getName());
//                    gameData.setTitle(selectedGame.getName());
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
    @FXML
    public void viewDetails(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new Object(){}.getClass().getResource("../Views/detailsView.fxml"));
        Parent root = loader.load();
        DetailsController controller = loader.getController();
        controller.grabGameInfo(listView.getSelectionModel().getSelectedItem());
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Detailed view");
        stage.show();
    }
}
