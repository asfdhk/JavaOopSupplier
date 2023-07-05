import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("asd","Gkjjk","Sd","ef"));

        Predicate<String> pre=(a)->{
            char n = a.charAt(0);
          if (Character.isUpperCase(n)){
              return true;
          }else {
              return false;
          }
        };
        Demo demo = new Demo(list,pre);

        String value;
        while ((value = demo.get()) != null) {
            System.out.println(value);
        }
    }
}
