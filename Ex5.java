public class Ex5 {

    public static int MaxSousTableau(int[] t) {
        if (t == null || t.length == 0) {
System.out.print("tableau invalide");        }

        int currentSum = t[0];
        int maxSum = t[0];

        for (int i = 1; i < t.length; i++) {
            currentSum = Math.max(t[i], currentSum + t[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("=== Jeux de tests ===\n");
        int[] t1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {-2, -1, 3, 4, -5};
        System.out.println(MaxSousTableau(t1));
        System.out.println(MaxSousTableau(t2));
        System.out.println(MaxSousTableau(t3));




        
        }

}