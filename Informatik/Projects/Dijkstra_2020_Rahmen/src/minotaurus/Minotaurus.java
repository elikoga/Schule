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
        graph.addEdge(new Edge(graph.getVertex("gelb"), graph.getVertex("lila"), 69));
        graph.addEdge(new Edge(graph.getVertex("gelb"), graph.getVertex("rot"), 10));
        graph.addEdge(new Edge(graph.getVertex("lila"), graph.getVertex("gruen"), 35));
        graph.addEdge(new Edge(graph.getVertex("lila"), graph.getVertex("blau"), 22));
        graph.addEdge(new Edge(graph.getVertex("rot"), graph.getVertex("gruen"), 22));
        graph.addEdge(new Edge(graph.getVertex("rot"), graph.getVertex("weiss"), 79));
        graph.addEdge(new Edge(graph.getVertex("blau"), graph.getVertex("gruen"), 62));
        graph.addEdge(new Edge(graph.getVertex("gruen"), graph.getVertex("weiss"), 51));
    }

    public String graphToString() {
        return "";
    }

    public String dijkstra(String startknotenSTR, String zielknotenSTR) {
        return "";
    }

    public String tiefensuche(String startknotenSTR, String zielknotenSTR) {
        return "";
    }

    public String breitensuche(String startknotenSTR, String zielknotenSTR) {
        return "";
    }

    private String bsIterativ(String startknotenSTR, String zielknotenSTR) {

        return "";
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
        for(vertices.toFirst(); vertices.hasAccess(); vertices.next()) {
            Vertex vertex = vertices.getContent();
            List<Vertex> neighbors = graph.getNeighbours(vertex);

            int length = 0;
            for(neighbors.toFirst(); neighbors.hasAccess(); neighbors.next()) {
                length++;
            }
            if (length % 2 == 1) {
                notEvenVerticesCount++;
            }
        }
        return (notEvenVerticesCount == 0 || notEvenVerticesCount == 2);
    }
}
