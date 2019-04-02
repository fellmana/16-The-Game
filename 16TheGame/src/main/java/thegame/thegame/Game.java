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


        //
        //  Setting up different scenes
        //
        
        MainMenu Menu = new MainMenu();
        RulesScene RuleScene = new RulesScene();
        
        Scene MainMenu = new Scene(Menu.buildMenu(), 1000, 900);
        Scene GameWindow = new Scene(GameWindowPanel, 1000, 900);
        Scene Rules = new Scene(RuleScene.BuildScene(), 1000, 900);

        Menu.getNewGameButton().setOnAction((event) -> {
            Window.setScene(GameWindow);
        });
        Menu.getLoadGameButton().setOnAction((event) -> {
            Window.setScene(GameWindow);
        });
        Menu.getRulesButton().setOnAction((event) -> {
            Window.setScene(Rules);
        });
        Menu.getExitButton().setOnAction((event) -> {
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
