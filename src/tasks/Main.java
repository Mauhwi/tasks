package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        InverseThings newArray = new InverseThings(arrayList);
        System.out.println(newArray.intArrayInv());

        System.out.println("\nЗадание 2");
        InverseThings newString = new InverseThings("Hero Challange");
        System.out.println(newString.stringInv());

        System.out.println("\nЗадание 3");
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(7, 8, 9));
        SquareArray squareArray = new SquareArray(arr);
        System.out.println(squareArray.diagonalDifference());

        System.out.println("\nЗадание 4");
        ArrayList<Character> checklist = new ArrayList<>();
        checklist.add('a');
        checklist.add('b');
        checklist.add('c');
        checklist.add('d');
        checklist.add('a');
        SubStrings subStrings = new SubStrings(checklist);
        System.out.println(subStrings.removeLeftOf('d'));

        System.out.println("\nЗадание 5");
        SubStrings subStrings2 = new SubStrings("abcdaabcdefa");
        System.out.println(subStrings2.lengthOfLongestSubstring());

        System.out.println("\nЗадание 6");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(3);
        ComparePoints comparePoints = new ComparePoints(list1, list2);
        System.out.println(comparePoints.compareTriplets());
        }


}
