package com.algorithms.searching.traversals.graph;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addEdge(0, 3);
        graph.addEdge(0, 1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,0);
        graph.addEdge(2,4);
        graph.addEdge(2,0);
        graph.addEdge(2,1);
        graph.addEdge(3,0);
        Map.Entry<Vertex, ArrayList<Vertex>> firstEntry = graph.adjVertices.entrySet().iterator().next();
        Vertex vertex = firstEntry.getKey();
        graph.BFS(vertex);
        System.out.println();
        graph.DFS(vertex);
    }


}
