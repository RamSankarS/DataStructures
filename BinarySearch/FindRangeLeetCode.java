import java.util.Arrays;

public class FindRangeLeetCode {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,6,6,6,7,8,9};
        System.out.println(Arrays.toString(searchRange(arr, 6)));

    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int start = findIndex(nums, target, true);
        int end = findIndex(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    static int findIndex(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < target) start = mid + 1;
            else if (nums[mid] > target) end = mid - 1;
            else {
                ans = mid;
                if (findStartIndex) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
