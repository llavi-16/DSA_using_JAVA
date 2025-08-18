class Continue{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Skip the rest of the loop when i is 5
            }
            System.out.println("Current value of i: " + i);
        }
}
}