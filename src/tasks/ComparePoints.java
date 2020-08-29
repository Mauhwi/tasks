package tasks;

import java.util.ArrayList;
import java.util.List;

public class ComparePoints {
    private final List<Integer> a;
    private final List<Integer> b;

    public List<Integer> compareTriplets() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);
        for (int i =0; i<3; i++) {
            if (a.get(i)>b.get(i)) {
                result.set(0, result.get(0)+1);
            } else if (a.get(i)<b.get(i)) {
                result.set(1, result.get(1)+1);
            }
        }
        return result;
    }

    public ComparePoints(List<Integer> a, List<Integer> b) {
        this.a = a;
        this.b = b;
    }
}
