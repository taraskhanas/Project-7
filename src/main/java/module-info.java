module sdt.project7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sdt.project7 to javafx.fxml;
    exports sdt.project7;
}