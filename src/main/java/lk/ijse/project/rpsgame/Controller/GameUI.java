package lk.ijse.project.rpsgame.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GameUI implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private Label computerResult;

    @FXML
    private ImageView image;

    @FXML
    private ImageView imagePaper;

    @FXML
    private ImageView imageRock;

    @FXML
    private ImageView imageScissor;

    @FXML
    private Label playerName;

    @FXML
    private Label playerResult;

    @FXML
    private Label result;

    @FXML
    private ImageView setComputerImage;

    @FXML
    private ImageView setPlayerImage;

    @FXML
    void paperBTNAction(ActionEvent event) {

    }

    @FXML
    void rockBTNAction(ActionEvent event) {

    }

    @FXML
    void scissorBTNAction(ActionEvent event) {

    }

}
