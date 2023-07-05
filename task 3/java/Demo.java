import java.util.function.IntSupplier;

public class Demo implements IntSupplier {

    private int[] arr;

    public Demo (int[] arr){
        this.arr = arr;
    }

    @Override
    public int getAsInt() {
        int a = arr[arr.length-1];
        return a;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
