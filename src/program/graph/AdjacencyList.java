package program.graph;

import java.util.LinkedList;

public class AdjacencyList {

    static class Graph {
        int vertices;
        LinkedList<Integer>[] adjListArray;

        Graph(int v){

            this.vertices = v;

            this.adjListArray = new LinkedList[vertices];

            for(int i=0;i<vertices;i++){
                adjListArray[i] = new LinkedList<>();
            }

        }

    }
}
