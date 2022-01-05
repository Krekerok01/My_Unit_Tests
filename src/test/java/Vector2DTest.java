import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private Vector2D v1;

    @Before // We can use @BeforeClass. It is static
    public void createNewVector(){
        v1 = new Vector2D(); // action
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        // assertion
        // 1e-9 = 0.000...0001;
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(), EPS);
    }
    
    //можно заменить 2 метода на 1, но это не лучший вариант
//    @Test
//    public void newVectorShouldHaveZeroXAndZeroY(){
//        Assert.assertEquals(0, v1.getX(), EPS);
//        Assert.assertEquals(0, v1.getY(), EPS);
//    }
}
