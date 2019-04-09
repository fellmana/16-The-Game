/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import thegame.domain.Brick;

/**
 *
 * @author afellman
 */
public class PlayScene {

    Button BackToMenuButton1;
    Button SaveGameButton;
    Button UrnButton;
    Button AddLane1Button;
    Button AddLane2Button;
    Button AddLane3Button;
    Button AddLane4Button;

    Image CurrentBrick;
    int CurrentBrickVal;
    Image Pile1;
    Image Pile2;
    Image Pile3;
    Image Pile4;
    Image Pile5;
    Image Pile6;
    Label Status;
    Label Selection;
    HBox GameWindowBox;
    HBox ControlBox;
    BorderPane GameWindowPanel;
    ScrollPane scroll;
    int Bricksize;
    ImageView imageView;
    ImageView viewPile1;
    ImageView viewPile2;
    ImageView viewPile3;
    ImageView viewPile4;
    ImageView viewPile5;
    ImageView viewPile6;

    HBox Lanes;
    VBox Lane1;
    VBox Lane2;
    VBox Lane3;
    VBox Lane4;

    VBox controls;

    public PlayScene() {
        this.Bricksize = 80;
        this.BackToMenuButton1 = new Button("Main Menu");
        this.SaveGameButton = new Button("Save Game");
        this.UrnButton = new Button("Draw");
        this.AddLane1Button = new Button("add");
        this.AddLane2Button = new Button("add");
        this.AddLane3Button = new Button("add");
        this.AddLane4Button = new Button("add");
        this.CurrentBrick = new Image(getClass().getResourceAsStream("/blanck.png"));
        this.CurrentBrickVal = 0;
        this.Pile1 = new Image(getClass().getResourceAsStream("/blanck.png"));
        this.Pile2 = new Image(getClass().getResourceAsStream("/blanck.png"));
        this.Pile3 = new Image(getClass().getResourceAsStream("/blanck.png"));
        this.Pile4 = new Image(getClass().getResourceAsStream("/blanck.png"));
        this.Pile5 = new Image(getClass().getResourceAsStream("/blanck.png"));
        this.Pile6 = new Image(getClass().getResourceAsStream("/blanck.png"));
        this.Status = new Label("Bricks in Urn: ");
        this.Selection = new Label("Selected Bricks: ");
        this.GameWindowBox = new HBox();
        this.ControlBox = new HBox();
        this.GameWindowPanel = new BorderPane();
    }

    public Button getAddLane1Button() {
        return AddLane1Button;
    }

    public Button getAddLane2Button() {
        return AddLane2Button;
    }

    public Button getAddLane3Button() {
        return AddLane3Button;
    }

    public Button getAddLane4Button() {
        return AddLane4Button;
    }

    public Button getBackToMenuButton1() {
        return BackToMenuButton1;
    }

    public Button getSaveGameButton() {
        return SaveGameButton;
    }

    public Button getUrnButton() {
        return UrnButton;
    }

    public Image getCurrentBrick() {
        return CurrentBrick;
    }

    public Image getPile1() {
        return Pile1;
    }

    public Image getPile2() {
        return Pile2;
    }

    public Image getPile3() {
        return Pile3;
    }

    public Image getPile4() {
        return Pile4;
    }

    public Image getPile5() {
        return Pile5;
    }

    public Image getPile6() {
        return Pile6;
    }

    public Label getStatus() {
        return Status;
    }

    public HBox getGameWindowBox() {
        return GameWindowBox;
    }

    public HBox getControlBox() {
        return ControlBox;
    }

    public BorderPane getGameWindowPanel() {
        return GameWindowPanel;
    }

