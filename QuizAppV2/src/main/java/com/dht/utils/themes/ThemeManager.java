/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.utils.themes;

import com.dht.quizappv2.App;
import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class ThemeManager {

    /**
     * @param aTheme the theme to set
     */
    public static void setTheme(ThemeFactory aTheme) {
        theme = aTheme;
    }

    /**
     * @param theme the theme to set
     */
 
    private static ThemeFactory theme;
    
    public static void ChuyenCanh(Scene scene)
    {
         scene.getRoot().getStylesheets().clear();
         scene.getRoot().getStylesheets().add(theme.getThemeFactory());
    }
    
    
}
