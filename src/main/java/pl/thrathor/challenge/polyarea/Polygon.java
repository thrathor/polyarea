package pl.thrathor.challenge.polyarea;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Polygon {
    private Coordinate[] coords;

    public float getArea() {
        if (coords.length < 3)
            return 0;
        float left = 0;
        float right = 0;
        for (int i = 0; i < coords.length - 1; i++) {
            left += coords[i].x * coords[i + 1].y;
            right += coords[i].y * coords[i + 1].x;
        }
        left += coords[coords.length - 1].x * coords[0].y;
        right += coords[coords.length - 1].y * coords[0].x;
        return Math.abs(left - right) / 2;
    }
}
