import java.util.*;
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4,1,2,5,1,2,5,10,19,20,30};
        int[][] arr2 = {{4,5,6},{6,7,9},{30,20,99}};
        int target = 30;
        System.out.println(linearSearch(arr,target));
        System.out.println(minSearch(arr));
        System.out.println(Arrays.toString(search2DArray(arr2,target)));
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target) return index;
        }
        return -1;
    }

//***************Basic Questions****************

    static int minSearch(int[] arr){
        int min = arr[0];
        for(int element : arr){
            if(min > element) {
                min = element;
            }
        }
        return min;
    }

    static int[] search2DArray(int[][] arr, int target){
        for(int outerIndex = 0; outerIndex < arr.length; outerIndex++){
            for(int innerIndex = 0; innerIndex < arr[outerIndex].length; innerIndex++){
                if(arr[outerIndex][innerIndex] == target){
                    int[] result = {outerIndex,innerIndex};
                    return result;
                }
            }
        }
        return new int[0];
    }
}