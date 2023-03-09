import java.util.ArrayList;
public class SortedList {
    private ArrayList<Integer> data;
    public SortedList(){
        data = new ArrayList<>();
    }

    public int get(int index) {
        return data.get(index);
    }
    public void add(int value){
        data.add(value);
    }

    public int size(){
        return data.size();
    }
}
