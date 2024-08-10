import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        // Put elements at right position

        int[] nums = {34, 56, 23, 16, 22};
        int size = nums.length;

        System.out.println("Before Sorting: " + Arrays.toString(nums));

        for(int i=1; i<size; i++){  // Start from 56 to end
            int key = nums[i];      // Key point at 56
            int j = i-1;            // Now j point at 34

                while( j >= 0 && nums[j] > key){ // First check for j and then check for greater 
                    nums[j+1] = nums[j];    // Now at 56 replace with j means 34
                    j--;                    // And j points goes in reverse order 

                }
                nums[j+1] = key; // key value store at j+1 mean at 56 
        }


        System.out.println("After Sorting: " + Arrays.toString(nums));
    }
}
