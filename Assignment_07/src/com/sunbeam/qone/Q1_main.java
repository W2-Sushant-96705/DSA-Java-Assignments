package com.sunbeam.qone;

public class Q1_main {
    public static void main(String[] args) {
        GraphList g = new GraphList(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.printGraph();
    }
}