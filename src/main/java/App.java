import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter a number");
    String userNumber = console.readLine();
    int intUserNum = Integer.parseInt(userNumber);

    PingJava execute = new PingJava();
    List<Object> pingJavaResults = execute.runPingJava(intUserNum);
    System.out.println(pingJavaResults); 
  }
}
