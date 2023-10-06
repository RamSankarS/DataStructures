public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] rotatedArray = {6,7,8,9,-1,0,1,2,3,4,5};
        int target = 5;
        System.out.println(searchRotatedArray(rotatedArray,target));

    }
    static int searchRotatedArray(int[] arr, int target){
        int start = 0;
        int end = findPivot(arr);
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] > target) end = mid - 1;
            else if(arr[mid] < target) start = mid + 1;
            else return mid;
        }
        return searchRotatedArraySecondHalf(arr,target);
    }
    static int searchRotatedArraySecondHalf(int[] arr, int target){
        int start = findPivot(arr);
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] > target) end = mid - 1;
            else if(arr[mid] < target) start = mid + 1;
            else return mid;
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid < end && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            else if(arr[mid] >= arr[start]){
                start = mid + 1;
            }
            else if(arr[mid] < arr[start]){
                end = mid - 1;
            }
        }
        return -1;
    }
}
