import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TicTacToeGame extends JFrame {

    static boolean player1Turn = true;

    static JButton tileOne = new JButton(" "), tileTwo = new JButton(" "), tileThree = new JButton(" "),
        tileFour = new JButton(" "), tileFive = new JButton(" "), tileSix = new JButton(" "),
        tileSeven = new JButton(" "), tileEight = new JButton(" "), tileNine = new JButton(" ");

    static JTextField turnDisplayScreen = new JTextField("Player 1's turn");

    static JOptionPane playAgain = new JOptionPane("Play again?");
    static int player1WinTotal = 0, player2WinTotal = 0;

    static JTextArea scoreBoard = new JTextArea("Win Total: " +
        "Player 1: " + player1WinTotal + " Player 2: " + player2WinTotal);

    static boolean win;
    public static void configureGameBoard() {
        tileOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player1Turn == true && tileOne.getText() == " ") {
                    tileOne.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileOne.getText() == " ") {
                    tileOne.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }

                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();
            }
        });

        tileTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                if (player1Turn == true && tileTwo.getText() == " ") {
                    tileTwo.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileTwo.getText() == " ") {
                    tileTwo.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();
            } {

            }
        });

        tileThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                if (player1Turn == true && tileThree.getText() == " ") {
                    tileThree.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileThree.getText() == " ") {
                    tileThree.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();

            }

        });

        tileFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                if (player1Turn == true && tileFour.getText() == " ") {
                    tileFour.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileFour.getText() == " ") {
                    tileFour.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();
            }

        });

        tileFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player1Turn == true && tileFive.getText() == " ") {
                    tileFive.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileFive.getText() == " ") {
                    tileFive.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();
            }
        });

        tileSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player1Turn == true && tileSix.getText() == " ") {
                    tileSix.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileSix.getText() == " ") {
                    tileSix.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();
            }
        });

        tileSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player1Turn == true && tileSeven.getText() == " ") {
                    tileSeven.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileSeven.getText() == " ") {
                    tileSeven.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();

            }
        });

        tileEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player1Turn == true && tileEight.getText() == " ") {
                    tileEight.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileEight.getText() == " ") {
                    tileEight.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();

            }
        });

        tileNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (player1Turn == true && tileNine.getText() == " ") {
                    tileNine.setText("X");
                    turnDisplayScreen.setText("Player 2's turn");
                    player1Turn = false;
                } else if (player1Turn == false && tileNine.getText() == " ") {
                    tileNine.setText("O");
                    turnDisplayScreen.setText("Player 1's turn");
                    player1Turn = true;
                }
                checkforPlayer1Win();
                checkforPlayer2Win();
                checkforDraw();


            }
        });

    }

    public static void resetGameBoard() {
        tileOne.setText(" ");
        tileTwo.setText(" ");
        tileThree.setText(" ");
        tileFour.setText(" ");
        tileFive.setText(" ");
        tileSix.setText(" ");
        tileSeven.setText(" ");
        tileEight.setText(" ");
        tileNine.setText(" ");

        turnDisplayScreen.setText("Player 1's turn!");
        player1Turn = true;

        tileOne.setBackground(null);
        tileTwo.setBackground(null);
        tileThree.setBackground(null);
        tileFour.setBackground(null);
        tileFive.setBackground(null);
        tileSix.setBackground(null);
        tileSeven.setBackground(null);
        tileEight.setBackground(null);
        tileNine.setBackground(null);
        
        win=false;

    }
    public static void checkforPlayer1Win() {

        if (tileOne.getText().equals("X") && tileTwo.getText().equals("X") && tileThree.getText().equals("X")) {
            tileOne.setBackground(Color.GREEN);
            tileTwo.setBackground(Color.GREEN);
            tileThree.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;
            
            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + " Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileFour.getText().equals("X") && tileFive.getText().equals("X") && tileSix.getText().equals("X")) {
            tileFour.setBackground(Color.GREEN);
            tileFive.setBackground(Color.GREEN);
            tileSix.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;

            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + " Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileSeven.getText().equals("X") && tileEight.getText().equals("X") && tileNine.getText().equals("X")) {
            tileSeven.setBackground(Color.GREEN);
            tileEight.setBackground(Color.GREEN);
            tileNine.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;

            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + " Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileOne.getText().equals("X") && tileFour.getText().equals("X") && tileSeven.getText().equals("X")) {
            tileOne.setBackground(Color.GREEN);
            tileFour.setBackground(Color.GREEN);
            tileSeven.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;

            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + " Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileOne.getText().equals("X") && tileFive.getText().equals("X") && tileNine.getText().equals("X")) {
            tileOne.setBackground(Color.GREEN);
            tileFive.setBackground(Color.GREEN);
            tileNine.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;

            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + "Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileTwo.getText().equals("X") && tileFive.getText().equals("X") && tileEight.getText().equals("X")) {
            tileTwo.setBackground(Color.GREEN);
            tileFive.setBackground(Color.GREEN);
            tileEight.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;

            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + "Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();

            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileThree.getText().equals("X") && tileFive.getText().equals("X") && tileSeven.getText().equals("X")) {
            tileThree.setBackground(Color.GREEN);
            tileFive.setBackground(Color.GREEN);
            tileSeven.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;

            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + "Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();

            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileThree.getText().equals("X") && tileSix.getText().equals("X") && tileNine.getText().equals("X")) {
            tileThree.setBackground(Color.GREEN);
            tileSix.setBackground(Color.GREEN);
            tileNine.setBackground(Color.GREEN);
            turnDisplayScreen.setText("Player 1 wins!");
            player1WinTotal += 1;
            win=true;

            String newWinTotalp1 = Integer.toString(player1WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + newWinTotalp1 + " Player 2: " + player2WinTotal);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();

            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        }

    }

    public static void checkforPlayer2Win() {

        if (tileOne.getText().equals("O") && tileTwo.getText().equals("O") && tileThree.getText().equals("O")) {
            tileOne.setBackground(Color.RED);
            tileTwo.setBackground(Color.RED);
            tileThree.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + "Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();

            }
            if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileFour.getText().equals("O") && tileFive.getText().equals("O") && tileSix.getText().equals("O")) {
            tileFour.setBackground(Color.RED);
            tileFive.setBackground(Color.RED);
            tileSix.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins!");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + " Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();

            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileSeven.getText().equals("O") && tileEight.getText().equals("O") && tileNine.getText().equals("O")) {
            tileSeven.setBackground(Color.RED);
            tileEight.setBackground(Color.RED);
            tileNine.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins!");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + " Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileOne.getText().equals("O") && tileFour.getText().equals("O") && tileSeven.getText().equals("O")) {
            tileOne.setBackground(Color.RED);
            tileFour.setBackground(Color.RED);
            tileSeven.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins!");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + " Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileOne.getText().equals("O") && tileFive.getText().equals("O") && tileNine.getText().equals("O")) {
            tileOne.setBackground(Color.RED);
            tileFive.setBackground(Color.RED);
            tileNine.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins!");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + " Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileTwo.getText().equals("O") && tileFive.getText().equals("O") && tileEight.getText().equals("O")) {
            tileTwo.setBackground(Color.RED);
            tileFive.setBackground(Color.RED);
            tileEight.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins!");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + " Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileThree.getText().equals("O") && tileFive.getText().equals("O") && tileSeven.getText().equals("O")) {
            tileThree.setBackground(Color.RED);
            tileFive.setBackground(Color.RED);
            tileSeven.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins!");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + " Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();


            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        } else if (tileThree.getText().equals("O") && tileSix.getText().equals("O") && tileNine.getText().equals("O")) {
            tileThree.setBackground(Color.RED);
            tileSix.setBackground(Color.RED);
            tileNine.setBackground(Color.RED);
            turnDisplayScreen.setText("Player 2 wins!");
            player2WinTotal += 1;
            win=true;

            String newWinTotalp2 = Integer.toString(player2WinTotal);
            scoreBoard.setText("Wins: " +
                "Player 1: " + player1WinTotal + " Player 2: " + newWinTotalp2);

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();

            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }

        }

    }

    public static void checkforDraw() {
    	/*if(tileOne.getText() != ("X") & tileTwo.getText() != ("X") & tileThree.getText() != ("X")
    			&tileOne.getText() != (" ") & tileTwo.getText() != (" ") & tileThree.getText() != (" "))
    	{
    		if(tileOne.getText() != ("O") & tileTwo.getText() != ("O") & tileThree.getText() != ("O")
        			&tileOne.getText() != (" ") & tileTwo.getText() != (" ") & tileThree.getText() != (" "))
    		{*/
    			
    	    if(win != true & tileOne.getText() != (" ") & tileTwo.getText() != (" ") & tileThree.getText() != (" ") & 
    	    		tileFour.getText() != (" ") & tileFive.getText() != (" ") & tileSix.getText() != (" ") & 
    	    		tileSeven.getText() != (" ") & tileEight.getText() != (" ") & tileNine.getText() != (" "))	
    	    {
    		turnDisplayScreen.setText("Draw game!");

            JFrame frame = new JFrame("Play again?");
            String message = "Would you like to play again?";
            int answer = playAgain.showConfirmDialog(frame, message);
            if (answer == playAgain.YES_OPTION) {
                resetGameBoard();

            } else if (answer == playAgain.NO_OPTION) {
                System.exit(0);
            }
    	}

    }
    public static void main(String args[]) {
        JFrame gameWindow = new JFrame();
        gameWindow.setTitle("Tic Tac Toe");
        gameWindow.setSize(340, 400);
        gameWindow.setResizable(false);

        JPanel gamePanel = new JPanel(new BorderLayout(5, 5));
        gamePanel.setBorder(new EmptyBorder(4, 4, 4, 4));

        JPanel tilePanel = new JPanel(new GridLayout(4, 4));

        turnDisplayScreen.setEditable(false);
        scoreBoard.setEditable(false);
        gamePanel.add(turnDisplayScreen, BorderLayout.NORTH);
        gamePanel.add(scoreBoard, BorderLayout.SOUTH);

        tilePanel.add(tileOne);
        tilePanel.add(tileTwo);
        tilePanel.add(tileThree);
        tilePanel.add(tileFour);
        tilePanel.add(tileFive);
        tilePanel.add(tileSix);
        tilePanel.add(tileSeven);
        tilePanel.add(tileEight);
        tilePanel.add(tileNine);

        configureGameBoard();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)((dimension.getWidth() - gameWindow.getWidth()) / 2);
        int y = (int)((dimension.getHeight() - gameWindow.getHeight()) / 2);
        gameWindow.setLocation(x, y);

        gamePanel.add(tilePanel, BorderLayout.CENTER);
        gameWindow.getContentPane().add(gamePanel);
        gameWindow.setVisible(true);

    }
}
