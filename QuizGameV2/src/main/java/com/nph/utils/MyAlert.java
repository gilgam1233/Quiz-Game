/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nph.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;
    private final Alert alert;

    private MyAlert() {
       alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Quizz App");
        
    }
    
    public static MyAlert getInstace()
    {
        if(instance == null)
              instance = new MyAlert();
        return instance;
    }
    
    public void showAlert(String mess)
    {
 
       
        alert.setContentText(mess);
        alert.showAndWait();    
    }
        
}
