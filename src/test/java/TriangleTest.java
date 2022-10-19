import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void testCalculatePoint1(){
        assertEquals('A' ,triangle.calculatePoint(0.0, 2.0, 1.5));
    }

    @Test
    public void testCalculatePoint2(){}

    @Test
    public void testCalculatePoint3(){}

    @Test
    public void testCalculatePoint4(){}

    @Test
    public void testCalculatePoint5(){}

    @Test
    public void testCalculatePoint6(){}

    @Test
    public void testCalculatePoint7(){}

}