    public ScrollPane build() {
        //
        //  URN BUTTON SET UP
        //
        UrnButton.setPrefHeight(100);
        UrnButton.setPrefWidth(100);
        UrnButton.setStyle(String.format("-fx-font-size: %dpx;", (int) (0.4 * 50)));

        //
        //  GAMEWINDOWBOX SETUP
        //
        GameWindowBox.getChildren().add(BackToMenuButton1);
        GameWindowBox.getChildren().add(SaveGameButton);
        GameWindowBox.getChildren().add(Status);
        GameWindowBox.getChildren().add(Selection);
        GameWindowBox.setSpacing(5);
        GameWindowBox.setAlignment(Pos.TOP_LEFT);

        imageView = new ImageView(CurrentBrick);
        imageView.setFitHeight(Bricksize * 1.2);
        imageView.setFitWidth(Bricksize * 1.2);

        viewPile1 = new ImageView(Pile1);
        viewPile1.setFitHeight(Bricksize);
        viewPile1.setFitWidth(Bricksize);

        viewPile2 = new ImageView(Pile2);
        viewPile2.setFitHeight(Bricksize);
        viewPile2.setFitWidth(Bricksize);

        viewPile3 = new ImageView(Pile3);
        viewPile3.setFitHeight(Bricksize);
        viewPile3.setFitWidth(Bricksize);

        viewPile4 = new ImageView(Pile4);
        viewPile4.setFitHeight(Bricksize);
        viewPile4.setFitWidth(Bricksize);

        viewPile5 = new ImageView(Pile5);
        viewPile5.setFitHeight(Bricksize);
        viewPile5.setFitWidth(Bricksize);

        viewPile6 = new ImageView(Pile6);
        viewPile6.setFitHeight(Bricksize);
        viewPile6.setFitWidth(Bricksize);

        Label spacer = new Label("");

        AddLane1Button.setPrefHeight(Bricksize * 0.8);
        AddLane1Button.setPrefWidth(Bricksize * 0.8);
        AddLane2Button.setPrefHeight(Bricksize * 0.8);
        AddLane2Button.setPrefWidth(Bricksize * 0.8);
        AddLane3Button.setPrefHeight(Bricksize * 0.8);
        AddLane3Button.setPrefWidth(Bricksize * 0.8);
        AddLane4Button.setPrefHeight(Bricksize * 0.8);
        AddLane4Button.setPrefWidth(Bricksize * 0.8);

        ControlBox.getChildren().add(UrnButton);
        ControlBox.getChildren().add(imageView);
        ControlBox.getChildren().add(spacer);
        ControlBox.getChildren().add(viewPile1);
        ControlBox.getChildren().add(viewPile2);
        ControlBox.getChildren().add(viewPile3);
        ControlBox.getChildren().add(viewPile4);
        ControlBox.getChildren().add(viewPile5);
        ControlBox.getChildren().add(viewPile6);
        ControlBox.setSpacing(40);
        ControlBox.setMargin(UrnButton, new Insets(0, 0, 0, 0));

        Lanes = new HBox();
        Lane1 = new VBox();
        Lane2 = new VBox();
        Lane3 = new VBox();
        Lane4 = new VBox();

        Lane1.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));
        Lane2.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));
        Lane3.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));
        Lane4.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));

        Lanes.getChildren().add(Lane1);
        Lanes.getChildren().add(Lane2);
        Lanes.getChildren().add(Lane3);
        Lanes.getChildren().add(Lane4);
        Lanes.setSpacing(100);

        controls = new VBox();
        controls.getChildren().add(GameWindowBox);
        controls.getChildren().add(ControlBox);

        GameWindowPanel.setTop(controls);
        GameWindowPanel.setCenter(Lanes);

        GameWindowPanel.setMargin(GameWindowBox, new Insets(5, 5, 5, 5));
        GameWindowPanel.setMargin(Lanes, new Insets(50, 50, 50, 50));



        VBox scrollBox = new VBox();
        scrollBox.getChildren().add(GameWindowPanel);

        scroll = new ScrollPane(scrollBox);

        return scroll;
    }

    public void changeCurrentbrick(int val) {
        this.CurrentBrickVal = val;
        String file = "/b" + val + ".png";
        System.out.println(file);
        imageView.setImage(new Image(getClass().getResourceAsStream(file)));
    }

    public int getCurrentBrickVal() {
        return CurrentBrickVal;
    }

    public void updateLane1(ArrayList<Brick> bricks) {
        Lane1.getChildren().clear();
        Lane1.getChildren().add(AddLane1Button);
        for (int i = 0; i < bricks.size(); i++) {
            int valueOfBrick = bricks.get(i).getValue();
            String file = "/b" + valueOfBrick + ".png";
            Image brickimage = new Image(getClass().getResourceAsStream(file));
            ImageView imgV = new ImageView(brickimage);
            imgV.setFitHeight(Bricksize * 0.8);
            imgV.setFitWidth(Bricksize * 0.8);
            Lane1.getChildren().add(imgV);
        }
    }

    public void updateLane2(ArrayList<Brick> bricks) {
        Lane2.getChildren().clear();
        Lane2.getChildren().add(AddLane2Button);
        for (int i = 0; i < bricks.size(); i++) {
            int valueOfBrick = bricks.get(i).getValue();
            String file = "/b" + valueOfBrick + ".png";
            Image brickimage = new Image(getClass().getResourceAsStream(file));
            ImageView imgV = new ImageView(brickimage);
            imgV.setFitHeight(Bricksize * 0.8);
            imgV.setFitWidth(Bricksize * 0.8);
            Lane2.getChildren().add(imgV);
        }
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void updateLane3(ArrayList<Brick> bricks) {
        Lane3.getChildren().clear();
        Lane3.getChildren().add(AddLane3Button);
        for (int i = 0; i < bricks.size(); i++) {
            int valueOfBrick = bricks.get(i).getValue();
            String file = "/b" + valueOfBrick + ".png";
            Image brickimage = new Image(getClass().getResourceAsStream(file));
            ImageView imgV = new ImageView(brickimage);
            imgV.setFitHeight(Bricksize * 0.8);
            imgV.setFitWidth(Bricksize * 0.8);
            Lane3.getChildren().add(imgV);
        }
    }

    public void updateLane4(ArrayList<Brick> bricks) {
        Lane4.getChildren().clear();
        Lane4.getChildren().add(AddLane4Button);
        for (int i = 0; i < bricks.size(); i++) {
            int valueOfBrick = bricks.get(i).getValue();
            String file = "/b" + valueOfBrick + ".png";
            Image brickimage = new Image(getClass().getResourceAsStream(file));
            ImageView imgV = new ImageView(brickimage);
            imgV.setFitHeight(Bricksize * 0.8);
            imgV.setFitWidth(Bricksize * 0.8);
            Lane4.getChildren().add(imgV);
        }
    }

    public void updateSelection(String str) {
        this.Selection.setText("Selected Bricks: " + str);
    }

}
