package pl.thrathor.challenge.polyarea;

public class PolyArea {
    public static void main(String[] args) {
        Polygon polygon = InputProcessor.readInput();
        float area = polygon.getArea();
        System.out.printf("Polygon area: %.1f%n",area);
    }
}
