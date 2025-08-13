class Solution {
    public void printGeeks(int n) {
        do{System.out.println("Geeksforgeeks");
        n--;
        }
        while(n>0);
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.printGeeks(5);
    }
}
