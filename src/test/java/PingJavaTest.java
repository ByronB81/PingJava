import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingJavaTest {

  @Test
  public void runPingJava_countUpToOne_ArrayList() {
    PingJava testPingJava = new PingJava();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    assertEquals(expectedOutput, testPingJava.runPingJava(1));
  }

}
