package com.example.loginscreen4;

import javafx.scene.control.CheckBox;

import java.util.ArrayList;

public class ToDo {

    private int id;
    private String todo;
    private Boolean isCompleted;
    private CheckBox isCheckBox;
    private int user_id;

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public CheckBox getIsCheckBox() {
        return isCheckBox;
    }

    public void setIsCheckBox(CheckBox isCheckBox) {
        this.isCheckBox = isCheckBox;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }




}


