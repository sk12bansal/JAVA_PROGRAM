package program.DP;

class MinimumCost {
    // Function to return minimum
// cost to reach destination
    static int minCost(int N, int P, int Q) {
        // Initialize cost to 0
        int cost = 0;

        // going backwards until we
        // reach initial position
        while (N > 0) {

           // System.out.println(N +" ");

            if ((N & 1) > 0) {
                cost += P;
                N--;
            } else {
                int temp = N / 2;

                // if 2*X jump is
                // better than X+1
               // System.out.print(temp +" ");
                if (temp * P > Q)
                    cost += Q;
                    // if X+1 jump is better
                else
                    cost += P * temp;

                System.out.print(cost +" ");

                N /= 2;
            }
        }

        // return cost
        return cost;
    }

    // Driver program
    public static void main(String[] args) {
        int N = 9, P = 5, Q = 1;

        System.out.println(minCost(N, P, Q));
    }
}
// This code is contributed by mits
