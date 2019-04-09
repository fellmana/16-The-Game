/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author afellman
 */
import ui.RulesScene;
import ui.PlayScene;
import ui.MainMenu;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import thegame.domain.Brick;
import thegame.domain.Lane;
import thegame.domain.Urn;

public class Game extends Application {

    private ArrayList<Integer> selection;

    public static void main(String[] args) {
        launch(Game.class);
    }

    @Override
    public void start(Stage Window) {
        Urn Urn = new Urn();
        Lane lane1 = new Lane();
        Lane lane2 = new Lane();
        Lane lane3 = new Lane();
        Lane lane4 = new Lane();
        Brick urnBrick = new Brick(0);
        this.selection = new ArrayList<>();

        //
        //  Setting up different scenes
        //
        MainMenu Menu = new MainMenu();
        RulesScene RuleScene = new RulesScene();
        PlayScene PlayScene = new PlayScene();

        Scene MainMenu = new Scene(Menu.buildMenu(), 1000, 900);
        Scene GameWindow = new Scene(PlayScene.build(), 1000, 900);
        Scene Rules = new Scene(RuleScene.BuildScene(), 1000, 900);
        

        

        PlayScene.updateLane1(lane1.getBricks());
        PlayScene.updateLane2(lane2.getBricks());
        PlayScene.updateLane3(lane3.getBricks());
        PlayScene.updateLane4(lane4.getBricks());
        PlayScene.updateSelection(selectionToString());

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

        PlayScene.getBackToMenuButton1().setOnAction((event) -> {
            Window.setScene(MainMenu);
        });
        RuleScene.getBackToMenuButton2().setOnAction((event) -> {
            Window.setScene(MainMenu);
        });

        PlayScene.getUrnButton().setOnAction((event) -> {
            Brick b = Urn.draw();
            urnBrick.changeValue(b.getValue());
            selection.clear();
            selection.add(b.getValue());
            System.out.println(b.toString());
            PlayScene.updateSelection(selectionToString());
            PlayScene.changeCurrentbrick(b.getValue());
            PlayScene.getStatus().setText("Bricks in Urn: " + Urn.getLength());
        });

        PlayScene.getImageView().setOnMouseClicked((event) -> {
            int value = PlayScene.getCurrentBrickVal();
            urnBrick.changeValue(value);
            selection.clear();
            selection.add(urnBrick.getValue());
            PlayScene.updateSelection(selectionToString());
        });
        PlayScene.getAddLane1Button().setOnAction((event) -> {
            lane1.addBrick(new Brick(urnBrick.getValue()));
            PlayScene.updateLane1(lane1.getBricks());
        });
        PlayScene.getAddLane2Button().setOnAction((event) -> {
            lane2.addBrick(new Brick(urnBrick.getValue()));
            PlayScene.updateLane2(lane2.getBricks());
        });
        PlayScene.getAddLane3Button().setOnAction((event) -> {
            lane3.addBrick(new Brick(urnBrick.getValue()));
            PlayScene.updateLane3(lane3.getBricks());
        });
        PlayScene.getAddLane4Button().setOnAction((event) -> {
            lane4.addBrick(new Brick(urnBrick.getValue()));
            PlayScene.updateLane4(lane4.getBricks());
        });

        Window.setScene(MainMenu);
        Window.show();
    }

    public String selectionToString() {
        String str = "";
        if (selection.size() == 0) {
            str = "No Brick Selected";
        } else if (selection.size() == 1) {
            str = "" + selection.get(0);
        } else {
            for (int i = 0; i < selection.size(); i++) {
                str = str + ", " + selection.get(i);
            }
        }

        return str;
    }

}
