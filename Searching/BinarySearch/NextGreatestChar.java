public class NextGreatestChar {
    public static void main(String[] args){
        char[] arr = {'j','k','z'};
        char character = 'p';
        System.out.println(nextGreatestLetter(arr,character));

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
