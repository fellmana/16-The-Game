# Application Instruction

Download [jar](https://github.com/fellmana/ot-harjoitustyo/releases/tag/V1.0) 

to run the porogram run command 
`java -jar 16TheGame.jar`

## Menu
In the main menu that open initialy you can chose between four different options
1. New Game
	* Opens a new game that is in the start condition
1. Load Game 
	* Opens gamewindow on the basis of a save game file
1. Rules
	* Opens the rules of the game and instructions
1. Exit
	* closes the application

## Gamewindow
In the game window we have several different options. On the top there is the  option to go back to the main menu and to save current game.
Also in the top we have a label that keeps track of how many bricks there are in the urn.
Under the top options there is the 'Draw' button that draws from the urn the drawn brick is displayed on the side of 'draw' button.
In the middle of the gamewindow we have the 4 different lanes above each lane the is a 'add' button this button adds the currently selected bricks to the lane if it is allowed. On the right of the lanes the currently selected bricks are displayed. 

## Making moves

To make a move you have to have a brick(s) selected. You can see your selected bricks under the selected bricks label. Once you have selected the bricks you what to move you can move the selection to another lane by pressing the add button or the corresponding hotkey. To add to the pile on top you just click on the pile and the move is made if legal.


## Hot keys
1. 'Enter', draws new brick from urn
1. 'Shift', select the drawn urn brick
1. ',' scroll to bottom of window
1. '.' scroll to top of window
1. '1', add current selection to lane 1 (if legal move)
1. '2', add current selection to lane 2 (if legal move)
1. '3', add current selection to lane 3 (if legal move)
1. '4', add current selection to lane 4 (if legal move)


