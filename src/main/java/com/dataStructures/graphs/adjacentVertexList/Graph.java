package com.dataStructures.graphs.adjacentVertexList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<Vertex, List<Vertex>>();

    }

    public void addVertex(String label){
        //add new vertex with new arraylist
        this.adjVertices.putIfAbsent(new Vertex(label),new ArrayList<>());
    }

    public void removeVertex(String label){
        Vertex v = new Vertex(label);
        //iterate through the list of each vertex if an edge
        // is present or not.
        // If the edge is present, then
        // delete the vertex in the same way as delete
        // is performed in a linked list
        this.adjVertices.values().stream().forEach(e -> e.remove(v));
        this.adjVertices.remove(new Vertex(label));
    }

    public void addEdge(String label1,String label2){
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        //add to the list of each vertex its adjecent vertex

        List<Vertex> l1 = this.adjVertices.computeIfAbsent(v1, k -> new ArrayList<Vertex>());
        l1.add(v2);
        List<Vertex> l2 = this.adjVertices.computeIfAbsent(v2, k -> new ArrayList<Vertex>());
        l1.add(v1);

    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    //Getting list of vertices for a vertex
    public List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    public String printGraph() {
        StringBuffer sb = new StringBuffer();
        for(Vertex v : adjVertices.keySet()) {
            sb.append(v);
            sb.append(adjVertices.get(v));
        }
        return sb.toString();
    }






}
