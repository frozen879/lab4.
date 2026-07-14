package com.example;

public class AdjacencyList {

    private static class Vertex {
        private String label;

        public Vertex(String label) {
            this.label = label;
        }
    }

    private static class Edge {
        private int endVertex;

        public Edge(int endVertex) {
            this.endVertex = endVertex;
        }
    }

    // 0 FH, 1 BH, 2 L, 3 AA, 4 AB, 5 C, 6 P1, 7 P2
    private Vertex[] vertices = {
        new Vertex("FH"),
        new Vertex("BH"),
        new Vertex("L"),
        new Vertex("AA"),
        new Vertex("AB"),
        new Vertex("C"),
        new Vertex("P1"),
        new Vertex("P2")
    };

    private Edge[][] adjacencyList = {
        {new Edge(1), new Edge(2)},                // FH: BH, L
        {new Edge(0), new Edge(3), new Edge(5)},  // BH: FH, AA, C
        {new Edge(0), new Edge(3), new Edge(6)},  // L: FH, AA, P1
        {new Edge(1), new Edge(2), new Edge(4)},  // AA: BH, L, AB
        {new Edge(3), new Edge(5), new Edge(6)},  // AB: AA, C, P1
        {new Edge(1), new Edge(4)},               // C: BH, AB
        {new Edge(2), new Edge(4), new Edge(7)},  // P1: L, AB, P2
        {new Edge(6)}                             // P2: P1
    };
}