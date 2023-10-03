public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4,1,2,5,1,2,5,10,19,20,30};
        int target = 10;
        System.out.println(linearSearch(arr,target));
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
}