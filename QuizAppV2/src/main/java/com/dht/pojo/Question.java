/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Question {
    private int id;
    private String content;
    private String hint;
    private String image;
    private Category category;
    private Level level;
    private List<Choice> choice = new ArrayList<>();

    public Question(Builder b) {
        this.id = b.id;
        this.content = b.content;
        this.hint = b.hint;
        this.image=b.image;
        this.category = b.category;
        this.level = b.level;
        choice = b.choice;
    }
    
    
    
    public static class Builder{
        private int id;
    private String content;
    private String hint;
    private String image;
    private Category category;
    private Level level;
    private List<Choice> choice = new ArrayList<>();

        public Builder(String content,Category category,Level level) {
            this.content = content;
            this.category = category;
            this.level = level;
        }
        
        public Builder setId(int id)
        {
            this.id = id;
            return this;
        }
        
         public Builder setContent(String content)
        {
            this.content = content;
            return this;
        }   
         
          public Builder setHint(String content)
        {
            this.hint = content;
            return this;
        }   
          
         public Builder setImage(String content)
        {
            this.image = content;
            return this;
        }     
         
         public Builder Choice(Choice c)
        {
            this.choice.add(c);
            
            return this;
        }    
         public Question build()
         {
             return new Question(this);
         }
          
        }
}

