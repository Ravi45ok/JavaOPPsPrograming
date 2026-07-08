
// !Write a program to check if two strings are anagrams using Map. Input: "listen" and "silent" Output: true

import java.util.*;

public class Assingnment5 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i))) {
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            } else {
                map1.put(s1.charAt(i), 1);
            }

            if (map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            } else {
                map2.put(s2.charAt(i), 1);
            }
        }
        System.out.println(map1.equals(map2));

    }
}
