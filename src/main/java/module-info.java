module cs112.lab08 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;


    opens cs112.lab08 to javafx.fxml;
    exports cs112.lab08;
}