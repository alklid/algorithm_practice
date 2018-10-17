package alklid.algorithm;

import java.util.Arrays;

public class a_00002 {
    /*
        * 배열(array), 연결리스트(linked list)
          - 배열
            - 어떤 원소를 바로 찾아갈 수 있다.
            - 원소의 검색 장점
            - 읽기 : O(1) / 삽입 : O(n) / 삭제 : O(n)
          - 연결리스트
            - 해당 원소까지 처음부터 읽어가야 한다.
            - 모든 원소의 값을 한 번에 읽어야 한다면 배열보다는 좋다.
            - 원소의 추가 장점
            - 읽기 : O(n) / 삽입 : O(1) / 삭제 : O(1)
        * 선택정렬(selected sort) : O(n*n)
          - 예) 높은 순위정렬
    */
    private int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // 자리를 변경
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        return arr;
    }

    public static void main(String args[]) {
        a_00002 test = new a_00002();
        int[] selectedSortArr = test.selectionSort(new int[]{5,3,6,2,10});
        System.out.println(Arrays.toString(selectedSortArr));

        selectedSortArr = test.selectionSort(new int[]{5,8,2,7,9,1,10});
        System.out.println(Arrays.toString(selectedSortArr));
    }
}
