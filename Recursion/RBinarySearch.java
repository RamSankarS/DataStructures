public class RBinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch(arr, 6, 0, arr.length-1));
        
    }

    static boolean BinarySearch(int[] arr,int target,int start,int end){
        if(start > end) return false;
        int mid = start + (end-start)/2;
        if(arr[mid] == target) return true;
        if(arr[mid] > target) return BinarySearch(arr, target, start, mid-1);
        return BinarySearch(arr, target, mid+1, end);
    }
}