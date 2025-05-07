package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(0);
        nums.add(4);
        nums.add(3);
        // (-(ponto de insercao) - 1)
        Collections.sort(nums);
        int i = Collections.binarySearch(nums, 1);
        System.out.println(i);
    }
}
