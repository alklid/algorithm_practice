package alklid.algorithm;

public class a_00001 {
    /*
    * 이진탐색(binary search)
      - 실행시간은 빅오 표기법을 사용
        - O(log n) : 로그시간, binary search
        - O(n) : 선형시간, simple search
        - O(n * log n) : quick sort
        - O(n*n) : selection sort
        - O(n!) : traveling salesperson problem
    */

    private int binary_search(int[] list, int item) {
        int low, mid, high, guess;

        low = 0;
        high = list.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = list[mid];

            if (guess == item)
                return mid;

            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] arg) {
        a_00001 test = new a_00001();

        System.out.println(test.binary_search(new int[]{1,2,3,4,5}, 3));
        System.out.println(test.binary_search(new int[]{1,3,5,7,9}, -1));
    }
}
