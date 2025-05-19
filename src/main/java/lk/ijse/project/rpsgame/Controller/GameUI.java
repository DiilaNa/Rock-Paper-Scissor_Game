package lk.ijse.project.rpsgame.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GameUI implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image background = new Image(getClass().getResourceAsStream("/images/RPSBackground.jpg"));
        image.setImage(background);
        Image image1 = new Image(getClass().getResourceAsStream("/images/iconStone.png"));
        imageRock.setImage(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/images/iconPaper.png"));
        imagePaper.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("/images/iconScissors.png"));
        imageScissor.setImage(image3);

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
