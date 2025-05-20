package lk.ijse.project.rpsgame.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import lk.ijse.project.rpsgame.Util.nameUtil;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable{

    @FXML
    private TextField nameText;

    @FXML
    private ImageView image;

    @FXML
    void loginAction(ActionEvent event) throws IOException {
        String name = nameText.getText();
        if (name.isEmpty()){
            new Alert(Alert.AlertType.WARNING, "Please enter your name").show();
        }else {
            nameUtil.name = name;
            Stage currentStage = (Stage) image.getScene().getWindow();
            currentStage.close();
            Stage stage = new Stage();
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/view/GameUI.fxml")));
            scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("RPS Game");
            stage.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image bgImage = new Image(getClass().getResourceAsStream("/images/RPSBackground.jpg"));
        image.setImage(bgImage);
    }
}
