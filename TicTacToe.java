package tic.tac.toe;

import java.util.Scanner;

public class TicTacToe {
    // Array to hold the X or O in each space
    public static char[] place = {'_','_','_','_','_','_','_','_','_' };
    
    // Variable to hold X or O, whichever team user chooses
    public static char team = '_';
    
    // Hold X or O, whichever team user does NOT choose
    public static char opp = '_';
    // Variable to hold user input for Scanner
    public static String usrStr;
    
    public static void main(String[] args) {
        //Greeting
       System.out.println("Welcome to Tic Tac Toe!");
       
       // Run setup method
       setup();
    }
    
    public static void drawBoard() {
        
        //draw the game board
        System.out.println("\t    A   B   C ");
        System.out.println("\t  .-----------.");
        System.out.println("\t1 |_"+TicTacToe.place[0]+"_|_"+TicTacToe.place[1]+"_|_"+TicTacToe.place[2]+"_|\n");
        System.out.println("\t2 |_"+TicTacToe.place[3]+"_|_"+TicTacToe.place[4]+"_|_"+TicTacToe.place[5]+"_|\n");
        System.out.println("\t3 |_"+TicTacToe.place[6]+"_|_"+TicTacToe.place[7]+"_|_"+TicTacToe.place[8]+"_|");
        System.out.println("\t  '-----------'");
        
        
    }
    
    public static void setup() {
        
        // Loop to reset the game board
        for ( int i = 0 ; i < 9 ; i++ ) {
            TicTacToe.place[i] = '_';
        }
        
        //print game board to the console
        drawBoard();
        
        while ( (TicTacToe.team != 'X') && (TicTacToe.team != 'O')) {
            
            System.out.println("\n\nPlease select either X or O to begin!");
            
            //prompt for user input
            System.out.print("Enter your selection: ");
            Scanner input = new Scanner(System.in);
            
            //take user input and assign it value
            TicTacToe.usrStr = input.next();
            
            if (TicTacToe.usrStr.toUpperCase().equals("X")) {
                
                TicTacToe.team = 'X';
                TicTacToe.opp = 'O';
                
            } else if (TicTacToe.usrStr.toUpperCase().equals("O")) {
                
                TicTacToe.team = 'O';
                TicTacToe.opp = 'X';
            } else {
                
                System.out.println("You entered: " + usrStr);
                System.out.println("This is not a valid option.");
                System.out.println("Please enter either X or O to continue.");
                
            }
        }
        
        System.out.println("\nYou are team: "+TicTacToe.team+"!");
        
        //run the game method
        game();
    }
    
