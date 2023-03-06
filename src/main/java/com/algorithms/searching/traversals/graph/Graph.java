package com.algorithms.searching.traversals.graph;


import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Graph {
    Map<Vertex, ArrayList<Vertex>> adjVertices;


    public Graph() {
        this.adjVertices = new HashMap<Vertex, ArrayList<Vertex>>();
    }

    public void addVertex(int data){
        Vertex v = new Vertex(data);

        adjVertices.putIfAbsent(new Vertex(data),new ArrayList<Vertex>());

    }
    public void removeVertex(int data){
        Vertex v = new Vertex(data);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(data));
    }
    void addEdge(int data1, int data2) {
        Vertex v1 = new Vertex(data1);
        Vertex v2 = new Vertex(data2);
        this.adjVertices.forEach((k,v) -> {
            if(k.data == v1.data){
                v.add(v2);
            }
        });
        this.adjVertices.forEach((k,v) -> {
            if(k.data == v2.data){
                v.add(v1);
            }
        });

    }

    void removeEdge(int data1, int data2) {
        Vertex v1 = new Vertex(data1);
        Vertex v2 = new Vertex(data2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }



    public List<Vertex> getAdjVertices(int data) {
        List<Vertex> list = new ArrayList<Vertex>();
        this.adjVertices.forEach((v,k) -> {
            if(v.data == data){
                for (Vertex vertex : k) {
                    list.add(vertex);
                }
            }
        });
        return list;
    }

    //DFS
//A standard DFS implementation puts each vertex of the graph
// into one of two categories:
//
//Visited
//Not Visited
//The purpose of the algorithm is to mark
// each vertex as visited while avoiding cycles.
//
//The DFS algorithm works as follows:
//
//Start by putting any one of the graph's vertices on top of a stack.
//Take the top item of the stack and add it to the visited list.
//Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the top of the stack.
//Keep repeating steps 2 and 3 until the stack is empty.

    public void DFS(Vertex root){
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] isVisited = new boolean[adjVertices.size()];
        stack.push(root.data);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (!isVisited[current]) {
                isVisited[current] = true;
                System.out.print(current + " ");
                System.out.print(" ,");
                for (Vertex dest : this.getAdjVertices(current)) {
                    if (!isVisited[dest.data])
                        stack.push(dest.data);
                }
            }
        }
    }
//popping of elements from the queue, takes place from the front in the sequential manner which is the function of the queue i.e, First In First Out. Therefore,
// we say that queue data structure is used in BFS for keeping track of visited vertices in the graph.

    public void BFS(Vertex root){
        ArrayList<Integer> visited = new ArrayList<>();
        Queue<Vertex> queue = new LinkedList<>();
        // Mark the current node as visited and enqueue it
        queue.add(root);
        visited.add(root.data);
        while (!queue.isEmpty())
        {
            Vertex vertex  = queue.poll();
            System.out.print(vertex.data + " ");
            System.out.print(" ,");
            for(Vertex v: this.getAdjVertices(vertex.data)){
                if(!visited.contains(v.data)){
                    visited.add(v.data);
                    queue.add(v);
                }
            }

        }
    }


}
