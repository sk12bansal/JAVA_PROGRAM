package program.DP;

import java.util.*;
import java.lang.*;

class MinimumNumberOfJumps {
    static class Node {
        int index;
        int dist;

        Node(int index, int dist) {
            this.index = index;
            this.dist = dist;
        }
    }

    static int minimumJump(int[] arr, int n) {
        Queue<Node> q = new LinkedList<>();
        Node node = new Node(0, 0);
        q.add(node);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int steps = -1;
        while (!q.isEmpty()) {
            Node tmp = q.peek();
            q.remove();

            int index = tmp.index;
            int dist = tmp.dist;
            if (index == n - 1) {
                steps = dist;
                break;
            }
            int jumps = arr[index];
            for (int i = 1; i <= jumps; i++) {
                if (n > index + i && !visited[index + i]) {
                    tmp = new Node(index + i, dist + 1);
                    q.add(tmp);
                    visited[index + i] = true;
                }
            }
        }
        return steps;

    }

    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int steps = minimumJump(arr, n);
            System.out.println(steps);
            t -= 1;
        }
    }
}