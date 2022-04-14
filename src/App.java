import java.io.File;
import java.util.*;

public class App {
    public static int board_size = 0;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("willie.dat"));

        int case_loop = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < case_loop; i++) {
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
                int position = 2;
                for (int k = 1; k < board_size + 1; k++) {

                    // if the queen is in the first collumn
                    int debug = Line.length();
                    if (!(position > Line.length())) {

                        if (k == 1) {
                            // if it not a queen
                            if (Line.charAt(position) == ' ') {

                                board[j][k - 1] = '_';

                                // if it a queen
                            } else {
                                Q_count++;
                                board[j][k - 1] = 'Q';
                            }
                        }

                        if (k > 1) {
                            // if it not a queen
                            if (Line.charAt(position) == ' ') {

                                board[j][k - 1] = '_';

                                // if it a queen
                            } else {
                                Q_count++;
                                board[j][k - 1] = 'Q';
                            }
                        }

                    }
                    position = position + 4;
                    //System.out.println(board[j][k-1]);
                }
                // DEBUG line
                System.out.println(Arrays.toString(board[j]));
                scan.nextLine();
                
            }
            

            if(boardValid(board_size, Q_count) == false){
                System.out.println("incorrect attempt");
            }
            if(horizTest(board, board_size) == false){
                System.out.println("Incorrect attempt");
                break;
            }


            scan.nextLine();
        }
    }
    public static boolean boardValid(int board_size, int Q_count){
        boolean bvalid = false;
        if(board_size == Q_count){
            bvalid = true;
        }


        return bvalid;

    }
    public static boolean horizTest(char[][] board, int board_size){
        boolean queenkill = false;
        int loop = 0;

        
            for(int i = 0; i < board_size; i++){
                for(int j = 0; j < board_size; j++){
                    if(board[i][j] == 'Q'){
                        for(int k = 0; k < board_size; k++){
                            if(board[i][k] == 'Q'){
                                if(!(k == j))
                                queenkill = true;
                                
                            }



                        }

                    } 

                }

            }





        





        return queenkill;
    }

}


