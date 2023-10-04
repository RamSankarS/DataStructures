public class SearchMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,8,3,4,2};
        int target = 2;
        System.out.println(findInMountainArray(target,arr));
    }
    static int findInMountainArray(int target,int[] mountainArr) {
        int ansAscending = BinarySearchAscending(target,mountainArr,PeakElement(mountainArr));
        int ansDescending = BinarySearchDescending(target,mountainArr,PeakElement(mountainArr));
        if(ansAscending != -1) return ansAscending;
        return ansDescending;
    }
    static int PeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start < end){
            mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }
    static int BinarySearchAscending(int target,int[] arr,int end){
        int start = 0;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }
    static int BinarySearchDescending(int target,int[] arr,int start){
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] < target) end = mid - 1;
            else if(arr[mid] > target) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
