import java.util.Arrays;

class MZ {
    public static void moveZeroes(int[] nums) {
        int i, j;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) 
            { 
                for (j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) { 
                        
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break; 
                    }
                }
            }
        }

        
        System.out.println(Arrays.toString(nums)); //OUTPUT:    [1, 3, 12, 0, 0]
 
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}