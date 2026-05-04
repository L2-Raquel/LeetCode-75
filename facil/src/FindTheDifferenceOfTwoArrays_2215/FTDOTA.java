package FindTheDifferenceOfTwoArrays_2215;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FTDOTA {
    public static void main(String[] args) {
int[] nums1 = {1,2,3};
int[] nums2 = {2,4,6};

List<List<Integer>> resultado = new ArrayList<>();
//List<int[]> resultado = new ArrayList<>();

// 1. Buscamos elementos de nums1 que NO están en nums2
        resultado.add(buscarDiferentes(nums1, nums2));

        // 2. Buscamos elementos de nums2 que NO están en nums1
        resultado.add(buscarDiferentes(nums2, nums1));

        System.out.print("[");
for(List<Integer> lista : resultado){
    System.out.println(lista);
}
        System.out.println("]");

    }

    public static List<Integer> buscarDiferentes(int[] nums1, int[] nums2) {
        List<Integer> distintos = new ArrayList<>();

        for (int n1 : nums1) {
            boolean coincidencia = false;

            for (int j = 0; j < nums2.length; j++) {
                if (n1 == nums2[j]) {
                    coincidencia = true;
                }
            }

            if (!coincidencia && !distintos.contains(n1)) {
                distintos.add(n1);
            }
        }

return distintos;
    }

}

/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
    answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

Note that the integers in the lists may be returned in any order.



Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].

Respuesta más popular:

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i : nums1) {
            n1.add(i);
        }
        for (int i : nums2) {
            n2.add(i);
        }
        for (int i : n1) {
            if (!n2.contains(i)) {
                answer1.add(i);
            }
        }
        for (int i : n2) {
            if (!n1.contains(i)) {
                answer2.add(i);
            }
        }
        result.add(answer1);
        result.add(answer2);
        return result;
    }
}


 */