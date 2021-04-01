package pl.thrathor.challenge.polyarea;

import java.util.Scanner;

public class InputProcessor {

    public static Polygon readInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("How many vertices? : ");

        int vertices = in.nextInt();
        if (vertices < 1) {
            System.out.println("Vertices number must be greater than zero");
            System.exit(0);
        }

        Coordinate[] c = new Coordinate[vertices];
        for (int i = 0; i < vertices; i++) {
            System.out.print("Point " + (i + 1) + " x: ");
            int x = in.nextInt();
            System.out.print("Point " + (i + 1) + " y: ");
            int y = in.nextInt();

            c[i] = new Coordinate(x, y);
            System.out.println("Point " + (i + 1) + ": (" + x + "," + y + ")\n");
        }
        return new Polygon(c);
    }

}
