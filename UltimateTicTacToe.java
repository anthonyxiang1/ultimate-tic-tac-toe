//Authors: Noah Kniesly and Anthony Xiang          
//UltimateTicTacToe.java
//Ultimate tic tac toe standalone

//import all necessary classes  
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.JLabel;
import java.util.Arrays;
import java.util.EventListener;
import java.util.Timer;
import java.util.TimerTask;
  
public class UltimateTicTacToe extends JPanel
{
                                                            //define all variables
  private JButton[][][] theArray;
  private int[] arrayForA;
  private JPanel two, sub1,sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9;
  private JLabel characterStr, timerStr;
  private int character, result1, result2, result3;
  private static int interval;              // create variables for the timer
  private static Timer timer;       
  
  

  public UltimateTicTacToe()
  {                                        //set up all panels and their gridlayouts
     character = 0;
     result1 = 0;
     interval = 11;                                         // set the interval for counting down the time
     characterStr = new JLabel("X TURN");                     // create the label telling who's turn it is
     timerStr = new JLabel("10");               //set original time
     two = new JPanel();
     sub1 = new JPanel ();
     sub2 = new JPanel ();
     sub3 = new JPanel ();
     sub4 = new JPanel ();
     sub5 = new JPanel ();
     sub6 = new JPanel ();
     sub7 = new JPanel ();
     sub8 = new JPanel ();
     sub9 = new JPanel ();
     sub1.setLayout(new GridLayout(3, 3));                //set gridlayout
     sub2.setLayout(new GridLayout(3, 3));
     sub3.setLayout(new GridLayout(3, 3));
     sub4.setLayout(new GridLayout(3, 3));
     sub5.setLayout(new GridLayout(3, 3));
     sub6.setLayout(new GridLayout(3, 3));
     sub7.setLayout(new GridLayout(3, 3));
     sub8.setLayout(new GridLayout(3, 3));
     sub9.setLayout(new GridLayout(3, 3));

  //**********************************  
                                                              //create array
    theArray = new JButton[9][3][3];                    // create the entire grid
    arrayForA = new int[9];                             // create a tracker for each box
    //************************************
    //for loops that create all the buttons, adds actionListeners to each one, sets backgoround of each one to green, sets the buttons opaque 
    //and adds the buttons to the subpanel
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
         theArray[0][x][y]  = new JButton("-") ;
         theArray[0][x][y].addActionListener (new ButtonListener());
         theArray[0][x][y].setBackground(Color.green);
         theArray[0][x][y].setOpaque(true);
         sub1.add(theArray[0][x][y]);
      }
    }
    //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
          theArray[1][x][y]  = new JButton("-") ;
          theArray[1][x][y].addActionListener (new ButtonListener());
          theArray[1][x][y].setBackground(Color.green);
          theArray[1][x][y].setOpaque(true);
          sub2.add(theArray[1][x][y]);
      }
    }
    //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
          theArray[2][x][y]  = new JButton("-") ;
          theArray[2][x][y].addActionListener (new ButtonListener());
          theArray[2][x][y].setBackground(Color.green);
          theArray[2][x][y].setOpaque(true);
          sub3.add(theArray[2][x][y]);
      }
    }
    //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
          theArray[3][x][y]  = new JButton("-") ;
          theArray[3][x][y].setBackground(Color.green);
          theArray[3][x][y].addActionListener (new ButtonListener());
          theArray[3][x][y].setOpaque(true);
          sub4.add(theArray[3][x][y]);
      }
    }
    //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
          theArray[4][x][y]  = new JButton("-") ;
          theArray[4][x][y].setBackground(Color.green);
          theArray[4][x][y].addActionListener (new ButtonListener());
          theArray[4][x][y].setOpaque(true);
          sub5.add(theArray[4][x][y]);
      }
    }
   //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
          theArray[5][x][y]  = new JButton("-") ;
          theArray[5][x][y].setBackground(Color.green);
          theArray[5][x][y].addActionListener (new ButtonListener());
          theArray[5][x][y].setOpaque(true);
          sub6.add(theArray[5][x][y]);
      }
    }
    //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
           theArray[6][x][y]  = new JButton("-") ;
           theArray[6][x][y].setBackground(Color.green);
           theArray[6][x][y].addActionListener (new ButtonListener());
           theArray[6][x][y].setOpaque(true);
           sub7.add(theArray[6][x][y]);
      }
    }
    //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
          theArray[7][x][y]  = new JButton("-") ;
          theArray[7][x][y].setBackground(Color.green);
          theArray[7][x][y].addActionListener (new ButtonListener());
          theArray[7][x][y].setOpaque(true);
          sub8.add(theArray[7][x][y]);
      }
    }
    //***
    for ( int x = 0; x< 3; x++)
    {
      for (int y = 0; y < 3; y++)
      {
          theArray[8][x][y]  = new JButton("-") ;
          theArray[8][x][y].setBackground(Color.green);
          theArray[8][x][y].addActionListener (new ButtonListener());
          theArray[8][x][y].setOpaque(true);
          sub9.add(theArray[8][x][y]);
      }
    }
    //*****************************
    //sets up main panel by adding each subpanel to two and adds that panel and the label to the main panel
     two.setLayout(new GridLayout (3,3,15,15));
     two.add(sub1);
     two.add(sub2);
     two.add(sub3);
     two.add(sub4);
     two.add(sub5);
     two.add(sub6);
     two.add(sub7);
     two.add(sub8);
     two.add(sub9);
     add(characterStr);
     add(timerStr);
     add(two);
    //sets up size and color of the panel
    setPreferredSize (new Dimension(700, 400));
    setBackground (Color.cyan); 
  }
  
  
  //ButtonListener class
    private class ButtonListener implements ActionListener
   {
//method that returns that placement of the button that was pressed
      public JButton getButtonPlace (ActionEvent event)
      { 
        JButton result = theArray[1][1][1];    // default array placement
        
        for (int c = 0; c <= 2; c++)
        {
          for (int b = 0; b <= 2; b++)
           {
              for(int a = 0; a < 9; a ++)
                if(event.getSource() == theArray[a][b][c])
              {
                result =  theArray[a][b][c];
              }
        }}
        return result;
      }
//**********************   
      //method that returns the box that the next player must play to based on where the previous player went
      public int ChangeToA (ActionEvent event)
      {
        if (result2 == 0 && result3 == 0)       // if b and c were the middle, 1 and 1, then result1 would be the middle of the boxes, 4
          result1 = 0;
        if (result2 == 0 && result3 == 1)
          result1 = 1;
        if (result2 == 0 && result3 == 2)
          result1 = 2;
        if (result2 == 1 && result3 == 0)
          result1 = 3;
        if (result2 == 1 && result3 == 1)
          result1 = 4;
        if (result2 == 1 && result3 == 2)
          result1 = 5;
        if (result2 == 2 && result3 == 0)
          result1 = 6;
        if (result2 == 2 && result3 == 1)
          result1 = 7;
        if (result2 == 2 && result3 == 2)
          result1 = 8;
        
        return result1;
      }
      
     //******************************************************************       3 getBox's 
      //returns the box of the button clicked
      public int getBox (ActionEvent event)
      {
        int result = 0;
        for (int c = 0; c <= 2; c++)
        {
          for (int b = 0; b <= 2; b++)
           {
             for(int a = 0; a <9; a ++)
                if(event.getSource() == theArray[a][b][c])   
                 result =  a;
         }}
        return result;
      }
   //*************************   
      //returns the row of the box clicked
      public int getRow (ActionEvent event)
      {
        int result = 0;
        for (int c = 0; c <= 2; c++)
          {
            for (int b = 0; b <= 2; b++)
             {
               for(int a = 0; a <9; a ++)
                 if(event.getSource() == theArray[a][b][c])
                  result = b;
        }}
        return result;
      }
      //***********************
      //returns the column of the box clicked
      public int getCol (ActionEvent event)
      {
        int result = 0;
        for (int c = 0; c <= 2; c++)
          {
            for (int b = 0; b <= 2; b++)
             {
               for(int a = 0; a <9; a ++)
                 if(event.getSource() == theArray[a][b][c])
                  result = c;
         }}
        return result;
      }
      //************************************************
       //sets the label to X-turn if character is divisible by two and O-turn if character is not divisible by 2
      public String setChar (int character)
      {
        String text = "";
  
        if (character % 2 == 0)             // after putting down the a value, change the side text to display the other person's turn
        {
          text = ("x");
          characterStr.setText("O TURN");
        }
        
        if (character % 2 == 1)
        {
          text = ("o");
          characterStr.setText("X TURN");
        }
        
        return text;
        }
      //***********************
      //sets the color of the box that the next player must go to red
      public void toRed (ActionEvent event)
      {
        for (int c = 0; c <= 2; c++)
          {
            for (int b = 0; b <= 2; b++)
             {
                for(int a = 0; a <9; a ++)
                  if (arrayForA[a] == 0)                     // if a box hasn't been won, then reset their color
                   {
                     theArray[a][b][c].setBackground(null);
                     theArray[a][b][c].setOpaque(true);
          }}}
            
         for ( int x = 0; x< 3; x++)
           {
             for (int y = 0; y < 3; y++)
               if (arrayForA[ChangeToA(event)] == 0)            // if sending to an unwon box, change that box to red
               {
                 theArray[ChangeToA(event)][x][y].setBackground(Color.RED);
                 theArray[ChangeToA(event)][x][y].setOpaque(true);
        }}
      }
      
      // tests the winner of a single box.
      public boolean boxWinner (ActionEvent event)
      {
        int Xcount = 0;
        int Ocount = 0;
        boolean result = false; 
        int a = getBox(event);
        int b = getRow(event);
        int c = getCol(event);
        // horizontals -- test if the last thing put down made any complete row and won the grid
            if (theArray[a][b][0].getText().equals(theArray[a][b][1].getText()) && theArray[a][b][1].getText().equals(theArray[a][b][2].getText()))
            {
               result = true;                                 // signifies that there is a box winner
               
              if (theArray[a][b][c].getText() == "x")          // sees whether x or o won that box
              XWins(event);
              else
              OWins(event);

            }
       //verticals -- test if the last thing put down made any complete column and won the grid
            if (theArray[a][0][c].getText().equals(theArray[a][1][c].getText()) && theArray[a][1][c].getText().equals(theArray[a][2][c].getText()))
            {
              result = true;
              
              if (theArray[a][b][c].getText() == "x")            
              XWins(event);
              else
              OWins(event);

            }
            //diagonal 1 -- tests one case of a diagonal for the box where the last thing put down was
            if (theArray[a][0][0].getText().equals(theArray[a][1][1].getText()) && theArray[a][1][1].getText().equals(theArray[a][2][2].getText())&&theArray[a][1][1].getText() != "-")
            {
              result = true;
              
              if (theArray[a][b][c].getText() == "x")                
              XWins(event);
              else
              OWins(event);

            }
            //diagonal 2 -- tests the other case of a diagonal for the box where the last thing put down was
            if (theArray[a][0][2].getText().equals(theArray[a][1][1].getText()) && theArray[a][1][1].getText().equals(theArray[a][2][0].getText())&&theArray[a][1][1].getText()!= "-")
            {
              result = true;
              
              if (theArray[a][b][c].getText() == "x")      
              XWins(event);
              else
              OWins(event);
            }
              
            for (int y = 0; y < 3;y++)                  // add the number of x's and o's for the box that the last thing was put in
              {
                for (int z = 0;z<3;z++)
                {
                  if (theArray[a][y][z].getText() == "x")
                    Xcount++;
                  if (theArray[a][y][z].getText() == "o")
                    Ocount++;
                }
              }
            
            if (Ocount + Xcount == 9 && Xcount > Ocount)           // if there is no winner, and the box is filled, then grant the win to the largest number of x or o
              XWins(event);
            if (Ocount + Xcount == 9 && Ocount > Xcount)
              OWins(event);
          
        return result;
      }
      //************************   Win Scenarios
      public void XWins (ActionEvent event)           
      {
        int a = getBox(event);
        arrayForA[a] = 1;                                   // set that box as a 1 to represent x won it
        
        
        for (int b = 0; b < 3; b++)                        // disable all of the unused buttons in that won box
        {
          for (int c = 0; c < 3; c++)
          {
            theArray[a][b][c].setBackground(null);
            theArray[a][b][c].setEnabled(false);
            
            if ((b+c) % 2 == 0)                               // create the color pattern to visually represent a win for x
            {
              theArray[a][b][c].setBackground(Color.BLACK);
              theArray[a][b][c].setOpaque(true);
            }}}}
      
      public void OWins (ActionEvent event)             
      {
        int a = getBox(event);
        arrayForA[a] = 2;                              // set that box as a 2 to represent o won it
        
        for ( int b = 0; b < 3;b++)                  
        {
          for (int c = 0; c < 3; c++)                      // disable all of the unused buttons in that won box
           {
             theArray[a][b][c].setBackground(null);
             theArray[a][b][c].setEnabled(false);
        
             if (theArray[a][b][c] != theArray[a][1][1])            // create the color pattern to visually represent a win for o
             {
               theArray[a][b][c].setBackground(Color.BLACK);
               theArray[a][b][c].setOpaque(true);
             }}}}
      
      public boolean gridGreen (ActionEvent event)
      {
        boolean result = false;
        int a = getBox(event);
        
        if (arrayForA[ChangeToA(event)] != 0)                 // if a user picked a button that led to a won box, 
        {
          result = true;
           
          for (int x = 0; x < 9;x++)                   // make everything except won boxes green, signifying that anywhere on the grid is free to play
          {
            for ( int y = 0; y < 3;y++)
             {
               for (int z = 0; z < 3; z++)
                {
                 if (arrayForA[x] == 0)
                 theArray[x][y][z].setBackground(Color.green);
               }}}}
        return result;
      }
      
      public boolean trueWinner (ActionEvent event)                        // tests if there's a winner for the board, ends the game if so
      {
        boolean win = false;
                                                                                     // horizontals   0,1,2 or 3,4,5  or 6,7,8
        for (int a = 0; a < 7; a = a + 3){
            if (arrayForA[a] == arrayForA[a+1] && arrayForA[a] == arrayForA[a+2] && arrayForA[a] != 0)
                {
                   win = true;                           // signify that there is a winner of the board
                    
                  if (arrayForA[a] == 1)                        // set that the winner is x or o
                    characterStr.setText("X WINS");
                  
                  if (arrayForA[a] == 2)
                    characterStr.setText("O WINS");
            }}
                                                                                     // vertical  0,3,6  or  1,4,7   or 2,5,8
            for (int b = 0; b < 3; b++){
            if (arrayForA[b] == arrayForA[b+3] && arrayForA[b] == arrayForA[b+6] && arrayForA[b] != 0) 
              {
                   win = true;
                   
                 if (arrayForA[b] == 1)
                    characterStr.setText("X WINS");

                 if (arrayForA[b] == 2)
                    characterStr.setText("O WINS");
            }}
                                                                                    // diagonal 1    0,4,8
            if (arrayForA[0] == arrayForA[4] && arrayForA[0] == arrayForA[8] && arrayForA[0] != 0)
              {
                   win = true;
                   
                 if (arrayForA[0] == 1)
                    characterStr.setText("X WINS");
                 
                 if (arrayForA[0] == 2)
                    characterStr.setText("O WINS");
              }
                                                                                    // diagonal 2     2,4,6
            if (arrayForA[2] == arrayForA[4] && arrayForA[2] == arrayForA[6] && arrayForA[2] != 0)
              {
                win = true;
                
                if (arrayForA[2] == 1)
                 characterStr.setText("X WINS");
                
                 
                if (arrayForA[2] == 2)
                  characterStr.setText("O WINS");
                
              }
                                                                      // if there is a winner, disable the whole board
            if (characterStr.getText() == "O WINS" || characterStr.getText() == "X WINS")
               disableAll(event);
            
            return win;                                                         // return true if there's a winner
      }
      
      public boolean noWinnerWin (ActionEvent event)   // for when there is no legitimate winner, but a winner based on number of won boxes
      {
        boolean win = false;
        int Xcount = 0;
        int Ocount = 0;
        
        for (int a = 0; a < 9; a++)          // count the number of x and o boxes won
        {
          if (arrayForA[a] == 1)
            Xcount++;
          
          if (arrayForA[a] == 2)
            Ocount++;
        }
        
        if (Xcount + Ocount == 9 && Xcount > Ocount)             // if all boxes are filled and x has more, 
            {
              win = true;                                // show that there is a winner
              characterStr.setText("X WINS");            // set that x wins
              disableAll(event);                         // disable everything
            }
            if (Xcount + Ocount == 9 && Ocount > Xcount)
             {
              win = true;
              characterStr.setText("O WINS");
              disableAll(event);
            }
        
            return win;        // return if there's a winner
      }
        
            
       // disables the whole board
      public void disableAll (ActionEvent event)
      {
        
        for (int a = 0; a < 9; a++)
         {
          for (int b = 0; b <= 2; b++)
           {
             for(int c = 0; c <= 2; c ++)
              {
               if (arrayForA[a] ==0)
                 theArray[a][b][c].setBackground(null);
               if(arrayForA[a]== 1)
                 XWins(event);
               if(arrayForA[a] ==2)
                 OWins(event);
                 theArray[a][b][c].setEnabled(false);
        }}}
      }
      
      public void createTimer ()           // make a timer 
      {
        timer = new Timer();
        interval = 11;

        timer.scheduleAtFixedRate(new TimerTask() {       // every second, run this      

            public void run() {
                timerStr.setText("" + countdown());    
              if(interval == 0)
                characterStr.setText(setChar(character).toUpperCase() + " TURN");   // if timer runs out, show a switched turn
            }
        }, 0, 1000);                         // set delay as 0, so counts down automatically, period 1 second
    }
    private int countdown() {         // display the time left
        if (interval == 1)
        {
          timer.cancel();               // when hits zero, stop timer and add one to character to skip the turn
          character++;
        }
        
        return --interval;          // keep subtracting down the time
    }
    
      //action performed method
      public void actionPerformed (ActionEvent event)
      {
        // if the button to be clicked is green or red, a valid button to be clicked,
        if (theArray[getBox(event)][getRow(event)][getCol(event)].getBackground() == Color.GREEN || theArray[getBox(event)][getRow(event)][getCol(event)].getBackground() == Color.RED)
        {
          if (character == 0)         // start timer after first move
          createTimer();
        else
        { 
          timer.cancel();           // clear the previous timer and create another one for each button clicked after that
          createTimer();
        }
        }

        //lets person click anywhere if first move or the box they are suppposed to go to is won
        if (character <= 0 || arrayForA[result1] != 0)
        {
          //set the character of the winner to the character text
            getButtonPlace(event).setText(setChar(character));
          //sets variables
            result2 = getRow(event);
            result1 = getBox(event);
            result3 = getCol(event);
            //runs the methods that sees if box is won, changes appropriate box to red
            // changes box's to green if necessary
            //sees if anyone won
            //sets character 1 up and sets the buttons to disabled
            boxWinner(event);
            toRed(event);
            gridGreen(event);
            trueWinner(event);
            noWinnerWin(event);
            character++; 
            if(noWinnerWin(event)==true || trueWinner(event) == true)
            {
              disableAll(event);
              timer.cancel();              // stop the timer when someone won the game
              timerStr.setText("END");
            }
            getButtonPlace(event).setEnabled(false);     
        }
        
        else
        {
          //same methods if the box they are supposed to go to is not won
          if(getBox(event)== ChangeToA(event))
          {       
            getButtonPlace(event).setText(setChar(character));
            getButtonPlace(event).setEnabled(false);
            result2 = getRow(event);
            result1 = getBox(event);
            result3 = getCol(event);
            boxWinner(event);
            toRed(event);
            gridGreen(event);
            trueWinner(event);
            noWinnerWin(event);
            if(noWinnerWin(event)==true || trueWinner(event) == true)
            {
              disableAll(event);
              timer.cancel();                      // stop the timer when someone won the game
              timerStr.setText("END");
            } 
            character++;
          }
     
        }
       }
      }
   }