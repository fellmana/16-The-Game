/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.thegame;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

/**
 *
 * @author afellman
 */
public class MainMenu {

    private int MainMenuButtonWidth;
    private int MainMenuButtonHeight;
    private Button NewGameButton;
    private Button LoadGameButton;
    private Button RulesButton;
    private Button ExitButton;

    public MainMenu() {
        this.MainMenuButtonWidth = 600;
        this.MainMenuButtonHeight = 80;
        NewGameButton = new Button("New Game");
        LoadGameButton = new Button("Load Game");
        RulesButton = new Button("Rules");
        ExitButton = new Button("Exit");
    }

    public Button getNewGameButton() {
        return NewGameButton;
    }

    public Button getLoadGameButton() {
        return LoadGameButton;
    }

    public Button getRulesButton() {
        return RulesButton;
    }

    public Button getExitButton() {
        return ExitButton;
    }

    public BorderPane buildMenu() {

        //  Title
        Label TitleText = new Label("16 The Game");

        //
        //  Formatting of MainMenu
        //
        NewGameButton.setPrefHeight(MainMenuButtonHeight);
        NewGameButton.setPrefWidth(MainMenuButtonWidth);
        NewGameButton.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.45 * MainMenuButtonHeight)));
        LoadGameButton.setPrefHeight(MainMenuButtonHeight);
        LoadGameButton.setPrefWidth(MainMenuButtonWidth);
        LoadGameButton.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.45 * MainMenuButtonHeight)));
        RulesButton.setPrefHeight(MainMenuButtonHeight);
        RulesButton.setPrefWidth(MainMenuButtonWidth);
        RulesButton.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.45 * MainMenuButtonHeight)));
        ExitButton.setPrefHeight(MainMenuButtonHeight);
        ExitButton.setPrefWidth(MainMenuButtonWidth);
        ExitButton.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.45 * MainMenuButtonHeight)));
        TitleText.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.90 * MainMenuButtonHeight)));
        //
        //     Main Menu Button Layout setup
        //
        VBox MainMenuBox = new VBox();
        MainMenuBox.getChildren().add(NewGameButton);
        MainMenuBox.getChildren().add(LoadGameButton);
        MainMenuBox.getChildren().add(RulesButton);
        MainMenuBox.getChildren().add(ExitButton);
        MainMenuBox.setSpacing(5);
        MainMenuBox.setAlignment(Pos.CENTER);

        //
        //      Main Menu Panel Setup 
        //
        BorderPane MainMenuPanel = new BorderPane();
        MainMenuPanel.setCenter(MainMenuBox);
        MainMenuPanel.setTop(TitleText);
        MainMenuPanel.setAlignment(TitleText, Pos.TOP_CENTER);
        MainMenuPanel.setMargin(TitleText, new Insets(100, 0, -30, 0));

        return MainMenuPanel;
    }

}
