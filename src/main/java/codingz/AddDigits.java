package codingz;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/add-digits/

258. Add Digits

 */
public class AddDigits {
    // Brute Force
//    public int addDigits(int num) {
//        while(num>=10){
//            num = sum(digits(num));
//        }
//        return num;
//    }
//
//    public List<Integer> digits(int num){
//        List<Integer> l = new ArrayList<>();
//        while(num>0){
//            l.add(num%10);
//            num = num/10;
//        }
//        return l;
//    }
//
//    public int sum(List<Integer> nums){
//        int sum = 0;
//        for(int a:nums){
//            sum+=a;
//        }
//        return sum;
//    }

    public int addDigits(int num) {
        while(num>=10){
            num = sum(num);
        }
        return num;
    }

    public int sum(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        AddDigits obj = new AddDigits();
        System.out.println(obj.addDigits(38));
        System.out.println(obj.addDigits(0));
        System.out.println(obj.addDigits(10));
    }
}
