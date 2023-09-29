public class RLinearSearch{
    public static void main(String[] args){
        int[] arr = {4,2,1,10,20,3,4,5};
        System.out.print(LinearSearch(arr,10,0));
    }

    static boolean LinearSearch(int[] arr,int target,int index){
        if(index == arr.length) return false;
        return arr[index] == target || LinearSearch(arr,target,index+1);
    }
}