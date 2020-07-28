import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n, total number of rows
        int n = in.nextInt();
        // is a 2D array.
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            // single row array. which is the single row and and a group of them is a column
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }
            
            rows.add(row);
        }
        
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
            // x number of rows -> array.length
            int x = in.nextInt();
            // y number of columns -> array[1].length 
            int y = in.nextInt();
            
            try {
                // where the magic happens
                //rows.get(x - 1).get(y - 1) 
                // first get me the exact row then the element from the row
                // line x position y
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
