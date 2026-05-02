package com.sunbeam.qthree;

void DFS(int start) {
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
    }

    void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }