package main;

import abiturklassen.*;

public class Graphs {
    Graph graph = new Graph();

    public void addCity(Vertex newCity){
        graph.addVertex(newCity);
    }

    public void addConnection(Vertex city1, Vertex city2){
        graph.addEdge(new Edge(city1,city2,1));
    }

    public void DFS(Vertex start){
        System.out.println(start.getID());
        start.setMark(true);

        List<Vertex> neigbors = graph.getNeighbours(start);
        neigbors.toFirst();
        while (neigbors.hasAccess()){
            if (!neigbors.getContent().isMarked()){
                DFS(neigbors.getContent());
            }
            neigbors.next();
        }
    }

    public void BFS(Vertex start){
        Queue<Vertex> queue =  new Queue<>();
        queue.enqueue(start);
        start.setMark(true);
        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.front();
            queue.dequeue();

            System.out.println(currentVertex.getID());
            List<Vertex> neighbors = graph.getNeighbours(currentVertex);
            neighbors.toFirst();
            while (neighbors.hasAccess()){
                Vertex neighborVertex = neighbors.getContent();
                if (!neighborVertex.isMarked()){
                    neighborVertex.setMark(true);
                    queue.enqueue(neighborVertex);
                }
                neighbors.next();
            }
        }
    }

    public Graph getGraph() {
        return graph;
    }
}
