// Program to find the length of maximum substring in a given string

import java.util.*;
public class substring {
    public static void main(String... args) {
        String s = "abcdeabbdrfesb";
        int start = 0;
        int end = 0;
        int max_length = 0;
        List <Character> list = new ArrayList<Character>();

        // main logic

        while(end < s.length()) {
            if(!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length,list.size());
            }
            else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        System.out.println("The length of the maximum substring is : " + max_length);
    }        
}