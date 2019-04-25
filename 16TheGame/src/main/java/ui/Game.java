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
import javafx.event.EventHandler;
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
import javafx.scene.input.KeyEvent;
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
import thegame.logic.Gamelogic;

public class Game extends Application {

    private ArrayList<Integer> selection;
    private Brick urnBrick;
    private Urn Urn;
    private Lane lane1;
    private Lane lane2;
    private Lane lane3;
    private Lane lane4;

    public static void main(String[] args) {
        launch(Game.class);
    }
    
    @Override
    public void start(Stage Window) {
        Urn = new Urn();
        lane1 = new Lane();
        lane2 = new Lane();
        lane3 = new Lane();
        lane4 = new Lane();
        this.urnBrick = new Brick(0);
        this.selection = new ArrayList<>();

        //
        //  Setting up different scenes
        //
        MainMenu Menu = new MainMenu();
        RulesScene RuleScene = new RulesScene();
        PlayScene PlayScene = new PlayScene();

        Scene MainMenu = new Scene(Menu.buildMenu(), 1000, 900);
        Scene GameWindow = new Scene(PlayScene.build(), 900, 900);
        Scene Rules = new Scene(RuleScene.BuildScene(), 1000, 900);

        PlayScene.updateLane1(lane1.getBricks());
        PlayScene.updateLane2(lane2.getBricks());
        PlayScene.updateLane3(lane3.getBricks());
        PlayScene.updateLane4(lane4.getBricks());

        Menu.getNewGameButton().setOnAction((event) -> {
            Window.setScene(GameWindow);
            PlayScene.newGame();
            Urn = new Urn();
            Urn.InitializeUrn();
            PlayScene.getStatus().setText("Bricks in Urn: " + Urn.getLength());
            urnBrick = new Brick(0);
            PlayScene.changeCurrentbrick(urnBrick.getValue());
            PlayScene.updateDispSelection();
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

        PlayScene.getViewPile1().setOnMouseClicked((event) -> {
            System.out.println("Pile 1 clicked");
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                PlayScene.moveToPile(1);
                urnBrick = new Brick(0);
                PlayScene.changeCurrentbrick(urnBrick.getValue());
                PlayScene.updateDispSelection();
            } else {
                PlayScene.moveToPile(1);
            }
            if (PlayScene.logic.checkWin() == true) {
                PlayScene.Selection.setText("YOU WIN !");
                System.out.println("WIN WIN WIN");
            }
        });
        PlayScene.getViewPile2().setOnMouseClicked((event) -> {
            System.out.println("Pile 2 clicked");
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                PlayScene.moveToPile(2);
                urnBrick = new Brick(0);
                PlayScene.changeCurrentbrick(urnBrick.getValue());
                PlayScene.updateDispSelection();
            } else {
                PlayScene.moveToPile(2);
            }
            if (PlayScene.logic.checkWin() == true) {
                PlayScene.Selection.setText("YOU WIN !");
                System.out.println("WIN WIN WIN");
            }
        });
        PlayScene.getViewPile3().setOnMouseClicked((event) -> {
            System.out.println("Pile 3 clicked");
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                PlayScene.moveToPile(3);
                urnBrick = new Brick(0);
                PlayScene.changeCurrentbrick(urnBrick.getValue());
                PlayScene.updateDispSelection();
            } else {
                PlayScene.moveToPile(3);
            }
            if (PlayScene.logic.checkWin() == true) {
                PlayScene.Selection.setText("YOU WIN !");
                System.out.println("WIN WIN WIN");
            }
        });
        PlayScene.getViewPile4().setOnMouseClicked((event) -> {
            System.out.println("Pile 4 clicked");
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                PlayScene.moveToPile(4);
                urnBrick = new Brick(0);
                PlayScene.changeCurrentbrick(urnBrick.getValue());
                PlayScene.updateDispSelection();
            } else {
                PlayScene.moveToPile(4);
            }
            if (PlayScene.logic.checkWin() == true) {
                PlayScene.Selection.setText("YOU WIN !");
                System.out.println("WIN WIN WIN");
            }
        });
        PlayScene.getViewPile5().setOnMouseClicked((event) -> {
            System.out.println("Pile 5 clicked");
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                PlayScene.moveToPile(5);
                urnBrick = new Brick(0);
                PlayScene.changeCurrentbrick(urnBrick.getValue());
                PlayScene.updateDispSelection();
            } else {
                PlayScene.moveToPile(5);
            }
            if (PlayScene.logic.checkWin() == true) {
                PlayScene.Selection.setText("YOU WIN !");
                System.out.println("WIN WIN WIN");
            }
        });
        PlayScene.getViewPile6().setOnMouseClicked((event) -> {
            System.out.println("Pile 6 clicked");
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                PlayScene.moveToPile(6);
                urnBrick = new Brick(0);
                PlayScene.changeCurrentbrick(urnBrick.getValue());
                PlayScene.updateDispSelection();
            } else {
                PlayScene.moveToPile(6);
            }
            if (PlayScene.logic.checkWin() == true) {
                PlayScene.Selection.setText("YOU WIN !");
                System.out.println("WIN WIN WIN");
            }
        });

        PlayScene.getUrnButton().setOnAction((event) -> {
            if (urnBrick.getValue() == 0 && Urn.getLength() > 0) {

                Brick b = Urn.draw();
                urnBrick.changeValue(b.getValue());
                selection.clear();
                selection.add(b.getValue());
                System.out.println(b.toString());
                PlayScene.changeCurrentbrick(b.getValue());
                PlayScene.getStatus().setText("Bricks in Urn: " + Urn.getLength());
                PlayScene.logic.setSelection(b);
                PlayScene.updateDispSelection();
                PlayScene.setCurrentLaneInt(0);
                System.out.println("Current Lane set to: " + PlayScene.getCurrentLaneInt());
                PlayScene.logic.incrementMovesMade();
            }
        });

        PlayScene.getImageView().setOnMouseClicked((event) -> {
            System.out.println("Clicked current draw");
            int value = PlayScene.getCurrentBrickVal();
            System.out.println(value);
            urnBrick.changeValue(value);
            PlayScene.logic.setSelection(urnBrick);
            PlayScene.setCurrentLaneInt(0);
            PlayScene.updateDispSelection();
        });
        PlayScene.getAddLane1Button().setOnAction((event) -> {
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                if (urnBrick.getValue() != 0) {
                    PlayScene.logic.getLane(1).addBrick(new Brick(urnBrick.getValue()));
                    PlayScene.updateLane1(PlayScene.logic.getLane(1).getBricks());
                    urnBrick = new Brick(0);
                    PlayScene.changeCurrentbrick(urnBrick.getValue());
                    PlayScene.updateDispSelection();
                } else {
                    System.out.println("NO urn Brick!!");
                }

            } else {
                if (PlayScene.logic.isMoveLegal(1) == true) {
                    PlayScene.moveBricks(1);
                } else {
                    System.out.println("Illegal Move");
                }
            }

        });
        PlayScene.getAddLane2Button().setOnAction((event) -> {
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                if (urnBrick.getValue() != 0) {
                    PlayScene.logic.getLane(2).addBrick(new Brick(urnBrick.getValue()));
                    PlayScene.updateLane2(PlayScene.logic.getLane(2).getBricks());
                    urnBrick.changeValue(0);
                    PlayScene.changeCurrentbrick(urnBrick.getValue());
                    PlayScene.updateDispSelection();
                } else {
                    System.out.println("NO urn Brick!!");
                }

            } else {
                if (PlayScene.logic.isMoveLegal(2) == true) {
                    PlayScene.moveBricks(2);
                    PlayScene.updateDispSelection();
                } else {
                    System.out.println("Illegal Move");
                }
            }
        });
        PlayScene.getAddLane3Button().setOnAction((event) -> {
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                if (urnBrick.getValue() != 0) {
                    PlayScene.logic.getLane(3).addBrick(new Brick(urnBrick.getValue()));
                    PlayScene.updateLane3(PlayScene.logic.getLane(3).getBricks());
                    urnBrick.changeValue(0);
                    PlayScene.changeCurrentbrick(urnBrick.getValue());
                    PlayScene.updateDispSelection();
                } else {
                    System.out.println("NO urn Brick!!");
                }

            } else {
                if (PlayScene.logic.isMoveLegal(3) == true) {
                    PlayScene.moveBricks(3);
                    PlayScene.updateDispSelection();
                } else {
                    System.out.println("Illegal Move");
                }
            }
        });
        PlayScene.getAddLane4Button().setOnAction((event) -> {
            Integer fromLane = PlayScene.getCurrentLaneInt();
            if (fromLane == 0) {
                if (urnBrick.getValue() != 0) {
                    PlayScene.logic.getLane(4).addBrick(new Brick(urnBrick.getValue()));
                    PlayScene.updateLane4(PlayScene.logic.getLane(4).getBricks());
                    urnBrick.changeValue(0);
                    PlayScene.changeCurrentbrick(urnBrick.getValue());
                    PlayScene.updateDispSelection();
                } else {
                    System.out.println("NO urn Brick!!");
                }

            } else {
                if (PlayScene.logic.isMoveLegal(4) == true) {
                    PlayScene.moveBricks(4);
                    PlayScene.updateDispSelection();
                } else {
                    System.out.println("Illegal Move");
                }

            }
        });

        PlayScene.getSaveGameButton().setOnAction((event) -> {
            System.out.println("Lane1 Status: ");
            PlayScene.logic.getLane(1).printLane();
            System.out.println("Lane2 Status: ");
            PlayScene.logic.getLane(2).printLane();
            System.out.println("Lane3 Status: ");
            PlayScene.logic.getLane(3).printLane();
            System.out.println("Lane4 Status: ");
            PlayScene.logic.getLane(4).printLane();
            System.out.println("Selection: ");
            PlayScene.logic.getSelection().printLane();
            System.out.println("Number of moves made: " + PlayScene.logic.getMovesMade());
            //System.out.println("Urn");
            //System.out.println(Urn.toString());
        });

        GameWindow.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {

                    case DIGIT1:
                        Integer fromLane = PlayScene.getCurrentLaneInt();
                        if (fromLane == 0) {
                            if (urnBrick.getValue() != 0) {
                                PlayScene.logic.getLane(1).addBrick(new Brick(urnBrick.getValue()));
                                PlayScene.updateLane1(PlayScene.logic.getLane(1).getBricks());
                                urnBrick = new Brick(0);
                                PlayScene.changeCurrentbrick(urnBrick.getValue());
                                PlayScene.updateDispSelection();
                            } else {
                                System.out.println("NO urn Brick!!");
                            }

                        } else {
                            if (PlayScene.logic.isMoveLegal(1) == true) {
                                PlayScene.moveBricks(1);
                            } else {
                                System.out.println("Illegal Move");
                            }
                        }

                        break;

                    case DIGIT2:
                        Integer fromLane2 = PlayScene.getCurrentLaneInt();
                        if (fromLane2 == 0) {
                            if (urnBrick.getValue() != 0) {
                                PlayScene.logic.getLane(2).addBrick(new Brick(urnBrick.getValue()));
                                PlayScene.updateLane2(PlayScene.logic.getLane(2).getBricks());
                                urnBrick.changeValue(0);
                                PlayScene.changeCurrentbrick(urnBrick.getValue());
                                PlayScene.updateDispSelection();
                            } else {
                                System.out.println("NO urn Brick!!");
                            }

                        } else {
                            if (PlayScene.logic.isMoveLegal(2) == true) {
                                PlayScene.moveBricks(2);
                                PlayScene.updateDispSelection();
                            } else {
                                System.out.println("Illegal Move");
                            }
                        }
                        break;
                    case DIGIT3:
                        Integer fromLane3 = PlayScene.getCurrentLaneInt();
                        if (fromLane3 == 0) {
                            if (urnBrick.getValue() != 0) {
                                PlayScene.logic.getLane(3).addBrick(new Brick(urnBrick.getValue()));
                                PlayScene.updateLane3(PlayScene.logic.getLane(3).getBricks());
                                urnBrick.changeValue(0);
                                PlayScene.changeCurrentbrick(urnBrick.getValue());
                                PlayScene.updateDispSelection();
                            } else {
                                System.out.println("NO urn Brick!!");
                            }

                        } else {
                            if (PlayScene.logic.isMoveLegal(3) == true) {
                                PlayScene.moveBricks(3);
                                PlayScene.updateDispSelection();
                            } else {
                                System.out.println("Illegal Move");
                            }
                        }
                        break;
                    case DIGIT4:
                        Integer fromLane4 = PlayScene.getCurrentLaneInt();
                        if (fromLane4 == 0) {
                            if (urnBrick.getValue() != 0) {
                                PlayScene.logic.getLane(4).addBrick(new Brick(urnBrick.getValue()));
                                PlayScene.updateLane4(PlayScene.logic.getLane(4).getBricks());
                                urnBrick.changeValue(0);
                                PlayScene.changeCurrentbrick(urnBrick.getValue());
                                PlayScene.updateDispSelection();
                            } else {
                                System.out.println("NO urn Brick!!");
                            }

                        } else {
                            if (PlayScene.logic.isMoveLegal(4) == true) {
                                PlayScene.moveBricks(4);
                                PlayScene.updateDispSelection();
                            } else {
                                System.out.println("Illegal Move");
                            }

                        }
                        break;

                    case ENTER:
                        if (urnBrick.getValue() == 0 && Urn.getLength() > 0) {

                            Brick b = Urn.draw();
                            urnBrick.changeValue(b.getValue());
                            selection.clear();
                            selection.add(b.getValue());
                            System.out.println(b.toString());
                            PlayScene.changeCurrentbrick(b.getValue());
                            PlayScene.getStatus().setText("Bricks in Urn: " + Urn.getLength());
                            PlayScene.logic.setSelection(b);
                            PlayScene.updateDispSelection();
                            PlayScene.setCurrentLaneInt(0);
                            System.out.println("Current Lane set to: " + PlayScene.getCurrentLaneInt());
                            PlayScene.logic.incrementMovesMade();
                        }
                        break;
                    case SHIFT:
                        System.out.println("Clicked current draw");
                        int value = PlayScene.getCurrentBrickVal();
                        System.out.println(value);
                        urnBrick.changeValue(value);
                        PlayScene.logic.setSelection(urnBrick);
                        PlayScene.setCurrentLaneInt(0);
                        PlayScene.updateDispSelection();
                        break;
                    case PERIOD:
                        PlayScene.scrollUp();
                        break;
                    case COMMA:
                        PlayScene.scrollBottom();
                        break;

                }
            }
        });

        Window.setScene(MainMenu);

        Window.show();
    }

    public void newGame() {

    }

}
