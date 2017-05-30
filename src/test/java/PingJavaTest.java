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

  @Test
  public void runPingJava_countToGivenNumber_ArrayList(){
    PingJava testPingJava = new PingJava();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    assertEquals(expectedOutput, testPingJava.runPingJava(2));
  }

  @Test
  public void runPingJava_replaceMultiplesOf3_ArrayList() {
    PingJava testPingJava = new PingJava();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    expectedOutput.add("Ping");
    assertEquals(expectedOutput, testPingJava.runPingJava(3));
  }

  @Test
  public void runPingJava_replaceMultiplesOf5_ArrayList() {
    PingJava testPingJava = new PingJava();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    expectedOutput.add("Ping");
    expectedOutput.add(4);
    expectedOutput.add("Pong");
    assertEquals(expectedOutput, testPingJava.runPingJava(5));
  }

  @Test
  public void runPingJava_replaceMultiplesOf15_ArrayList() {
    PingJava testPingJava = new PingJava();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    expectedOutput.add("Ping");
    expectedOutput.add(4);
    expectedOutput.add("Pong");
    expectedOutput.add("Ping");
    expectedOutput.add(7);
    expectedOutput.add(8);
    expectedOutput.add("Ping");
    expectedOutput.add("Pong");
    expectedOutput.add(11);
    expectedOutput.add("Ping");
    expectedOutput.add(13);
    expectedOutput.add(14);
    expectedOutput.add("Ping Pong");
    assertEquals(expectedOutput, testPingJava.runPingJava(15));

  }

}
