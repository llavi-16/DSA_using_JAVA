class Solution2 {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                max = Math.max(max, arr[i + j]);
            }

            res.add(max);
        }
        return res;
    }
}