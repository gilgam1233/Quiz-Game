/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.utils;

import com.dht.quizappv2.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {
    private static MyStage insta;
    private final Stage stage;
    private Scene scene;

    private MyStage() {
        stage = new Stage();
        stage.setTitle("Quiz App");
    }
    
    public static MyStage getInsta()
    {
        if(insta == null)
            insta = new MyStage();
        
        return insta;
    }
    
    public void ShowStage(String fxml) throws IOException
    {
      scene = new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
      stage.setScene(scene);
      stage.show();
        
        
        
    }
    
}
