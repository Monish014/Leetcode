class Solution {
    public int totalMoney(int n) {
        int[] arr = new int[n];

        int week = 1;
        int idx = 0;

        while (idx < n) {
            for (int i = 0; i < 7 && idx < n; i++) {
                arr[idx++] = week + i;
            }
            week++;
        }

        int a = 0;
        int k = 0;

        while (k < n) {
            a += arr[k];
            k++;
        }

        return a;
    }
}