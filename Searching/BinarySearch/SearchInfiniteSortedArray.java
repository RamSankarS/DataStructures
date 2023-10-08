public class SearchInfiniteSortedArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 12;
        System.out.println(result(arr,target));

    }
    static int result(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return BinarySearchInfinity(arr,target,start,end);
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
