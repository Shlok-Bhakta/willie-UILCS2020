import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class App {
    public static int board_size = 0;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("willie.dat"));
        
        int case_loop = Integer.parseInt(scan.nextLine());
        

        for (int i = 0; i < 1; i++) {
            int Q_count = 0;
            int board_size = Integer.parseInt(scan.nextLine());
            char[][] board = new char[board_size][board_size];
            scan.nextLine();
            for(int j = 0; j < board_size; j++) {
                String scan_line = scan.nextLine();
                for (int k = 0; k < scan_line.length(); k++) {
                    int bars = 0;
                    if(!(board_size < bars)){
                        if (scan_line.charAt(k) == '|') {
                            bars++;
                            if (scan_line.charAt(k + 2) == 'Q') {
                                Q_count++;
                                board[j][k] = 'Q';
                                k = k + 5;
                                
                            System.out.println("Q");
                            } else {
                                board[j][k] = ' ';
                                System.out.println(" ");
                                k = k + 5;
                            }
                        }

                    }
                    
                    
                    
                    
                    
                }     
                System.out.println(Arrays.toString(board[j]));        
                scan.nextLine();   
            }
            



        }

    }

}

/*
 * public static int[][] board_to_matrix(ArrayList<String> board, int
 * board_size) {
 * int[][] matrix = new int[board_size][board_size];
 * int[] flat_matrix = new int[board_size * board_size];
 * 
 * for (int i = 0; i < (board_size / 2); i++) {
 * // TODO find the location of the Q and map it to the matrix
 * int board_row = i * 2;
 * for (int j = 0; j < board_size; j++) {
 * if (board.get((j * 3) + j) == "Q") {
 * System.out.println("debug");
 * }
 * 
 * }
 * 
 * }
 * 
 * return matrix;
 * 
 * }
 */
