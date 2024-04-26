public class Two_Sum_Array {

    public static int[] findSumOf(int[] num, int target) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {

                if (num[i] + num[j] == target) {
                    System.out.println(i + j);
                }

                return new int[] { i, j };

            }
        }

        return new int[] {};

    }

    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4 };

        findSumOf(num, 4);

    }

}
