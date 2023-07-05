import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo implements Supplier<String> {

    private List<String> list;
    private Predicate<String> pred;
    private int a;

    public Demo(List<String> list,Predicate<String> pred){
        this.list = list;
        this.pred = pred;
        this.a = 0;
    }

    @Override
    public String get() {
        while(a<list.size()){
            String i = list.get(a);
            a++;
            if (pred.test(i)){
                return i;
            }
        }
        return null;
    }

    public List<String> getList() {
        return list;
    }

    public int getA() {
        return a;
    }

    public Predicate<String> getPred() {
        return pred;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setPred(Predicate<String> pred) {
        this.pred = pred;
    }
}
