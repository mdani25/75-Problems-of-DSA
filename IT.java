class IT {
    public static boolean increasingTriplet(int[] nums) {
       int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  
            } else if (num <= second) {
                second = num; 
            } else {
                return true; 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums)); //OUTPUT: true
    }
   }