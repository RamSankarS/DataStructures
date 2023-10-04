public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,10,12,40,50,60,90};
        int target = 90;
            System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
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
