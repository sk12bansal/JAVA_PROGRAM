/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class challenge {
    static class Graph{
        private int V;
        private LinkedList<Integer> adj[];

        Graph(int v){
            V= v;
            adj = new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i] = new LinkedList();
            }
        }


        void addEdge(int v,int w){
            adj[v].add(w);
        }

        Boolean isReachable(int s,int d){
            LinkedList<Integer> temp;
            boolean [] visited = new boolean[V];
            LinkedList<Integer> q = new LinkedList<>();
            visited[s] = true;
            q.add(s);

            Iterator<Integer> i;
            while(q.size()!=0){
                s = q.poll();
                int n;
                i = adj[s].listIterator();
                while(i.hasNext()){
                    n = i.next();
                    if(n==d){
                        return true;
                    }

                    if(!visited[n]){
                        visited[n] = true;
                        q.add(n);
                    }
                }
            }
            return false;
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] arr = new int[t];
        for(int i=0;i<t;i++)
            arr[i] = sc.nextInt();
        int pedge = sc.nextInt();
        Graph g = new Graph(4);
        for(int i=0;i<pedge;i++){
            String v = sc.nextLine();
            //int w = sc.nextInt();
            System.out.println(v);
           // g.addEdge(v,w);
        }

        int follower = sc.nextInt();
        int following = sc.nextInt();

        if(g.isReachable(follower,following)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
