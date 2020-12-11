package Controllers;

import Models.*;
import Utilities.APIUtility;
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
import javafx.scene.text.Font;
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
    private Label platformsLabel;

    @FXML
    private ImageView imageView;

    private ResultsInfo resultsInfo;

    /**
     * Init
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /**
     * Grab info from the LookerUpper view
     * @param info
     */
    public void grabGameInfo(ResultsInfo info) {
        // Grab data
        resultsInfo = info;
        RatingsInfo[] ratings = resultsInfo.getRatings();
        PlatformInfo[] platforms = resultsInfo.getPlatforms();
        gameTitleLabel.setText(resultsInfo.getName());

        // Populate labels
        imageView.setImage(new Image(resultsInfo.getBoxArt().getImage()));
        releaseDateLabel.setText(resultsInfo.getReleaseDate());
        reviewsLabel.setText(String.valueOf(resultsInfo.getNumOfReviews()));
        ratingsLabel.setText(Arrays.toString(ratings));
        descriptionLabel.setText(resultsInfo.getDeck());
        platformsLabel.setText(Arrays.toString(platforms));
    }

    /**
     * Switch back to main controller
     * @param event
     * @throws IOException
     */
    @FXML
    public void returnToSearch(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new Object(){}.getClass().getResource("../Views/lookerUpperView.fxml"));
        Parent root = loader.load();
        // Set the scene
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.getIcons().add(new Image("./images/defaultImage.png"));
        stage.setTitle("Game Looker Upper");
        stage.show();
    }
}
