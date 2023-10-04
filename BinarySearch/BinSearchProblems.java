public class BinSearchProblems {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,11,13,15,19,23};
        int target = 14;
        System.out.println(Ceiling(arr,target));
    }

//Q1 -> Ceiling of a number
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
            else return mid;
        }
        return start;
    }
//Q2 -> 744 LeetCode.
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int mid;
        while(start <= end){
            mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}

