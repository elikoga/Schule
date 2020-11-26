/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minotaurus;

import dijkstra.graph.Graph;
import dijkstra.graph.Edge;
import dijkstra.graph.Vertex;
import abiturklassen2018.linear.List;
import abiturklassen2018.linear.Stack;
import abiturklassen2018.linear.Queue;

/**
 *
 * @author NB
 */
public class Minotaurus {

    private Graph graph;
    private Edge kante;

    public Minotaurus() {
        graph = new Graph();
        graph.addVertex(new Vertex("gelb"));
        graph.addVertex(new Vertex("gruen"));
        graph.addVertex(new Vertex("lila"));
        graph.addVertex(new Vertex("blau"));
        graph.addVertex(new Vertex("rot"));
        graph.addVertex(new Vertex("weiss"));
        graph.addEdge(
                new Edge(graph.getVertex("gelb"), graph.getVertex("lila"), 69)
        );
        graph.addEdge(
                new Edge(graph.getVertex("gelb"), graph.getVertex("rot"), 10)
        );
        graph.addEdge(
                new Edge(graph.getVertex("lila"), graph.getVertex("gruen"), 35)
        );
        graph.addEdge(
                new Edge(graph.getVertex("lila"), graph.getVertex("blau"), 22)
        );
        graph.addEdge(
                new Edge(graph.getVertex("rot"), graph.getVertex("gruen"), 22)
        );
        graph.addEdge(
                new Edge(graph.getVertex("rot"), graph.getVertex("weiss"), 79)
        );
        graph.addEdge(
                new Edge(graph.getVertex("blau"), graph.getVertex("gruen"), 62)
        );
        graph.addEdge(
                new Edge(graph.getVertex("gruen"), graph.getVertex("weiss"), 51)
        );
    }

    public String graphToString() {
        List<Vertex> vertices = graph.getVertices();
        String outputString = "";
        for (vertices.toFirst(); vertices.hasAccess(); vertices.next()) {
            Vertex vertex = vertices.getContent();
            outputString += vertex.getID() + ": ";

            List<Vertex> neighbors = graph.getNeighbours(vertex);
            for (neighbors.toFirst(); neighbors.hasAccess(); neighbors.next()) {
                outputString += neighbors.getContent().getID() + ", ";
            }

            outputString += ";\n";
        }

        return outputString;
    }

    public String dijkstra(String startknotenSTR, String zielknotenSTR) {
        return "";
    }

    public String tiefensuche(String startknotenSTR, String zielknotenSTR) {
        System.out.println("tiefensuche(" + startknotenSTR
                + ", " + zielknotenSTR + ")");

        if (startknotenSTR.equals(zielknotenSTR)) {
            return zielknotenSTR;
        }

        Vertex startVertex = graph.getVertex(startknotenSTR);
        startVertex.setMark(true);

        List<Vertex> unmarkedNeighbors = new List<>();
        appendUnmarkedNeighborsOfVertex(startVertex, unmarkedNeighbors);
        for (unmarkedNeighbors.toFirst(); unmarkedNeighbors.hasAccess(); unmarkedNeighbors.next()) {
            Vertex neighbor = unmarkedNeighbors.getContent();
            String restPath = tiefensuche(neighbor.getID(), zielknotenSTR);
            if (!restPath.equals("")) {
                return startVertex.getID() + ":" + restPath;
            }
        }

        return "";
    }

    public String breitensuche(String startknotenSTR, String zielknotenSTR) {

        return "";
    }

    public String bsIterativ(String startknotenSTR, String zielknotenSTR) {
        System.out.println("breitensuche(" + startknotenSTR
                + ", " + zielknotenSTR + ")");
        Queue<List<Vertex>> pathQueue = new Queue<>();
        List<Vertex> initPath = new List<>();
        initPath.append(graph.getVertex(startknotenSTR));
        pathQueue.enqueue(initPath);

        Vertex goalVertex = graph.getVertex(zielknotenSTR);

        for (List<Vertex> path; !pathQueue.isEmpty(); pathQueue.dequeue()) {
            path = pathQueue.front();
            path.toLast();
            Vertex currentVertex = path.getContent();
            currentVertex.setMark(true);

            if (goalVertex.equals(currentVertex)) {
                return pathToString(path);
            }

            List<Vertex> neighbors = new List<>();
            appendUnmarkedNeighborsOfVertex(currentVertex, neighbors);

            for (neighbors.toFirst(); neighbors.hasAccess(); neighbors.next()) {
                List<Vertex> newPath = new List<>();
                Vertex neighbor = neighbors.getContent();
                copyList(path, newPath);
                newPath.append(neighbor);
                pathQueue.enqueue(newPath);
            }
        }
        return "";
    }

    String pathToString(List<Vertex> path) {
        String out = "";
        for (path.toFirst(); path.hasAccess(); path.next()) {
            out += path.getContent().getID() + ":";
        }
        return out;
    }

    void copyList(List<Vertex> from, List<Vertex> to) {
        to.toFirst();
        for (from.toFirst(); from.hasAccess(); from.next()) {
            to.append(from.getContent());
        }
    }

    void appendUnmarkedNeighborsOfVertex(Vertex vertex, List<Vertex> vertexList) {
        List<Vertex> neighbors = graph.getNeighbours(vertex);
        Vertex neighbor = null;
        for (neighbors.toFirst(); neighbors.hasAccess(); neighbors.next()) {
            neighbor = neighbors.getContent();
            if (!neighbor.isMarked()) {
                vertexList.append(neighbor);
            }
        }
    }

    private String tsIterativ(String startknotenSTR, String zielknotenSTR) {

        return "";
    }

    private String tsRekursiv(String startknotenSTR, String zielknotenSTR) {

        return "";
    }

    public boolean hatEulerweg() {
        List<Vertex> vertices = graph.getVertices();
        vertices.toFirst();

        int notEvenVerticesCount = 0;
        for (vertices.toFirst(); vertices.hasAccess(); vertices.next()) {
            Vertex vertex = vertices.getContent();
            List<Vertex> neighbors = graph.getNeighbours(vertex);

            int length = 0;
            for (neighbors.toFirst(); neighbors.hasAccess(); neighbors.next()) {
                length++;
            }
            if (length % 2 == 1) {
                notEvenVerticesCount++;
            }
        }
        return (notEvenVerticesCount == 0 || notEvenVerticesCount == 2);
    }
}
