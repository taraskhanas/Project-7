module sdt.project7 {
    requires javafx.controls;
    requires javafx.fxml;

    opens sdt.project7.part1 to javafx.fxml;
    exports sdt.project7.part1;
}