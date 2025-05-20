package lk.ijse.project.rpsgame.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import lk.ijse.project.rpsgame.Util.nameUtil;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import static java.lang.System.*;

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
        result.setText("Choose an option to play");
        playerName.setText(nameUtil.name);
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

    private Image resultImage;

    private Move PlayerMove;

    private Move ComputerMove;

    private int playerScore = 0;

    private int computerScore = 0;


    @FXML
    void paperBTNAction(ActionEvent event) {
        resultImage = new Image(getClass().getResourceAsStream("/images/iconPaper.png"));
        setPlayerImage.setImage(resultImage);
        computerMove();
        PlayerMove = Move.PAPER;
        Winner();
    }

    @FXML
    void rockBTNAction(ActionEvent event) {
        resultImage = new Image(getClass().getResourceAsStream("/images/iconStone.png"));
        setPlayerImage.setImage(resultImage);
        computerMove();
        PlayerMove = Move.ROCK;
        Winner();
    }

    @FXML
    void scissorBTNAction(ActionEvent event) {
        resultImage = new Image(getClass().getResourceAsStream("/images/iconScissors.png"));
        setPlayerImage.setImage(resultImage);
        computerMove();
        PlayerMove = Move.SCISSOR;
        Winner();
    }

    private void computerMove() {
        int num = new Random().nextInt(3);
        switch (num) {
            case 0:
               resultImage = new Image(getClass().getResourceAsStream("/images/iconScissors.png"));
               setComputerImage.setImage(resultImage);
               ComputerMove = Move.SCISSOR;
               break;
            case 1:
                resultImage = new Image(getClass().getResourceAsStream("/images/iconPaper.png"));
                setComputerImage.setImage(resultImage);
                ComputerMove = Move.PAPER;
                break;
            case 2:
                resultImage = new Image(getClass().getResourceAsStream("/images/iconStone.png"));
                setComputerImage.setImage(resultImage);
                ComputerMove = Move.ROCK;
                break;
            default:
                out.println("Error");
                break;
        }
    }

    private void Winner(){
        result.setVisible(true);
        if (PlayerMove == ComputerMove){
            result.setText("Its a Draw!");
        }
        if (PlayerMove == Move.ROCK) {
            if (ComputerMove == Move.SCISSOR) {
              playerWin();
            }else if (ComputerMove == Move.PAPER) {
               computerWin();
            }
        } else if (PlayerMove == Move.PAPER) {
            if (ComputerMove == Move.SCISSOR) {
               computerWin();
            }else if (ComputerMove == Move.ROCK) {
                playerWin();
            }
        }else if (PlayerMove == Move.SCISSOR) {
            if (ComputerMove == Move.PAPER) {
                playerWin();
            }else if (ComputerMove == Move.ROCK) {
               computerWin();
            }
        }
    }
    private void playerWin(){
        playerScore++;
        result.setVisible(true);
        result.setText("You Win!");

        if (playerScore == 5){
            new Alert(Alert.AlertType.INFORMATION, "You Win The Game!").show();
            reset();
            return;
        }
        playerResult.setText(String.valueOf(playerScore));
    }


    private void computerWin(){
        computerScore++;
        result.setVisible(true);
        result.setText("You Loose!");

        if (computerScore == 5){
            new Alert(Alert.AlertType.INFORMATION, "You Loose The Game!").show();
            reset();
            return;
        }
        computerResult.setText(String.valueOf(computerScore));
    }

    private void reset(){
        playerScore = 0;
        computerScore = 0;
        computerResult.setText("0");
        playerResult.setText("0");
        result.setText("Choose an option to play");
    }
}
