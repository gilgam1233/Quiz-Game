package com.nph.quizgamev2;

import com.nph.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {

    public void alertQuesttion(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("Question.fxml")).load());
       Stage stage = new Stage();
       stage.setScene(scene);
       stage.show();
    }

    public void alertPractice(ActionEvent event) {
        MyAlert.getInstace().showAlert("Practice: Coming soon");
    }
}
