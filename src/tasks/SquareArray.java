package tasks;

import java.util.ArrayList;
import java.util.List;

public class SquareArray {
    private List<List<Integer>> arr;

    public SquareArray(List<List<Integer>> arr) {
        this.arr = arr;
    }

    public int diagonalDifference() {
        int dg1 =0;
        int dg2=0;
        for (int row = 0; row < arr.size(); row++) {
            for (int col = 0; col < arr.size(); col++) {
                if (col==row) {
                    dg1+=arr.get(row).get(col);
                }
            }
        }
        for (int row = 0; row < arr.size(); row++) {
            for (int col = 0; col < arr.size(); col++) {
                if (col+row==arr.size()-1) {
                    dg2+=arr.get(row).get(col);
                }
            }
        }
        return Math.abs(dg1-dg2);
    }
}
