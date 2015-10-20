package com.newfurniturey.interviewprep;

public class NumberQuestions {
    
    /**
     * Given an array of integers and a target integer, find if there is a consecutive subarray
     * that sums to the target.
     *
     * Running time: O(n^2)
     *
     * @param int targetValue   The value we're checking for.
     * @param int[] sequence    The list of numbers to check for subsequences of.
     * @return boolean          true if a sub-sequence is found; otherwise false
     */
    public static boolean sumExistsInConsecutiveSequence(int targetValue, int[] sequence) {
        if (sequence.length == 0) {
            // should this be `return (targetValue == 0);`?
            return false;
        }
        
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == targetValue) {
                return true;
            }
            
            int sum = sequence[i];
            for (int j = i + 1; j < sequence.length; j++) {
                sum += sequence[j];
                
                if (sum == targetValue) {
                    return true;
                } else if (sum > targetValue) {
                    break;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Given an array of integers and a target integer, find if there is a consecutive subarray
     * that sums to the target.
     *
     * Running time: O(n)
     *
     * @param int targetValue   The value we're checking for.
     * @param int[] sequence    The list of numbers to check for subsequences of.
     * @return boolean          true if a sub-sequence is found; otherwise false
     */
    public static boolean sumExistsInConsecutiveSequence2(int targetValue, int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        
        int currentStart = 0;
        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
            if (sum == targetValue) {
                return true;
            } else if (sum > targetValue) {
                while ((currentStart <= i) && (sum > targetValue)) {
                    sum -= sequence[currentStart++];
                }
                
                if ((sum == targetValue) && (currentStart <= i)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
