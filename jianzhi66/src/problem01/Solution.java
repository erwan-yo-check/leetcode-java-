package problem01;


public class Solution {
    public static boolean Find(int target, int [][] array) {
        boolean found = false;
        
        int rows = array.length-1;
        int cols = array[0].length-1;
        int row = 0;
        int col = 0;
        while (found == false && row <= rows && col <= cols) {
            if (target == array[row][col]) {
                found = true;
            }
            
            if (col == cols){
                col = 0;
                row = row + 1;
            } else {
                 col = col + 1;
            }
        }
        return found;
    }
    public static void main(String arg[]) {
        int[][] a = {{12,20,5},{16,15,1},{30,45,23}};
        if (Find(5,a)) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        

    }
}