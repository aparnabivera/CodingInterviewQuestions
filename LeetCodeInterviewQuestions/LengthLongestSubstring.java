//3. Longest Substring Without Repeating Characters
/*Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/

package LeetCodeInterviewQuestions;

import java.util.HashSet;

import java.util.Set;

public class LengthLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int pointerA=0, pointerB=0, max=0;
        Set<Character> hashSet = new HashSet();

        while(pointerB<s.length())
        {
            if(!hashSet.contains(s.charAt(pointerB)))
            {
                hashSet.add(s.charAt(pointerB));
                pointerB++;
                max = Math.max(hashSet.size(), max);
            }
            else
            {
                hashSet.remove(s.charAt(pointerA));
                pointerA++;
            }
        }

        return max;
    }
}
