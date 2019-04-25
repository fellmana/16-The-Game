/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextAreaBuilder;
import javafx.scene.layout.VBoxBuilder;

/**
 *
 * @author afellman
 */
public class RulesScene {

    Button BackToMenuButton2;

    public RulesScene() {
        this.BackToMenuButton2 = new Button("Main Menu");
    }

    public Button getBackToMenuButton2() {
        return BackToMenuButton2;
    }

    public BorderPane BuildScene() {

        final TextArea textArea = TextAreaBuilder.create()
                .prefWidth(400)
                .wrapText(true)
                .build();
        textArea.setEditable(false);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setPrefWidth(400);
        scrollPane.setPrefHeight(800);

        VBox vBox = VBoxBuilder.create()
                .children(scrollPane)
                .build();

        BorderPane RulesWindow = new BorderPane();
        RulesWindow.setTop(BackToMenuButton2);
        RulesWindow.setCenter(vBox);
        RulesWindow.setMargin(BackToMenuButton2, new Insets(5, 5, 5, 5));
        RulesWindow.setMargin(vBox, new Insets(10, 10, 10, 10));

        return RulesWindow;
    }

    public void loadText() {

    }
}
