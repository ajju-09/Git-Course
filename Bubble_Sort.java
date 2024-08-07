import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String args[]){
        // Simplly there are numbers of iteration and at iteration check two value and swap them
        // Time Complexity is o(n2)

        int []nums = {22, 43, 14, 19, 64, 32};
        int size = nums.length;
        int temp;
        
        System.out.println("Before Sorting: "+Arrays.toString(nums));
        boolean swapped = false;
        for(int i=0; i<size-1; i++){  //This loop is use for travers the whole array
            for(int j=0; j<size-i-1; j++){  //This loop is use for swapping the elements
                if (nums[j] > nums[j+1]) { //For e.g. J points o index and j+1 points 1 index
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        System.out.println();
        System.out.println("After Sorting: "+Arrays.toString(nums));

    } 
    
}
