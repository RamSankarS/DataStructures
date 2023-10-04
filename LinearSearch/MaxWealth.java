public class MaxWealth {
    public static void main(String[] args) {
        int[][] wealth = {{40,50,20},{30,400,80},{500,0,0}};
        System.out.println(maximumWealth(wealth));
    }
    static int maximumWealth(int[][] accounts) {
        int[] sumArray = new int[accounts.length];
        int sum;
        for (int row = 0; row < accounts.length; row++) {
            sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            sumArray[row] = sum;
        }
        return max(sumArray);
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int ele : arr){
            if(max < ele) max = ele;
        }
        return max;
    }
}
