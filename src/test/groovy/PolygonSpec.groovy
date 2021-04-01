import pl.thrathor.challenge.polyarea.Coordinate
import pl.thrathor.challenge.polyarea.Polygon
import spock.lang.Specification

class PolygonSpec extends Specification {
    def "area of point should be 0"() {
        given:
        def coords = [new Coordinate(1, 2), new Coordinate(1, 2), new Coordinate(1, 2)] as Coordinate[]
        Polygon polygon = new Polygon(coords)
        when:
        float area = polygon.getArea()
        then:
        area == 0.0f
    }

    def "area of square 1x1 should be 1"() {
        given:
        def coords = [new Coordinate(0, 0), new Coordinate(0, 1), new Coordinate(1, 1), new Coordinate(1, 0)] as Coordinate[]
        Polygon polygon = new Polygon(coords)
        when:
        float area = polygon.getArea()
        then:
        area == 1.0f
    }

    def "area of polygon should be 45.5"() {
        given:
        def coords = [new Coordinate(4, 10), new Coordinate(9, 7), new Coordinate(11, 2), new Coordinate(2, 2)] as Coordinate[]
        Polygon polygon = new Polygon(coords)
        when:
        float area = polygon.getArea()
        then:
        area == 45.5f
    }
}
