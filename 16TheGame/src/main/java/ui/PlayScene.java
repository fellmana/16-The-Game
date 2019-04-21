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
import thegame.domain.Lane;
import thegame.logic.Gamelogic;

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
    int CurrentLane;
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
    int overlap;
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
    VBox dispSelection;

    VBox controls;

    Gamelogic logic;

    public PlayScene() {
        this.Bricksize = 80;
        this.BackToMenuButton1 = new Button("Main Menu");
        this.SaveGameButton = new Button("Save Game(status atm)");
        this.UrnButton = new Button("Draw");
        this.AddLane1Button = new Button("add");
        this.AddLane2Button = new Button("add");
        this.AddLane3Button = new Button("add");
        this.AddLane4Button = new Button("add");
        this.CurrentBrick = new Image(getClass().getResourceAsStream("/b0.png"));
        this.CurrentBrickVal = 0;
        this.CurrentLane = 0;
        this.overlap = -25;
        this.Pile1 = new Image(getClass().getResourceAsStream("/b0.png"));
        this.Pile2 = new Image(getClass().getResourceAsStream("/b0.png"));
        this.Pile3 = new Image(getClass().getResourceAsStream("/b0.png"));
        this.Pile4 = new Image(getClass().getResourceAsStream("/b0.png"));
        this.Pile5 = new Image(getClass().getResourceAsStream("/b0.png"));
        this.Pile6 = new Image(getClass().getResourceAsStream("/b0.png"));
        this.Status = new Label("Bricks in Urn: ");
        this.Selection = new Label("");
        this.GameWindowBox = new HBox();
        this.ControlBox = new HBox();
        this.GameWindowPanel = new BorderPane();
        this.logic = new Gamelogic();
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

        AddLane1Button.setPrefHeight(Bricksize * 1.02);
        AddLane1Button.setPrefWidth(Bricksize * 1.02);
        AddLane2Button.setPrefHeight(Bricksize * 1.02);
        AddLane2Button.setPrefWidth(Bricksize * 1.02);
        AddLane3Button.setPrefHeight(Bricksize * 1.02);
        AddLane3Button.setPrefWidth(Bricksize * 1.02);
        AddLane4Button.setPrefHeight(Bricksize * 1.02);
        AddLane4Button.setPrefWidth(Bricksize * 1.02);

        ControlBox.getChildren().add(UrnButton);
        ControlBox.getChildren().add(imageView);
        ControlBox.getChildren().add(spacer);
        ControlBox.getChildren().add(viewPile1);
        ControlBox.getChildren().add(viewPile2);
        ControlBox.getChildren().add(viewPile3);
        ControlBox.getChildren().add(viewPile4);
        ControlBox.getChildren().add(viewPile5);
        ControlBox.getChildren().add(viewPile6);
        ControlBox.setSpacing(10);
        ControlBox.setMargin(UrnButton, new Insets(0, 0, 0, 0));

        Lanes = new HBox();
        Lane1 = new VBox();
        Lane2 = new VBox();
        Lane3 = new VBox();
        Lane4 = new VBox();
        dispSelection = new VBox();

        Lane1.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));
        Lane2.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));
        Lane3.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));
        Lane4.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY)));

        Lane1.setSpacing(overlap);
        Lane2.setSpacing(overlap);
        Lane3.setSpacing(overlap);
        Lane4.setSpacing(overlap);

        Lanes.getChildren().add(Lane1);
        Lanes.getChildren().add(Lane2);
        Lanes.getChildren().add(Lane3);
        Lanes.getChildren().add(Lane4);
        Lanes.getChildren().add(dispSelection);
        Lanes.setSpacing(60);

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

    public void scrollUp() {
        scroll.setVvalue(0);
    }

    public void scrollBottom() {
        scroll.setVvalue(scroll.getVmax());
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
        logic.clearLane(1);
        System.out.println("-----UPDATE LANE1----");
        for (int i = 0; i < bricks.size(); i++) {
            Brick b = bricks.get(i);
            b.setLocation(1, i + 1);

            b.setOnAction((event) -> {
                System.out.println("----BRICK CLICKED----");
                int ind = b.getIndex();
                int lnb = b.getLanenum();
                System.out.println("Value of Clicked: " + b.getValue());
                System.out.println("Clicked lane: " + lnb);
                CurrentLane = lnb;
                System.out.println("Clicked Index: " + ind);
                System.out.println("Current Lane set to: " + CurrentLane);
                logic.updateSelectionFromLane(lnb, ind);
                System.out.println("Bricks in Selection:");
                updateDispSelection();
                logic.printSelection();
            });

            logic.addToLane(b, 1);
            Lane1.getChildren().add(bricks.get(i));
        }
    }

    public void updateLane2(ArrayList<Brick> bricks) {
        Lane2.getChildren().clear();
        Lane2.getChildren().add(AddLane2Button);
        logic.clearLane(2);
        System.out.println("-----UPDATE LANE2----");
        for (int i = 0; i < bricks.size(); i++) {
            Brick b = bricks.get(i);
            b.setLocation(2, i + 1);

            b.setOnAction((event) -> {
                System.out.println("----BRICK CLICKED----");
                int ind = b.getIndex();
                int lnb = b.getLanenum();
                System.out.println("Value of Clicked: " + b.getValue());
                System.out.println("Clicked lane: " + lnb);
                CurrentLane = lnb;
                System.out.println("Clicked Index: " + ind);
                System.out.println("Current Lane set to: " + CurrentLane);
                logic.updateSelectionFromLane(lnb, ind);
                System.out.println("Bricks in Selection:");
                updateDispSelection();
                logic.printSelection();
            });

            logic.addToLane(b, 2);
            Lane2.getChildren().add(bricks.get(i));
        }
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void updateLane3(ArrayList<Brick> bricks) {
        Lane3.getChildren().clear();
        Lane3.getChildren().add(AddLane3Button);
        logic.clearLane(3);
        System.out.println("-----UPDATE LANE3----");
        for (int i = 0; i < bricks.size(); i++) {
            Brick b = bricks.get(i);
            b.setLocation(3, i + 1);

            b.setOnAction((event) -> {
                System.out.println("----BRICK CLICKED----");
                int ind = b.getIndex();
                int lnb = b.getLanenum();
                System.out.println("Value of Clicked: " + b.getValue());
                System.out.println("Clicked lane: " + lnb);
                CurrentLane = lnb;
                System.out.println("Clicked Index: " + ind);
                System.out.println("Current Lane set to: " + CurrentLane);
                logic.updateSelectionFromLane(lnb, ind);
                System.out.println("Bricks in Selection:");
                updateDispSelection();
                logic.printSelection();
            });

            logic.addToLane(b, 3);
            Lane3.getChildren().add(bricks.get(i));
        }
    }

    public void updateLane4(ArrayList<Brick> bricks) {
        Lane4.getChildren().clear();
        Lane4.getChildren().add(AddLane4Button);
        logic.clearLane(4);
        System.out.println("-----UPDATE LANE4----");
        for (int i = 0; i < bricks.size(); i++) {
            Brick b = bricks.get(i);
            b.setLocation(4, i + 1);

            b.setOnAction((event) -> {
                System.out.println("----BRICK CLICKED----");
                int ind = b.getIndex();
                int lnb = b.getLanenum();
                System.out.println("Value of Clicked: " + b.getValue());
                System.out.println("Clicked lane: " + lnb);
                CurrentLane = lnb;
                System.out.println("Clicked Index: " + ind);
                System.out.println("Current Lane set to: " + CurrentLane);
                logic.updateSelectionFromLane(lnb, ind);
                System.out.println("Bricks in Selection:");
                updateDispSelection();
                logic.printSelection();
            });

            logic.addToLane(b, 4);
            Lane4.getChildren().add(bricks.get(i));
        }
    }

    public void updateDispSelection() {
        dispSelection.getChildren().clear();
        dispSelection.getChildren().add(new Label("Current Selection"));
        for (int i = 0; i < logic.getSelection().getLength(); i++) {
            Brick b = logic.getSelection().getBricks().get(i);
            int val = b.getValue();
            String file = "/b" + val + ".png";
            ImageView img = new ImageView();
            img.setImage(new Image(getClass().getResourceAsStream(file)));
            img.setFitHeight(80 * 0.8);
            img.setFitWidth(80 * 0.8);
            dispSelection.getChildren().add(img);
        }
    }

    public Integer getCurrentLaneInt() {
        return CurrentLane;
    }

    public void setCurrentLaneInt(Integer n) {
        CurrentLane = n;
    }

    public void moveBricks(Integer targetLane) {
        logic.incrementMovesMade();
        System.out.println("Lane to Add Bricks to: " + targetLane);
        logic.addSelectionToLane(targetLane);
        System.out.println("Current Chosen Lane: " + CurrentLane);
        logic.deleteFromLane(CurrentLane);
        logic.setSelection(new Brick(0));
        updateLane1(logic.getLane(1).getBricks());
        updateLane2(logic.getLane(2).getBricks());
        updateLane3(logic.getLane(3).getBricks());
        updateLane4(logic.getLane(4).getBricks());

    }

    public void moveToPile(Integer n) {
        int finval = logic.getSelection().getBricks().get(logic.getSelection().getLength() - 1).getValue();
        logic.incrementMovesMade();
        if (n == 1) {
            if (finval == logic.getPile1().getBricks().get(logic.getPile1().getLength() - 1).getValue() + 1) {
                for (int counter = logic.getSelection().getLength() - 1; counter >= 0; counter--) {
                    logic.getPile1().addBrick(logic.getSelection().getBricks().get(counter));
                }
                int topvalue = logic.getPile1().getBricks().get(logic.getPile1().getLength() - 1).getValue();
                String file = "/b" + topvalue + ".png";
                viewPile1.setImage(new Image(getClass().getResourceAsStream(file)));
                logic.deleteFromLane(CurrentLane);
                updateLane1(logic.getLane(1).getBricks());
                updateLane2(logic.getLane(2).getBricks());
                updateLane3(logic.getLane(3).getBricks());
                updateLane4(logic.getLane(4).getBricks());
                logic.setSelection(new Brick(0));
            }
        }
        if (n == 2) {
            if (finval == logic.getPile2().getBricks().get(logic.getPile2().getLength() - 1).getValue() + 1) {
                for (int counter = logic.getSelection().getLength() - 1; counter >= 0; counter--) {
                    logic.getPile2().addBrick(logic.getSelection().getBricks().get(counter));
                }
                int topvalue = logic.getPile2().getBricks().get(logic.getPile2().getLength() - 1).getValue();
                String file = "/b" + topvalue + ".png";
                viewPile2.setImage(new Image(getClass().getResourceAsStream(file)));
                logic.deleteFromLane(CurrentLane);
                updateLane1(logic.getLane(1).getBricks());
                updateLane2(logic.getLane(2).getBricks());
                updateLane3(logic.getLane(3).getBricks());
                updateLane4(logic.getLane(4).getBricks());
                logic.setSelection(new Brick(0));
            }
        }
        if (n == 3) {
            if (finval == logic.getPile3().getBricks().get(logic.getPile3().getLength() - 1).getValue() + 1) {
                for (int counter = logic.getSelection().getLength() - 1; counter >= 0; counter--) {
                    logic.getPile3().addBrick(logic.getSelection().getBricks().get(counter));
                }
                int topvalue = logic.getPile3().getBricks().get(logic.getPile3().getLength() - 1).getValue();
                String file = "/b" + topvalue + ".png";
                viewPile3.setImage(new Image(getClass().getResourceAsStream(file)));
                logic.deleteFromLane(CurrentLane);
                updateLane1(logic.getLane(1).getBricks());
                updateLane2(logic.getLane(2).getBricks());
                updateLane3(logic.getLane(3).getBricks());
                updateLane4(logic.getLane(4).getBricks());
                logic.setSelection(new Brick(0));
            }
        }
        if (n == 4) {
            if (finval == logic.getPile4().getBricks().get(logic.getPile4().getLength() - 1).getValue() + 1) {
                for (int counter = logic.getSelection().getLength() - 1; counter >= 0; counter--) {
                    logic.getPile4().addBrick(logic.getSelection().getBricks().get(counter));
                }
                int topvalue = logic.getPile4().getBricks().get(logic.getPile4().getLength() - 1).getValue();
                String file = "/b" + topvalue + ".png";
                viewPile4.setImage(new Image(getClass().getResourceAsStream(file)));
                logic.deleteFromLane(CurrentLane);
                updateLane1(logic.getLane(1).getBricks());
                updateLane2(logic.getLane(2).getBricks());
                updateLane3(logic.getLane(3).getBricks());
                updateLane4(logic.getLane(4).getBricks());
                logic.setSelection(new Brick(0));
            }
        }
        if (n == 5) {
            if (finval == logic.getPile5().getBricks().get(logic.getPile5().getLength() - 1).getValue() + 1) {
                for (int counter = logic.getSelection().getLength() - 1; counter >= 0; counter--) {
                    logic.getPile5().addBrick(logic.getSelection().getBricks().get(counter));
                }
                int topvalue = logic.getPile5().getBricks().get(logic.getPile5().getLength() - 1).getValue();
                String file = "/b" + topvalue + ".png";
                viewPile5.setImage(new Image(getClass().getResourceAsStream(file)));
                logic.deleteFromLane(CurrentLane);
                updateLane1(logic.getLane(1).getBricks());
                updateLane2(logic.getLane(2).getBricks());
                updateLane3(logic.getLane(3).getBricks());
                updateLane4(logic.getLane(4).getBricks());
                logic.setSelection(new Brick(0));
            }
        }
        if (n == 6) {
            if (finval == logic.getPile6().getBricks().get(logic.getPile6().getLength() - 1).getValue() + 1) {
                for (int counter = logic.getSelection().getLength() - 1; counter >= 0; counter--) {
                    logic.getPile6().addBrick(logic.getSelection().getBricks().get(counter));
                }
                int topvalue = logic.getPile6().getBricks().get(logic.getPile6().getLength() - 1).getValue();
                String file = "/b" + topvalue + ".png";
                viewPile6.setImage(new Image(getClass().getResourceAsStream(file)));
                logic.deleteFromLane(CurrentLane);
                updateLane1(logic.getLane(1).getBricks());
                updateLane2(logic.getLane(2).getBricks());
                updateLane3(logic.getLane(3).getBricks());
                updateLane4(logic.getLane(4).getBricks());
                logic.setSelection(new Brick(0));
            }
        }
    }

    public ImageView getViewPile1() {
        return viewPile1;
    }

    public ImageView getViewPile2() {
        return viewPile2;
    }

    public ImageView getViewPile3() {
        return viewPile3;
    }

    public ImageView getViewPile4() {
        return viewPile4;
    }

    public ImageView getViewPile5() {
        return viewPile5;
    }

    public ImageView getViewPile6() {
        return viewPile6;
    }

    public void newGame() {
        logic = new Gamelogic();
        updateLane1(logic.getLane(1).getBricks());
        updateLane2(logic.getLane(2).getBricks());
        updateLane3(logic.getLane(3).getBricks());
        updateLane4(logic.getLane(4).getBricks());
        int topvalue = logic.getPile1().getBricks().get(logic.getPile1().getLength() - 1).getValue();
        String file = "/b" + topvalue + ".png";
        viewPile1.setImage(new Image(getClass().getResourceAsStream(file)));
        int topvalue2 = logic.getPile2().getBricks().get(logic.getPile2().getLength() - 1).getValue();
        String file2 = "/b" + topvalue2 + ".png";
        viewPile1.setImage(new Image(getClass().getResourceAsStream(file2)));
        int topvalue3 = logic.getPile3().getBricks().get(logic.getPile3().getLength() - 1).getValue();
        String file3 = "/b" + topvalue3 + ".png";
        viewPile1.setImage(new Image(getClass().getResourceAsStream(file3)));
        int topvalue4 = logic.getPile4().getBricks().get(logic.getPile4().getLength() - 1).getValue();
        String file4 = "/b" + topvalue4 + ".png";
        viewPile1.setImage(new Image(getClass().getResourceAsStream(file4)));
        int topvalue5 = logic.getPile5().getBricks().get(logic.getPile5().getLength() - 1).getValue();
        String file5 = "/b" + topvalue5 + ".png";
        viewPile1.setImage(new Image(getClass().getResourceAsStream(file5)));
        int topvalue6 = logic.getPile6().getBricks().get(logic.getPile6().getLength() - 1).getValue();
        String file6 = "/b" + topvalue6 + ".png";
        viewPile1.setImage(new Image(getClass().getResourceAsStream(file6)));
    }

}
