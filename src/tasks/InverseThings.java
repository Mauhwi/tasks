package tasks;

import java.util.ArrayList;

public class InverseThings {

    private ArrayList<Integer> arrayList;
    private String w;

    public ArrayList<Integer> intArrayInv() {
        for (int i = 0; i < arrayList.size(); i++) {
            Integer x = arrayList.get(arrayList.size()-1);
            arrayList.add(i, x);
            arrayList.remove(arrayList.size()-1);
        }
    return arrayList;
    }

    public String stringInv() {
        String[] s = w.split(" ");
        String result = "";
        for (String t : s) {
            if (t.length()>4) {
                StringBuilder b = new StringBuilder(t);
                b = b.reverse();
                result = result.concat(b + " ");
            } else result = result.concat(t+ " ");
        }
    return  result.trim();
    }

    public InverseThings(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public InverseThings(String w) {
        this.w = w;
    }
}
