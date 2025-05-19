module lk.ijse.project.rpsgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.project.rpsgame to javafx.fxml;
    exports lk.ijse.project.rpsgame;
}