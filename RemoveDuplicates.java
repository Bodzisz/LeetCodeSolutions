public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int counter = 1;
        int current = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[counter - 1] != nums[i]) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
