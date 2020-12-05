package Controllers;

import Models.ResultsInfo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class LookerUpperController implements Initializable {

    @FXML
    private TextField searchBox;

    @FXML
    private Button searchButton;

    @FXML
    private ListView<ResultsInfo> listView;

    @FXML
    private ImageView imageView;

    @FXML
    private Label totalResultsLabel;

    @FXML
    private Label matchingGamesLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldValue, selectedGame) -> {
            imageView.setImage(new Image("https://giantbomb1.cbsistatic.com/uploads/square_avatar/9/93770/2370498-genesis_desertstrike_2__1_.jpg"));
        }
        );
    }
}
