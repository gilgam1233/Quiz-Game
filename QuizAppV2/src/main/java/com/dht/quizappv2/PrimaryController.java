package com.dht.quizappv2;

import com.dht.utils.MyAlert;
import com.dht.utils.MyStage;
import com.dht.utils.themes.DarkThemeFactory;
import com.dht.utils.themes.Theme;
import static com.dht.utils.themes.Theme.DARK;
import com.dht.utils.themes.ThemeFactory;
import com.dht.utils.themes.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {

    @FXML
    private ComboBox<Theme> cb;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb.setItems(FXCollections.observableArrayList(Theme.values()));

    }

    public void changeTheme(ActionEvent event) {
        
        ThemeManager t1 = new ThemeManager();
        this.cb.getSelectionModel().getSelectedItem().updateTheme(t1);
        t1.ChuyenCanh(this.cb.getScene());
        
                
//        switch (this.cb.getSelectionModel().getSelectedItem()) {
//            case DARK:
//                        ThemeManager e = new ThemeManager();
//                ThemeFactory f = new DarkThemeFactory();
//                ThemeManager t = new ThemeManager();
//                t.setTheme(f);
//                t.ChuyenCanh(this.cb.getScene());
//
//                break;
//            case LIGHT:
//                this.cb.getScene().getRoot().getStylesheets().clear();
//                this.cb.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
//
//                break;
//            default:
//                this.cb.getScene().getRoot().getStylesheets().clear();
//                this.cb.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
//        }
    }

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        MyStage.getInsta().ShowStage("questions.fxml");
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Practice: Comming soon...");
    }

    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMsg("Exam: Comming soon...");
    }

    public void handleLogin(ActionEvent event) {
        MyAlert.getInstance().showMsg("Login: Comming soon...");
    }

    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg("Register: Comming soon...");
    }

}
