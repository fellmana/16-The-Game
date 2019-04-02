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
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;


public class Game extends Application {

    public static void main(String[] args) {
        launch(Game.class);
    }

    @Override
    public void start(Stage Window) {
        Urn Urn = new Urn();
        int Bricksize = 100;

        //
        //      GameWindow Button Setupp
        //
        Button BackToMenuButton1 = new Button("Main Menu");
        Button SaveGameButton = new Button("Save Game");
        Button UrnButton = new Button("Draw");
        UrnButton.setPrefHeight(100);
        UrnButton.setPrefWidth(100);
        UrnButton.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * 50)));
        Label CurrentBrick = new Label("");
        CurrentBrick.setPrefHeight(Bricksize);
        CurrentBrick.setPrefWidth(Bricksize);
        CurrentBrick.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * Bricksize)));
        CurrentBrick.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));

        Label Pile1 = new Label("0");
        Pile1.setPrefHeight(Bricksize);
        Pile1.setPrefWidth(Bricksize);
        Pile1.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * Bricksize)));

        Label Pile2 = new Label("0");
        Pile2.setPrefHeight(Bricksize);
        Pile2.setPrefWidth(Bricksize);
        Pile2.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * Bricksize)));

        Label Pile3 = new Label("0");
        Pile3.setPrefHeight(Bricksize);
        Pile3.setPrefWidth(Bricksize);
        Pile3.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * Bricksize)));

        Label Pile4 = new Label("0");
        Pile4.setPrefHeight(Bricksize);
        Pile4.setPrefWidth(Bricksize);
        Pile4.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * Bricksize)));

        Label Pile5 = new Label("0");
        Pile5.setPrefHeight(Bricksize);
        Pile5.setPrefWidth(Bricksize);
        Pile5.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * Bricksize)));

        Label Pile6 = new Label("0");
        Pile6.setPrefHeight(Bricksize);
        Pile6.setPrefWidth(Bricksize);
        Pile6.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * Bricksize)));
        
        Label Status = new Label("Bricks in Urn: " + Urn.getLength());

        HBox GameWindowBox = new HBox();
        GameWindowBox.getChildren().add(BackToMenuButton1);
        GameWindowBox.getChildren().add(SaveGameButton);
        GameWindowBox.setSpacing(5);
        GameWindowBox.setAlignment(Pos.TOP_LEFT);

        HBox ControlBox = new HBox();
        ControlBox.getChildren().add(UrnButton);
        ControlBox.getChildren().add(CurrentBrick);
        ControlBox.getChildren().add(Pile1);
        ControlBox.getChildren().add(Pile2);
        ControlBox.getChildren().add(Pile3);
        ControlBox.getChildren().add(Pile4);
        ControlBox.getChildren().add(Pile5);
        ControlBox.getChildren().add(Pile6);
        
        ControlBox.setSpacing(40);
        ControlBox.setMargin(UrnButton, new Insets(10, 10, 10, 10));
        ControlBox.setMargin(CurrentBrick, new Insets(10, 10, 10, 10));
        
        BorderPane GameWindowPanel = new BorderPane();
        GameWindowPanel.setCenter(ControlBox);
        GameWindowPanel.setTop(GameWindowBox);
        GameWindowPanel.setBottom(Status);
        GameWindowPanel.setMargin(GameWindowBox, new Insets(5, 5, 5, 5));

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
            Urn.InitializeUrn();
        });
        Menu.getLoadGameButton().setOnAction((event) -> {
            Window.setScene(GameWindow);
            Urn.InitializeUrn();
        });
        Menu.getRulesButton().setOnAction((event) -> {
            Window.setScene(Rules);
        });
        Menu.getExitButton().setOnAction((event) -> {
            System.exit(0);
        });

        BackToMenuButton1.setOnAction((event) -> {
            Window.setScene(MainMenu);
        });
        RuleScene.getBackToMenuButton2().setOnAction((event) -> {
            Window.setScene(MainMenu);
        });

        UrnButton.setOnAction((event) -> {
            Brick b = Urn.Draw();
            System.out.println(b.toString());
            CurrentBrick.setText("  " + b.getValue());
            Status.setText("Bricks in Urn: " + Urn.getLength());
        });

        Window.setScene(MainMenu);
        Window.show();
    }

}
