public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,8,6,4,2};
        System.out.println(binarySearch(arr));

    }
    static int binarySearch(int[] arr){
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
}
