public class SearchInfiniteSortedArray {
    public static void main(String[] args) {

    }
    static int BinarySearchInfinity(int[] arr, int target, int start,int end) {
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}