    public static void game() {
        // local variable to run loop
        boolean loop = true;
        
        System.out.println("It's your turn");
        
        drawBoard();
        
        do {
            
            System.out.println("\n\nChoose a column or row to place "+TicTacToe.team+". (EXAMPLE: A1)\n");
          
            System.out.print("Enter your selection: ");
            Scanner input = new Scanner(System.in);
            TicTacToe.usrStr = input.next().toUpperCase();
            
            switch (TicTacToe.usrStr)
            {
                case "A1" : if (TicTacToe.place[0]=='_') {
                    
                    TicTacToe.place[0] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in A1.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[0]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[0]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "B1" : if (TicTacToe.place[1]=='_') {
                    
                    TicTacToe.place[1] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in B1.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[1]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[1]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "C1" : if (TicTacToe.place[2]=='_') {
                    
                    TicTacToe.place[2] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in C1.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[2]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[2]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "A2" : if (TicTacToe.place[3]=='_') {
                    
                    TicTacToe.place[3] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in A2.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[3]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[3]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "B2" : if (TicTacToe.place[4]=='_') {
                    
                    TicTacToe.place[4] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in B2.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[4]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[4]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "C2" : if (TicTacToe.place[5]=='_') {
                    
                    TicTacToe.place[5] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in C2.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[5]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[5]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "A3" : if (TicTacToe.place[6]=='_') {
                    
                    TicTacToe.place[6] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in A3.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[6]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[6]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "B3" : if (TicTacToe.place[7]=='_') {
                    
                    TicTacToe.place[7] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in B3.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[7]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[7]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
                
                case "C3" : if (TicTacToe.place[8]=='_') {
                    
                    TicTacToe.place[8] = TicTacToe.team;
                    System.out.println("\nYou placed an "+TicTacToe.team+" in C3.");
                    oppMove();
                    loop = false;
                } else if (TicTacToe.place[8]==TicTacToe.team) {
                    
                    System.out.println("\nThere is an "+TicTacToe.team+" there already.");
                } else if (TicTacToe.place[8]==TicTacToe.opp) {
                    
                    System.out.println("This space is already taken by the opponent!");
                }; break;
            }
        } while (loop);
        
        checkWin();
    }
    
    public static void oppMove() {
        
        while (true) {
            
            if ((TicTacToe.place[0]=='_') || (TicTacToe.place[1]=='_') || (TicTacToe.place[2]=='_') || (TicTacToe.place[3]=='_') || (TicTacToe.place[4]=='_') || (TicTacToe.place[5]=='_') || (TicTacToe.place[6]=='_') || (TicTacToe.place[7]=='_') || (TicTacToe.place[8]=='_')) {
                
                float rn = (float) Math.random();
                float m = rn * 8;
                int x = Math.round(m);
                
                if (TicTacToe.place[x]=='_') {
                    
                    TicTacToe.place[x] = TicTacToe.opp;
                    break;
                } else { checkWin(); break; }
                
            }
            
        }
        
    }
    
    public static void checkWin() {
        
        // See if X has won the game
        if ( (TicTacToe.place[0]=='X') && (TicTacToe.place[1]=='X') && (TicTacToe.place[2]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[3]=='X') && (TicTacToe.place[4]=='X') && (TicTacToe.place[5]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[6]=='X') && (TicTacToe.place[7]=='X') && (TicTacToe.place[8]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[0]=='X') && (TicTacToe.place[3]=='X') && (TicTacToe.place[5]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[1]=='X') && (TicTacToe.place[4]=='X') && (TicTacToe.place[7]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[2]=='X') && (TicTacToe.place[5]=='X') && (TicTacToe.place[8]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[0]=='X') && (TicTacToe.place[4]=='X') && (TicTacToe.place[8]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[2]=='X') && (TicTacToe.place[4]=='X') && (TicTacToe.place[6]=='X')) {
            
            System.out.println("\n\n\n\tX WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        }
        // Now see if O has won!
        
        if ( (TicTacToe.place[0]=='O') && (TicTacToe.place[1]=='O') && (TicTacToe.place[2]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[3]=='O') && (TicTacToe.place[4]=='O') && (TicTacToe.place[5]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[6]=='O') && (TicTacToe.place[7]=='O') && (TicTacToe.place[8]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[0]=='O') && (TicTacToe.place[3]=='O') && (TicTacToe.place[6]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[1]=='O') && (TicTacToe.place[4]=='O') && (TicTacToe.place[7]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[2]=='O') && (TicTacToe.place[5]=='O') && (TicTacToe.place[8]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[0]=='O') && (TicTacToe.place[4]=='O') && (TicTacToe.place[8]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
            
        } else if ( (TicTacToe.place[2]=='O') && (TicTacToe.place[4]=='O') && (TicTacToe.place[6]=='O')) {
            
            System.out.println("\n\n\n\tO WINS!!!"); 
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        
        //Check for a tie
        } else if ((TicTacToe.place[0]!='_') && (TicTacToe.place[1]!='_') && (TicTacToe.place[2]!='_') && (TicTacToe.place[3]!='_') && (TicTacToe.place[4]!='_') && (TicTacToe.place[5]!='_') && (TicTacToe.place[6]!='_') && (TicTacToe.place[7]!='_') && (TicTacToe.place[8]!='_')) {
            
            System.out.println("\n\n\n\tTied game!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        
        // if no one has won and there's no tie, keep playing
        
    } else {
            game();
        }
    }
    
    public static void playAgain() {
        
            System.out.print("\n\nPlay again? [y/n]: ");
            Scanner input = new Scanner(System.in);
            TicTacToe.usrStr = input.next().toLowerCase();
            
            if (usrStr.equals("y")) {
                TicTacToe.team = '_';
                TicTacToe.opp = '_';
                setup();
            } else {
                System.exit(0);
            }
        
    }
    
}
