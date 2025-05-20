module lk.ijse.project.rpsgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jshell;


    opens lk.ijse.project.rpsgame to javafx.fxml;
    exports lk.ijse.project.rpsgame;
    opens lk.ijse.project.rpsgame.Controller to javafx.fxml;
    exports lk.ijse.project.rpsgame.Controller;
}