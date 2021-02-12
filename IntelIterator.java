import java.util.ArrayList;

public class IntelIterator implements Iterator {
    ArrayList<ProcessorItem> items;
    int pos = 0;

    public IntelIterator(ArrayList<ProcessorItem> items){
        this.items = items;
        }

    public Object next() {
        ProcessorItem processorItem = items.get(pos);
        pos += 1;
        return processorItem;

    }
    public boolean hasNext(){
        return pos < items.size() && items.get(pos) != null;
    }
}


