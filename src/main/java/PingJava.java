import java.util.ArrayList;
import java.util.List;

public class PingJava {

  public List<Object> runPingJava(int countTo) {
    List<Object> result = new ArrayList<Object>();
    for (int i = 1; i <= countTo; i++){
    result.add(i);
  }
  return result;
  }
}
