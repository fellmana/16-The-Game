--------------------------------------------------------------
16 The Game Rules 
--------------------------------------------------------------

Bricks:
----------------
In the game we have bricks that range from the values 1 to 16. We have 6 bricks of each value, which makes in total 96 bricks. 

Set up:
----------------
In the beginning all the 96 bricks are plased in a urn and after this they are individually taken out of the urn. This way we draw a random brick each time.

Lanes
----------------
 Then we have 4 "lanes" in which we can play the bricks. A brick drawn from the urn, can be placed in all lanes initially but after the initial placing, the moving of the bricks has to follow the rules of movement.

Rules of movement 
----------------
To move bricks or multiple brick the bricks have to be in order lets say we have bricks 5-4-3 on lane 1 and on lane 2 we have 16-13-6. In this case we can move 5-4-3 on top of the brick 6 on lane 2. In essense the bricks that are moved have to be in order from largest to smallest and there is not missing brick in between. for example if we have 8-7-5-4-3 this can no be moved on a 9 on another lane, because the brick 6 is missing. the brick 16 is the only brick that can after the initial placing be placed on a empty lane. 

Piles
----------------
The essence of the game is to get all the bricks in order in 6 different piles so that they are in the order 1-16. So if we have a pile with 4 on it we can place a 5 on it. The Goal of the game is to at the end have all 6 piles up to 16 and no bricks in play.





--------------------------------------------------------------
PROGRAM INSTRUCTIONS
--------------------------------------------------------------

Menu
----------------

In the main menu that open initialy you can chose between four different options
- New Game
	- Opens a new game that is in the start condition
- Load Game 
	- Opens gamewindow on the basis of a save game file
- Rules
	- Opens the rules of the game and instructions
- Exit
	- closes the application

Gamewindow
----------------
In the game window we have several different options. On the top there is the  option to go back to the main menu and to save current game.
Also in the top we have a label that keeps track of how many bricks there are in the urn.
Under the top options there is the 'Draw' button that draws from the urn the drawn brick is displayed on the side of 'draw' button.
In the middle of the gamewindow we have the 4 different lanes above each lane the is a 'add' button this button adds the currently selected bricks to the lane if it is allowed. On the right of the lanes the currently selected bricks are displayed. 


Making moves
----------------
To make a move you have to have a brick(s) selected. You can see your selected bricks under the selected bricks label. Once you have selected the bricks you what to move you can move the selection to another lane by pressing the add button or the corresponding hotkey. To add to the pile on top you just click on the pile and the move is made if legal.

Hot keys
----------------
- 'Enter', draws new brick from urn
- 'Shift', select the drawn urn brick
- ',' scroll to bottom of window
- '.' scroll to top of window
- '1', add current selection to lane 1 (if legal move)
- '2', add current selection to lane 2 (if legal move)
- '3', add current selection to lane 3 (if legal move)
- '4', add current selection to lane 4 (if legal move)















