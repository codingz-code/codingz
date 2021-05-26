package codingz;

/*
https://leetcode.com/problems/pascals-triangle/

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


Constraints:

    1 <= numRows <= 30

 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> tmp = new ArrayList<>();
            for(int j = 0; j < i+1; j++){
                if(j == 0) tmp.add(1);
                else if (j == i) tmp.add(1);
                else {
                    List<Integer> tmp2 = result.get(i-1);
                    tmp.add(tmp2.get(j)+tmp2.get(j-1));
                }
            }
            result.add(tmp);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangle cls = new PascalTriangle();
        System.out.println(cls.generate(5));
    }
}
