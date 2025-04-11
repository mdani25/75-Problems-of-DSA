// Kids With the Greatest Number of Candies:
// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.List;

public class GCD {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }
        
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies)); //OUTPUT: [true, true, true, false, true]
    }
    
}
