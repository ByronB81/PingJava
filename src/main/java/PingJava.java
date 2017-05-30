import java.util.ArrayList;
import java.util.List;

public class PingJava {

  public List<Object> runPingJava(int countTo) {
    List<Object> result = new ArrayList<Object>();
    for (int i = 1; i <= countTo; i++){
      if (i % 3 == 0 && i % 5 == 0){
        result.add("Ping Pong");
      } else if (i % 3 == 0) {
        result.add("Ping");
      } else if (i % 5 == 0){
        result.add("Pong");
      } else {
      result.add(i);
      }
    }
    return result;
  }
}
