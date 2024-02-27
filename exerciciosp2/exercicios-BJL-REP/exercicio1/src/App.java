public class App {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Somatório: " + sum);
    }
}
