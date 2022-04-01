import java.util.Scanner;
import java.io.File;
public class App {
    public static int board_size = 0;
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("willie.dat"));
        int case_loop = Integer.parseInt(scan.nextLine()); 
        System.out.println(case_loop);
        for (int i = 0; i < case_loop; i++){
            int board_size = Integer.parseInt(scan.nextLine());





        }



    }
    public static int[][] board_to_matrix(int[] board, int board_size){
        int[][] matrix = new int[board_size][board_size];
        int[] flat_matrix = new int[board_size * board_size];
        
        for(int i = 0; i < board_size; i++){
            
            int board_row = i * 2;



        }
        
        
        
        
        
        
        return matrix;


    }
}
