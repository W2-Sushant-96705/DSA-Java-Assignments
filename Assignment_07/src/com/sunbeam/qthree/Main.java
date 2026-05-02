    public static void main(String[] args) {
        GraphTraversal g = new GraphTraversal(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.print("BFS: ");
        g.BFS(0);

        System.out.println();

        System.out.print("DFS: ");
        g.DFS(0);
    }
