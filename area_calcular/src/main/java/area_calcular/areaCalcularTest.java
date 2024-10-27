package area_calcular;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AreaCalcularTest {

    areaCalcular calculator = new areaCalcular();

    @Test
    public void testAreaCircle() {
        assertEquals(Math.PI * 4, calculator.areaCircle(2), 0.01, "El área del círculo con radio 2 debería ser 4*PI");
        assertEquals(0, calculator.areaCircle(0), 0.01, "El área del círculo con radio 0 debería ser 0");
        assertThrows(IllegalArgumentException.class, () -> calculator.areaCircle(-1), "Debería lanzar excepción para radio negativo");
    }

    @Test
    public void testAreaSquare() {
        assertEquals(16, calculator.areaSquare(4), 0.01, "El área del cuadrado con lado 4 debería ser 16");
        assertEquals(0, calculator.areaSquare(0), 0.01, "El área del cuadrado con lado 0 debería ser 0");
        assertThrows(IllegalArgumentException.class, () -> calculator.areaSquare(-1), "Debería lanzar excepción para lado negativo");
    }

    @Test
    public void testAreaRectangle() {
        assertEquals(20, calculator.areaRectangle(4, 5), 0.01, "El área del rectángulo 4x5 debería ser 20");
        assertEquals(0, calculator.areaRectangle(0, 5), 0.01, "El área del rectángulo con ancho 0 debería ser 0");
        assertThrows(IllegalArgumentException.class, () -> calculator.areaRectangle(-1, 5), "Debería lanzar excepción para ancho negativo");
    }

    @Test
    public void testAreaTriangle() {
        assertEquals(10, calculator.areaTriangle(4, 5), 0.01, "El área del triángulo 4x5 debería ser 10");
        assertEquals(0, calculator.areaTriangle(0, 5), 0.01, "El área del triángulo con base 0 debería ser 0");
        assertThrows(IllegalArgumentException.class, () -> calculator.areaTriangle(-1, 5), "Debería lanzar excepción para base negativa");
    }
}
