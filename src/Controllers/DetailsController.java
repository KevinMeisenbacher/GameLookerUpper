package Controllers;

import Models.BoxArt;
import Models.GameData;
import Models.PlatformInfo;
import Models.ResultsInfo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailsController implements Initializable {

    @FXML
    private Label gameTitleLabel;

    @FXML
    private Label reviewsLabel;

    @FXML
    private Label releaseDataLabel;

    @FXML
    private Label ratingsLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private ImageView imageView;

    private ResultsInfo resultsInfo;
    private LookerUpperController controller;
    private GameData gameData;
    private PlatformInfo[] platformInfo;
    private BoxArt boxArt;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gameData = new GameData("");
//        resultsInfo = new ResultsInfo("", "", platformInfo,
//                boxArt, 0, "01/01/2001");
        gameTitleLabel.setText(gameData.getTitle());
    }
}
