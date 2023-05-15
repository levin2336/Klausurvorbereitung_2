package main;

import abiturklassen.Vertex;

public class Main {
    public static void main(String[] args) {
        Graphs test = new Graphs();
        Vertex duesseldorf = new Vertex("duesseldorf");
        Vertex koeln = new Vertex("koeln");
        Vertex wuppertal = new Vertex("wuppertal");
        Vertex haan = new Vertex("haan");
        Vertex solingen = new Vertex("solingen");
        Vertex venlo = new Vertex("venlo");
        Vertex frankfurt = new Vertex("frankfurt");

        test.addCity(duesseldorf);
        test.addCity(koeln);
        test.addCity(wuppertal);
        test.addCity(haan);
        test.addCity(solingen);
        test.addCity(venlo);
        test.addCity(frankfurt);

        test.addConnection(duesseldorf,wuppertal);
        test.addConnection(duesseldorf,koeln);
        test.addConnection(haan,solingen);
        test.addConnection(solingen,wuppertal);
        test.addConnection(frankfurt,koeln);
        test.addConnection(duesseldorf,venlo);

        test.DFS(wuppertal);
    }
}