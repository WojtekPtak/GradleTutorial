

package com.irisoft.gradletut.main;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.text.similarity.LongestCommonSubsequenceDistance;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LongestCommonSubsequenceDistance lcsd = new LongestCommonSubsequenceDistance();
        int countLcsd = lcsd.apply("Wojtek", "Dagmara");
        System.out.println("Similarity: " + countLcsd);

        List<String> lst1 = Arrays.asList("Fredrik", "Andrew", "Bob");
        List<String> lst2 = Arrays.asList("Bob", "John", "Ted");
        Collection intersection = CollectionUtils.intersection(lst1, lst2);
        System.out.println("intersection : " + intersection.toString());

    }
}
