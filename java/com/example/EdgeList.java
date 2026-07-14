package com.example;
public class EdgeList {

    private static class Vertex {
        private String label;

        public Vertex(String label) {
            this.label = label;
        }
    }

    private static class Edge {
        private int startVertex;
        private int endVertex;

        public Edge(int startVertex, int endVertex) {
            this.startVertex = startVertex;
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

    private Edge[] edges = {
        new Edge(0, 1), // FH - BH
        new Edge(1, 5), // BH - C
        new Edge(0, 2), // FH - L
        new Edge(1, 3), // BH - AA
        new Edge(5, 4), // C - AB
        new Edge(2, 3), // L - AA
        new Edge(3, 4), // AA - AB
        new Edge(2, 6), // L - P1
        new Edge(4, 6), // AB - P1
        new Edge(6, 7)  // P1 - P2
    };
}