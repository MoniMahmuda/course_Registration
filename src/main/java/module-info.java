module com.middemo.mid_spring23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.middemo.mid_spring23 to javafx.fxml;
    exports com.middemo.mid_spring23;
}