package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        Integer[] listToArray = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("-------");

        Integer[] numsArray = new Integer[3];
        numsArray[0] = 1;
        numsArray[1] = 2;
        numsArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numsArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numsArray));
        System.out.println(arrayToList);

        System.out.println("----------");
        List<Integer> numsList = new ArrayList<>(Arrays.asList(numsArray));
        numsList.add(15);
        System.out.println(numsList);

        List<Integer> numsWithVarArgs = Arrays.asList(1, 2, 3, 4);
        List<Integer> numsWithVarArgs11JDK = List.of(1, 2, 3, 4);
    }
}
