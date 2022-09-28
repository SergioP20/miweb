import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testCorresponsal{
    @Test
    public void Test() {
        assertEquals( "Hello my love, my dear Jhonny", Corresponsal.menssage_A("Johnny"));
        assertEquals("Hello Sergio", Corresponsal.menssage_A("Sergio"));
        assertEquals("Hello Fernanda", Corresponsal.menssage_A("Fernanda"));

    }
}
