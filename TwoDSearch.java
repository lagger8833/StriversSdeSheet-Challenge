import java.util.ArrayList;
public class TwoDSearch {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int row = 0, col = mat.get(0).size() - 1;
        while(row < mat.size() && col >= 0){
            int curr = mat.get(row).get(col);
            if(curr == target) return true;
            if(curr > target) col--;
            else row++;
        }
        return false;
    }
}
