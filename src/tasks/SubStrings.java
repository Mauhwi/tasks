package tasks;


import java.util.ArrayList;

//Given a string, find the length of the longest substring without repeating characters.
//Input: "abcabcbb"
//Output: 3
public class SubStrings {
    private ArrayList<Character> checklist = new ArrayList<>();
    private String s = "";

    public int lengthOfLongestSubstring() {
        int counter;
        int result = 0;
        ArrayList<Character> temp = new ArrayList<>();
        ArrayList<Character> checklist1 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            checklist1.add(c);
        }

        for (Character character : checklist1) {
            if (!temp.contains(character)) {
                temp.add(character);
                System.out.println(temp);
                counter = temp.size();
                result = Math.max(counter, result);
            } else {
                counter = temp.size();
                result = Math.max(counter, result);
                temp.subList(0, temp.indexOf(character) + 1).clear();
                temp.add(character);
                System.out.println(temp);
            }
        }
    return result;
    }

    public ArrayList<Character> removeLeftOf(Character c) {
        ArrayList<Character> temp = new ArrayList<>();
        for (int i=0; i<checklist.size(); i++) {
            temp.add(checklist.get(i));
            if (checklist.get(i)==c) {
                for (int j=0; j<i; j++) {
                    temp.remove(0);
                }
            }
        }
        return temp;
    }

    public SubStrings(ArrayList<Character> checklist) {
        this.checklist = checklist;
    }

    public SubStrings(String s) {
        this.s = s;
    }
}
