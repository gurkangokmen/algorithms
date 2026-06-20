import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        
        int [] nums = new int[5];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 3;
        System.out.println(Arrays.toString(removeDuplicatesArray(nums)));
    }
    public static int removeDuplicates(int[] nums) {
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result= result + 1;
            }

            else {
                if (nums[i] == nums[i-1]) {
                    continue;
                }
                
                result+=1;
            }
        }

        return result;
    }

    public static int[] removeDuplicatesArray(int[] nums) {
        int[] result = new int[removeDuplicates(nums)];
        int order = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[0]= nums[i];
            }

            else {
                if (nums[i] == nums[i-1]) {
                    continue;
                }
                
                result[order] = nums[i];
                order = order + 1;
            }
        }

        return result;
    }
}