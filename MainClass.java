/************************
*
* Created and maintained
* by Allen Rocha
* For more information
* please visit:
* https://github.com/allenerocha
* 
* *********************/
import java.util.*;
public class MainClass {
  public static void main(String[] args) {
      Random random = new Random();
      Vector v = new Vector(random.nextDouble() * 20, random.nextDouble() * 20, random.nextDouble() * 20);
      Vector u = new Vector(random.nextDouble() * 20, random.nextDouble() * 20, random.nextDouble() * 20);
      VectorOperations operation = new VectorOperations();
      System.out.println(v.toString() + u.toString() + operation.Dot(v, u));
      System.out.println("\n\n");
      System.out.println(v.toString() + u.toString() + operation.Cross(v, u).toString());
  }
}
