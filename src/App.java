import java.io.File;
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
            // will skip the first line which is ------------------------------
            scan.nextLine();

            // figure out where queens are
            // using a 2 dimentional array called board[][]
            for (int j = 0; j < board_size; j++) {
                String Line = scan.nextLine();
                // check if a spot has a queen
                for (int k = 1; k < board_size + 1; k++) {
                    int position = 3;
                    // if the queen is in the first collumn
                    if (!(position > Line.length())) {

                        if (k == 1) {
                            if (Line.charAt(position) == ' ') {
                                Q_count++;
                                board[j][k - 1] = '_';

                            }
                        }

                        position = position + 4;
                    }
                }
                // DEBUG line
                System.out.println(Arrays.toString(board[j]));
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
