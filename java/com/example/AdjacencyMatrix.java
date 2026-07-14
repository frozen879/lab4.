package com.example;

public class AdjacencyMatrix {

    private static class Vertex {
        private String label;

        public Vertex(String label) {
            this.label = label;
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

    // 1 means connected, 0 means not connected
    private int[][] matrix = {
        // FH BH L  AA AB C  P1 P2
        {  0, 1, 1, 0, 0, 0, 0, 0 }, // FH
        {  1, 0, 0, 1, 0, 1, 0, 0 }, // BH
        {  1, 0, 0, 1, 0, 0, 1, 0 }, // L
        {  0, 1, 1, 0, 1, 0, 0, 0 }, // AA
        {  0, 0, 0, 1, 0, 1, 1, 0 }, // AB
        {  0, 1, 0, 0, 1, 0, 0, 0 }, // C
        {  0, 0, 1, 0, 1, 0, 0, 1 }, // P1
        {  0, 0, 0, 0, 0, 0, 1, 0 }  // P2
    };
}