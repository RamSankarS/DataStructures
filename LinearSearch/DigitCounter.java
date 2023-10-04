//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//https://leetcode.com/problems/richest-customer-wealth/
public class DigitCounter {
    public static void main(String[] args) {
        int[] arr = {42,22,33,300,400,560,789};
        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] arr){
        int count = 0;
        for(int element : arr){
            if(digitCounter(element)%2 == 0) count++;
        }
        return count;
    }
    static int digitCounter(int num){
        int digitCount = 0;
        while(num!=0){
            digitCount++;
            num = num/10;
        }
        return digitCount;
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