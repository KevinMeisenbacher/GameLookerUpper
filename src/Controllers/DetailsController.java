package Controllers;

import Models.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class DetailsController implements Initializable {

    @FXML
    private Label gameTitleLabel;

    @FXML
    private Label reviewsLabel;

    @FXML
    private Label releaseDateLabel;

    @FXML
    private Label ratingsLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private ImageView imageView;

    private LookerUpperController controller;
    private GameData gameData;
    private PlatformInfo[] platformInfo;
    private BoxArt boxArt;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gameTitleLabel.setText("");
    }

    public void grabGameInfo(ResultsInfo info) {
        ResultsInfo resultsInfo = info;
        RatingsInfo[] ratings = resultsInfo.getRatings();
        gameTitleLabel.setText(resultsInfo.getName());
        imageView.setImage(new Image(resultsInfo.getBoxArt().getImage()));
        releaseDateLabel.setText(resultsInfo.getReleaseDate());
        reviewsLabel.setText(String.valueOf(resultsInfo.getNumOfReviews()));
        ratingsLabel.setText(Arrays.toString(ratings));
        descriptionLabel.setText(resultsInfo.getDeck());
    }

    @FXML
    public void returnToSearch(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new Object(){}.getClass().getResource("../Views/lookerUpperView.fxml"));
        Parent root = loader.load();
        LookerUpperController controller = loader.getController();
        controller.getData();
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Game Looker Upper");
        stage.show();
    }
}
