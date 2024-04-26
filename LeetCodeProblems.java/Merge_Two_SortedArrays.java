import java.util.*;

public class Merge_Two_SortedArrays {

    public static void sortMergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        for (; j >= 0; j--) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j];
            }
        }
    }

    public static void main(String[] args) {

        int[] num1 = { 1, 3, 5, 7 };
        int[] num2 = { 2, 4, 6, 8 };
        int m = 4;
        int n = 4;

        int[] mergedArray = new int[m + n];

        System.arraycopy(num1, 0, mergedArray, 0, m);
        sortMergeArrays(mergedArray, m, num2, n);

        System.out.println(Arrays.toString(mergedArray));

    }
}
