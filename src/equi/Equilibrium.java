package equi;
	
public class Equilibrium {
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int l = arr.length;

        // Loop through every index
        for (int i = 0; i < l; i++) {
            int leftSum = 0, rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < l; j++) {
                rightSum += arr[j];
            }

            // Check if equilibrium index
            if (leftSum == rightSum) {
                System.out.println("Equilibrium index is: " + i);
            }
        }
    }
}
