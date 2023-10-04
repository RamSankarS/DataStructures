public class Ceiling{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 11, 13, 15, 19, 23};
        int target = 14;
        System.out.println(findCeiling(arr, target));
    }
    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else return mid;
        }
        return start;
    }

}

