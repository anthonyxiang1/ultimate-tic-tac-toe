//Author: Noah Kniesly, and Anthony Xiang
//UtimateTicTacToeDriver.java     
//the Ultimate tic tac toe driver

// import the necessary classes
import javax.swing.JFrame;
import javax.swing.*;
public class UltimateTicTacToeDriver
{
  public static void main (String[] args)
  {
    try {                                                       // Be able to display the graphics on a Mac

      UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );

    } catch (Exception e) {

      e.printStackTrace();

    }
    
      JFrame frame = new JFrame ("Tic Tac Toe");                // creates the frame, calls it Tic Tac Toe
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);    // allows to close the frame
      frame.setDefaultLookAndFeelDecorated(true);  
      frame.getContentPane().add(new UltimateTicTacToe());       // adds the main panel to the frame

      frame.pack();                                               // makes the frame movable
      frame.setVisible(true);                                    // makes the frame visible
    
  }
}