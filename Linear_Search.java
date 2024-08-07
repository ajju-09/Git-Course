public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = { 5, 10, 45, 56, 78 };
        int target = 56;
        int result = linerSearch(nums, target);
        int result1 = binarySearch(nums, target);
        if (result != -1)
            System.out.println("Number is found at index : " + result);

        else
            System.out.println("Value not found");

        if (result1 != -1)
            System.out.println("Number is found at index : " + result1);

        else
            System.out.println("Value not found");

    }

    public static int linerSearch(int[] nums, int target) {
        int steps=0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("No of steps taken by linearsearch "+steps);
                return i;
            }
            
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("No of steps taken by Binarysearch "+steps);
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else
            right = mid -1;
        }
        System.out.println("No of steps taken by Binarysearch "+steps);
        return -1;

    }
}
