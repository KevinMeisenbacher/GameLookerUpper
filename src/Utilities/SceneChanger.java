package Utilities;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;

public class SceneChanger {
    public static void changeScene(ActionEvent event, String viewName, String title) throws IOException {
        Parent root = FXMLLoader.load(new Object(){}.getClass().getResource(viewName));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
}
