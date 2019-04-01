/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.thegame;

/**
 *
 * @author afellman
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextAreaBuilder;
import javafx.scene.layout.VBoxBuilder;

public class Game extends Application {

    public static void main(String[] args) {
        launch(Game.class);
    }

    @Override
    public void start(Stage Window) {

        int MainMenuButtonWidth = 600;
        int MainMenuButtonHeight = 80;

        //
        //  Buttons for Menu Scene
        //
        Button NewGameButton = new Button("New Game");
        Button LoadGameButton = new Button("Load Game");
        Button RulesButton = new Button("Rules");
        Button ExitButton = new Button("Exit");
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

        //
        //      GameWindow Button Setupp
        //
        Button loppuun = new Button("Kolmanteen näkymään!");
        Button BackToMenuButton1 = new Button("Main Menu");
        Button SaveGameButton = new Button("Save Game");
        Button testbutton = new Button("testi");

        HBox GameWindowBox = new HBox();
        GameWindowBox.getChildren().add(BackToMenuButton1);
        GameWindowBox.getChildren().add(SaveGameButton);
        GameWindowBox.setSpacing(5);
        GameWindowBox.setAlignment(Pos.TOP_LEFT);

        BorderPane GameWindowPanel = new BorderPane();
        GameWindowPanel.setCenter(testbutton);
        GameWindowPanel.setTop(GameWindowBox);
        GameWindowPanel.setMargin(GameWindowBox, new Insets(5, 5, 5, 5));

        //
        //  Rules Scene setup
        //
        Button BackToMenuButton2 = new Button("Main Menu");

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

        //
        //  Setting up different scenes
        //
        Scene MainMenu = new Scene(MainMenuPanel, 1000, 900);
        Scene GameWindow = new Scene(GameWindowPanel, 1000, 900);
        Scene Rules = new Scene(RulesWindow, 1000, 900);

        NewGameButton.setOnAction((event) -> {
            Window.setScene(GameWindow);
        });
        LoadGameButton.setOnAction((event) -> {
            Window.setScene(GameWindow);
        });
        RulesButton.setOnAction((event) -> {
            Window.setScene(Rules);
        });
        ExitButton.setOnAction((event) -> {
            System.exit(0);
        });

        loppuun.setOnAction((event) -> {
            Window.setScene(Rules);
        });

        BackToMenuButton1.setOnAction((event) -> {
            Window.setScene(MainMenu);
        });
        BackToMenuButton2.setOnAction((event) -> {
            Window.setScene(MainMenu);
        });

        testbutton.setOnAction((event) -> {
            Window.setScene(MainMenu);
        });

        Window.setScene(MainMenu);
        Window.show();
    }

}
