package codingz;

import java.util.HashMap;

/*

https://leetcode.com/problems/valid-anagram/

242. Valid Anagram

 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map =  new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for(int i : map.values()){
            if (i!=0)
                return false;
        }
        return true;
    }

    public boolean isAnagramv1(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for(int i : a){
            if (i!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();
        System.out.println(obj.isAnagram("anagram", "nagaram"));
        System.out.println(obj.isAnagram("rat", "car"));
    }
}
