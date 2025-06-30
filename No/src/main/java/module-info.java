module com.nph.quizgamev2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    opens com.nph.quizgamev2 to javafx.fxml;
    exports com.nph.quizgamev2;
}
