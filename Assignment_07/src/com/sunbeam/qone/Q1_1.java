package com.sunbeam.qone;

class GraphMatrix {
    int vertices;
    int[][] matrix;

    GraphMatrix(int v) {
        vertices = v;
        matrix = new int[v][v];
    }

    void addEdge(int src, int dest) {
        matrix[src][dest] = 1;
        matrix[dest][src] = 1; // for undirected graph
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}