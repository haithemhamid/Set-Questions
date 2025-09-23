import java.util.HashSet;
import java.util.Set;
public class SequenceFinder {
    /**
     * TO-DO: Find the length of the longest consecutive sequence of numbers in an array.
     * This must be implemented in O(n) time complexity.
     \*
     * @param nums An unsorted array of integers.
     * @return The length of the longest sequence.
     */
    public int longestConsecutiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestStreak = 0;


        for(int num: numSet){
            if(!numSet.contains(num-1)) {
                int prev=num;
                int currentStreak=1;
                while (numSet.contains(prev+1)) {
                    currentStreak++;
                    prev++;
                }
                longestStreak=Math.max(currentStreak,longestStreak);
            }

        }
        return longestStreak;
    }

}
