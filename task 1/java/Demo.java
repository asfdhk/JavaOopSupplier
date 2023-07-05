import java.util.function.Supplier;

public class Demo implements Supplier<String> {

    private String text;
    public Demo(String text){
        this.text = text;
    }

    @Override
    public String get() {
        String a ="";
        for (int i = 0;i<text.length();i++){
            a +=text.substring(i,i+1) +" ";
        }
        return a;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
